package GroupsFTIT.KH_4_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ntu.DatabaseHelper;
import com.example.ntu.R;

public class KH_4_1_thu extends AppCompatActivity {

    private TextView lesson_time1,subject_name1,teacher_name1,address1,audience1;
    private TextView lesson_time2,subject_name2,teacher_name2,address2,audience2;
    private TextView lesson_time3,subject_name31,teacher_name31,address31,audience31;
    private TextView lesson_time4,subject_name41,teacher_name41,address41,audience41;

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh41_thu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        lesson_time1 = findViewById(R.id.lessontime1th);
        subject_name1 = findViewById(R.id.name1th);
        teacher_name1 = findViewById(R.id.teacher1th);
        audience1 = findViewById(R.id.aud1th);
        address1 = findViewById(R.id.address1th);

        lesson_time2 = findViewById(R.id.lessontime2th);
        subject_name2 = findViewById(R.id.name2th);
        teacher_name2 = findViewById(R.id.teacher2th);
        audience2 = findViewById(R.id.aud2th);
        address2 = findViewById(R.id.address2th);

        lesson_time3 = findViewById(R.id.lessontime31th);
        subject_name31 = findViewById(R.id.name31th);
        teacher_name31 = findViewById(R.id.teacher31th);
        audience31 = findViewById(R.id.aud31th);
        address31 = findViewById(R.id.address31th);

        lesson_time4 = findViewById(R.id.lessontime41th);
        subject_name41 = findViewById(R.id.name41th);
        teacher_name41 = findViewById(R.id.teacher41th);
        audience41 = findViewById(R.id.aud41th);
        address41 = findViewById(R.id.address41th);

        int id1=12, id2=13, id3=14, id4=15;

        String time1 = getLessonTime(id1);
        String subject1 = getSubject(id1);
        String teacher1 = getTeacher(id1);
        String addr1 = getAddress(id1);
        String aud1 = getAudience(id1);

        lesson_time1.setText(time1);
        subject_name1.setText(subject1);
        teacher_name1.setText(teacher1);
        audience1.setText("Аудиторія "+aud1);
        address1.setText(addr1);

        String time2 = getLessonTime(id2);
        String subject2 = getSubject(id2);
        String teacher2 = getTeacher(id2);
        String addr2 = getAddress(id2);
        String aud2 = getAudience(id2);

        lesson_time2.setText(time2);
        subject_name2.setText(subject2);
        teacher_name2.setText(teacher2);
        audience2.setText("Аудиторія "+aud2);
        address2.setText(addr2);

        String time3 = getLessonTime(id3);
        String subject31 = getSubject(id3);
        String teacher31 = getTeacher(id3);
        String addr31 = getAddress(id3);
        String aud31 = getAudience(id3);

        lesson_time3.setText(time3);
        subject_name31.setText(subject31);
        teacher_name31.setText(teacher31);
        audience31.setText("Аудиторія "+aud31);
        address31.setText(addr31);

        String time4 = getLessonTime(id4);
        String subject41 = getSubject(id4);
        String teacher41 = getTeacher(id4);
        String addr41 = getAddress(id4);
        String aud41 = getAudience(id4);

        lesson_time4.setText(time4);
        subject_name41.setText(subject41);
        teacher_name41.setText(teacher41);
        audience41.setText("Аудиторія "+aud41);
        address41.setText(addr41);
    }

    private String getLessonTime(int id){
        //виведення часу заняття з бази
        db = databaseHelper.open();
        String selection = "SELECT Classtime.time_class " +
                "FROM Schedule " +
                "JOIN Classtime ON Schedule.class_time_n=Classtime._id " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String lessTime ="";

        if(cursor.moveToFirst()){
            do{
                lessTime = cursor.getString(cursor.getColumnIndexOrThrow("time_class"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return lessTime;
    }

    private String getSubject(int id){
        //виведення назви предмету
        db = databaseHelper.open();

        String selection = "SELECT Subject.subject_name " +
                "FROM Schedule " +
                "JOIN Subject ON Schedule.subject_n=Subject._id " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String subName ="";

        if(cursor.moveToFirst()){
            do{
                subName = cursor.getString(cursor.getColumnIndexOrThrow("subject_name"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return subName;
    }

    private String getTeacher(int id){
        //виведення ПІБ викладача
        db = databaseHelper.open();

        String selection = "SELECT Teachers.teacher_name " +
                "FROM Schedule " +
                "JOIN Teachers ON Schedule.teacher_n=Teachers._id " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String teachName ="";

        if(cursor.moveToFirst()){
            do{
                teachName = cursor.getString(cursor.getColumnIndexOrThrow("teacher_name"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return teachName;
    }

    private String getAddress(int id){
        //виведення ПІБ викладача
        db = databaseHelper.open();

        String selection = "SELECT Corps.address_name " +
                "FROM Schedule " +
                "JOIN Corps ON Schedule.corps_n=Corps._id " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String address ="";

        if(cursor.moveToFirst()){
            do{
                address = cursor.getString(cursor.getColumnIndexOrThrow("address_name"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return address;
    }

    private String getAudience(int id){
        //виведення ПІБ викладача
        db = databaseHelper.open();

        String selection = "SELECT audience " +
                "FROM Schedule " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String aud ="";

        if(cursor.moveToFirst()){
            do{
                aud = cursor.getString(cursor.getColumnIndexOrThrow("audience"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return aud;
    }

    public void onClickMon(View view) {
        Intent clm = new Intent(this, KH_4_1_m.class);
        startActivity(clm);
    }

    public void onClickTue(View view) {
        Intent clm = new Intent(this, KH_4_1_tue.class);
        startActivity(clm);
    }

    public void onClickWen(View view) {
        Intent clm = new Intent(this, KH_4_1_w.class);
        startActivity(clm);
    }

    public void onClickThu(View view) {
        Intent clm = new Intent(this, KH_4_1_thu.class);
        startActivity(clm);
    }

    public void onClickFri(View view) {
        Intent clm = new Intent(this, KH_4_1_f.class);
        startActivity(clm);
    }
}