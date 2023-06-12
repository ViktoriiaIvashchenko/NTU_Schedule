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

public class SylenokHA_fri extends AppCompatActivity {

    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    private TextView lesson_time1,subject_name1,group_name1,audience1;
    private TextView lesson_time2,subject_name2,group_name2,audience2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylenok_ha_fri);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        lesson_time1 = findViewById(R.id.lessontime1f_t182);
        subject_name1 = findViewById(R.id.name1f_t182);
        group_name1 = findViewById(R.id.group1f_t182);
        audience1 = findViewById(R.id.aud1f_t182);

        lesson_time2 = findViewById(R.id.lessontime21f_t182);
        subject_name2 = findViewById(R.id.name21f_t182);
        group_name2 = findViewById(R.id.group21f_t182);
        audience2 = findViewById(R.id.aud21f_t182);

        int id11=88, id12=109;

        String time1 = getLessonTime(id11);
        String subject1 = getSubject(id11);
        String group11 = getGroup(id11);
        String group12 = getGroup(id12);
        String aud1 = getAudience(id11);

        lesson_time1.setText(time1);
        subject_name1.setText(subject1);
        group_name1.setText(group11+", "+group12);
        audience1.setText("Аудиторія "+aud1);

        int id21=32, id22=50, id23=71, id24=90, id25=111;

        String time2 = getLessonTime(id21);
        String subject2 = getSubject(id21);
        String group21 = getGroup(id21);
        String group22 = getGroup(id22);
        String group23 = getGroup(id23);
        String group24 = getGroup(id24);
        String group25 = getGroup(id25);
        String aud2 = getAudience(id21);

        lesson_time2.setText(time2);
        subject_name2.setText(subject2);
        group_name2.setText(group21+", "+group22+", "+group23+", "+group24+", "+group25);
        audience2.setText("Аудиторія "+aud2);
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