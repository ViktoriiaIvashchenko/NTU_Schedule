package Teachers.Sylenok_HA;

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

public class SylenokHA extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    private TextView lesson_time1,subject_name1,group_name1,audience1;
    private TextView lesson_time21,subject_name21,group_name21,audience21;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylenok_ha);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        lesson_time1 = findViewById(R.id.lessontime1m_t182);
        subject_name1 = findViewById(R.id.name1m_t182);
        group_name1 = findViewById(R.id.group1m_t182);
        audience1 = findViewById(R.id.aud1m_t182);

        lesson_time21 = findViewById(R.id.lessontime21m_t182);
        subject_name21 = findViewById(R.id.name21m_t182);
        group_name21 = findViewById(R.id.group21m_t182);
        audience21 = findViewById(R.id.aud21m_t182);

        int id11=311, id12=325, id13=369;

        String time1 = getLessonTime(id11);
        String subject1 = getSubject(id11);
        String group11 = getGroup(id11);
        String group12 = getGroup(id12);
        String group13 = getGroup(id13);
        String aud1 = getAudience(id11);

        lesson_time1.setText(time1);
        subject_name1.setText(subject1);
        group_name1.setText(group11+", "+group12+", "+group13);
        audience1.setText("Аудиторія "+aud1);

        int id211=197, id212=212, id213=227, id214=244, id215=260;

        String time21 = getLessonTime(id211);
        String subject21 = getSubject(id211);
        String group211 = getGroup(id211);
        String group212 = getGroup(id212);
        String group213 = getGroup(id213);
        String group214 = getGroup(id212);
        String group215 = getGroup(id213);
        String aud21 = getAudience(id211);

        lesson_time21.setText(time21);
        subject_name21.setText(subject21);
        group_name21.setText(group211+", "+group212+", "+group213+", "+group214+", "+group215);
        audience21.setText("Аудиторія "+aud21);

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

    private String getGroup(int id){
        //виведення групи
        db = databaseHelper.open();

        String selection = "SELECT Groups.groups_name " +
                "FROM Schedule " +
                "JOIN Groups ON Schedule.group_n=Groups._id " +
                "WHERE Schedule._id="+id+";";

        Cursor cursor =db.rawQuery(selection,null);
        String grName ="";

        if(cursor.moveToFirst()){
            do{
                grName = cursor.getString(cursor.getColumnIndexOrThrow("groups_name"));
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();

        return grName;
    }

    private String getAudience(int id){
        //виведення аудиторії
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
        Intent clm = new Intent(this, SylenokHA.class);
        startActivity(clm);
    }

    public void onClickTue(View view) {
        Intent clm = new Intent(this, SylenokHA_tue.class);
        startActivity(clm);
    }

    public void onClickWen(View view) {
        Intent clm = new Intent(this, SylenokHA_wen.class);
        startActivity(clm);
    }

    public void onClickThu(View view) {
        Intent clm = new Intent(this, SylenokHA_thu.class);
        startActivity(clm);
    }

    public void onClickFri(View view) {
        Intent clm = new Intent(this, SylenokHA_fri.class);
        startActivity(clm);
    }
}