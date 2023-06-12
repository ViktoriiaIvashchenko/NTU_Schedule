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

public class KH_4_1_tue extends AppCompatActivity {

    private TextView lesson_time1,subject_name1,teacher_name1,address1,audience1;
    private TextView lesson_time2,subject_name21,teacher_name21,address21,audience21;
    private TextView subject_name22,teacher_name22,address22,audience22;
    private TextView lesson_time3,subject_name31,teacher_name31,address31,audience31;
    private TextView subject_name32,teacher_name32,address32,audience32;

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh41tue);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        lesson_time1 = findViewById(R.id.lessontime1tue);
        subject_name1 = findViewById(R.id.name1tue);
        teacher_name1 = findViewById(R.id.teacher1tue);
        address1 = findViewById(R.id.address1tue);
        audience1 = findViewById(R.id.aud1tue);

        lesson_time2 = findViewById(R.id.lessontime21tue);
        subject_name21 = findViewById(R.id.name21tue);
        teacher_name21 = findViewById(R.id.teacher21tue);
        address21 = findViewById(R.id.address21tue);
        audience21 = findViewById(R.id.aud21tue);

        subject_name22 = findViewById(R.id.name22tue);
        teacher_name22 = findViewById(R.id.teacher22tue);
        address22 = findViewById(R.id.address22tue);
        audience22 = findViewById(R.id.aud22tue);

        lesson_time3 = findViewById(R.id.lessontime31tue);
        subject_name31 = findViewById(R.id.name31tue);
        teacher_name31 = findViewById(R.id.teacher31tue);
        address31 = findViewById(R.id.address31tue);
        audience31 = findViewById(R.id.aud31tue);

        subject_name32 = findViewById(R.id.name32tue);
        teacher_name32 = findViewById(R.id.teacher32tue);
        address32 = findViewById(R.id.address32tue);
        audience32 = findViewById(R.id.aud32tue);

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        int id1=3, id21=4, id22=5, id31=6, id32=7;

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

        String time2 = getLessonTime(id21);
        String subject21 = getSubject(id21);
        String teacher21 = getTeacher(id21);
        String addr21 = getAddress(id21);
        String aud21 = getAudience(id21);

        lesson_time2.setText(time2);
        subject_name21.setText(subject21);
        teacher_name21.setText(teacher21);
        audience21.setText("Аудиторія "+aud21);
        address21.setText(addr21);

        String subject22 = getSubject(id22);
        String teacher22 = getTeacher(id22);
        String addr22 = getAddress(id22);
        String aud22 = getAudience(id22);

        subject_name22.setText(subject22);
        teacher_name22.setText(teacher22);
        audience22.setText("Аудиторія "+aud22);
        address22.setText(addr22);
        subject_name22.setText(subject22);

        String time3 = getLessonTime(id31);
        String subject31 = getSubject(id31);
        String teacher31 = getTeacher(id31);
        String addr31 = getAddress(id31);
        String aud31 = getAudience(id31);

        lesson_time3.setText(time3);
        subject_name31.setText(subject31);
        teacher_name31.setText(teacher31);
        audience31.setText("Аудиторія "+aud31);
        address31.setText(addr31);

        String subject32 = getSubject(id32);
        String teacher32 = getTeacher(id32);
        String addr32 = getAddress(id32);
        String aud32 = getAudience(id32);

        subject_name32.setText(subject32);
        teacher_name32.setText(teacher32);
        audience32.setText("Аудиторія "+aud32);
        address32.setText(addr32);
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