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

public class KH_4_1_m extends AppCompatActivity {

    private TextView lesson_time1,subject_name1,teacher_name1,address1,audience1;
    private TextView lesson_time2,subject_name2,teacher_name2,address2,audience2;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kn41m);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        lesson_time1 = findViewById(R.id.p1r1_lessontime1);
        subject_name1 = findViewById(R.id.p1r1_name1);
        teacher_name1 = findViewById(R.id.p1r1_teacher1);
        address1 = findViewById(R.id.p1r1_address1);
        audience1 = findViewById(R.id.p1r1_aud1);

        lesson_time2 = findViewById(R.id.p1r1_lessontime2);
        subject_name2 = findViewById(R.id.p1r1_name2);
        teacher_name2 = findViewById(R.id.p1r1_teacher2);
        address2 = findViewById(R.id.p1r1_address2);
        audience2 = findViewById(R.id.p1r1_aud2);

        int id1=1, id2=2;

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