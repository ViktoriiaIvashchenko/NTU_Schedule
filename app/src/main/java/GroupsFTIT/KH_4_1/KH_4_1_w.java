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

public class KH_4_1_w extends AppCompatActivity {

    private TextView lesson_time12,subject_name12,teacher_name12,address12,audience12;
    private TextView lesson_time2,subject_name21,teacher_name21,address21,audience21;
    private TextView subject_name22,teacher_name22,address22,audience22;
    private TextView lesson_time3,subject_name31,teacher_name31,address31,audience31;

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh41_w);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        lesson_time12 = findViewById(R.id.lessontime12w);
        subject_name12 = findViewById(R.id.name12w);
        teacher_name12 = findViewById(R.id.teacher12w);
        address12 = findViewById(R.id.address12w);
        audience12 = findViewById(R.id.aud12w);

        lesson_time2 = findViewById(R.id.lessontime21w);
        subject_name21 = findViewById(R.id.name21w);
        teacher_name21 = findViewById(R.id.teacher21w);
        address21 = findViewById(R.id.address21w);
        audience21 = findViewById(R.id.aud21w);

        subject_name22 = findViewById(R.id.name22w);
        teacher_name22 = findViewById(R.id.teacher22w);
        address22 = findViewById(R.id.address22w);
        audience22 = findViewById(R.id.aud22w);

        lesson_time3 = findViewById(R.id.lessontime31w);
        subject_name31 = findViewById(R.id.name31w);
        teacher_name31 = findViewById(R.id.teacher31w);
        address31 = findViewById(R.id.address31w);
        audience31 = findViewById(R.id.aud31w);

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        int id12=8, id21=9, id22=10, id31=11;

        String time12 = getLessonTime(id12);
        String subject12 = getSubject(id12);
        String teacher12 = getTeacher(id12);
        String addr12 = getAddress(id12);
        String aud12 = getAudience(id12);

        lesson_time12.setText(time12);
        subject_name12.setText(subject12);
        teacher_name12.setText(teacher12);
        audience12.setText("Аудиторія "+aud12);
        address12.setText(addr12);

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