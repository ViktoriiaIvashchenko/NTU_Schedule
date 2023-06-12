package GroupsFTIT.KH_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ntu.DatabaseHelper;
import com.example.ntu.R;

import GroupsFTIT.KH_4_1.KH_4_1_f;
import GroupsFTIT.KH_4_1.KH_4_1_m;
import GroupsFTIT.KH_4_1.KH_4_1_thu;
import GroupsFTIT.KH_4_1.KH_4_1_tue;
import GroupsFTIT.KH_4_1.KH_4_1_w;

public class KH_1_1_m extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    private TextView lesson_time1,subject_name1,teacher_name1,address1,audience1;
    private TextView lesson_time21,subject_name21,teacher_name21,address21,audience21;
    private TextView subject_name22,teacher_name22,address22,audience22;
    private TextView lesson_time4,subject_name4,teacher_name4,address4,audience4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kh11_m);

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        lesson_time1 = findViewById(R.id.lessontime1m_kn11);
        subject_name1 = findViewById(R.id.name1m_kn11);
        teacher_name1 = findViewById(R.id.teacher1m_kn11);
        audience1 = findViewById(R.id.aud1m_kn11);
        address1 = findViewById(R.id.address1m_kn11);

        lesson_time21 = findViewById(R.id.lessontime21m_kn11);
        subject_name21 = findViewById(R.id.name21m_kn11);
        teacher_name21 = findViewById(R.id.teacher21m_kn11);
        audience21 = findViewById(R.id.aud21m_kn11);
        address21 = findViewById(R.id.address21m_kn11);

        subject_name22 = findViewById(R.id.name22m_kn11);
        teacher_name22 = findViewById(R.id.teacher22m_kn11);
        audience22 = findViewById(R.id.aud22m_kn11);
        address22 = findViewById(R.id.address22m_kn11);

        lesson_time4 = findViewById(R.id.lessontime4m_kn11);
        subject_name4 = findViewById(R.id.name4m_kn11);
        teacher_name4 = findViewById(R.id.teacher4m_kn11);
        audience4 = findViewById(R.id.aud4m_kn11);
        address4 = findViewById(R.id.address4m_kn11);

        int id1=16, id21=17, id22=18, id4=19;

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

        String time21 = getLessonTime(id21);
        String subject21 = getSubject(id21);
        String teacher21 = getTeacher(id21);
        String addr21 = getAddress(id21);
        String aud21 = getAudience(id21);
        lesson_time21.setText(time21);
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

        String time4 = getLessonTime(id4);
        String subject4 = getSubject(id4);
        String teacher4 = getTeacher(id4);
        String addr4 = getAddress(id4);
        String aud4 = getAudience(id4);
        lesson_time4.setText(time4);
        subject_name4.setText(subject4);
        teacher_name4.setText(teacher4);
        audience4.setText("Аудиторія "+aud4);
        address4.setText(addr4);
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
        Intent clm = new Intent(this, KH_1_1_m.class);
        startActivity(clm);
    }

    public void onClickTue(View view) {
        Intent clm = new Intent(this, KH_1_1_m.class);
        startActivity(clm);
    }

    public void onClickWen(View view) {
        Intent clm = new Intent(this, KH_1_1_m.class);
        startActivity(clm);
    }

    public void onClickThu(View view) {
        Intent clm = new Intent(this, KH_1_1_m.class);
        startActivity(clm);
    }

    public void onClickFri(View view) {
        Intent clm = new Intent(this, KH_1_1_m.class);
        startActivity(clm);
    }
}