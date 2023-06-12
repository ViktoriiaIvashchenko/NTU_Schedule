package com.example.ntu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Groups.Groups_amf;
import Groups.Groups_fep;
import Groups.Groups_fmlt;
import Groups.Groups_ftb;
import Groups.Groups_ftit;
import Utils.Faculty;
import Utils.Util;

public class for_students extends AppCompatActivity {

    private ListView listView;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_students);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listView);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Faculty> facultyList = getAllFaculty();
        ArrayAdapter<Faculty> adapter = new ArrayAdapter<Faculty>(this, android.R.layout.simple_list_item_1, facultyList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Отримуємо обраний об'єкт Faculty зі списку
                Faculty selectedFaculty = facultyList.get(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedFacultyId = selectedFaculty.getId_f();
                // Засновуючись на значенні або ідентифікаторі, виконати необхідні дії
                // і перейти на відповідну сторінку

                if (selectedFacultyId == 1) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_students.this, Groups_amf.class);
                    startActivity(intent);
                } else if (selectedFacultyId == 2) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_students.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedFacultyId == 3) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_students.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedFacultyId == 4) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_students.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedFacultyId == 5) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_students.this, Groups_ftit.class);
                    startActivity(intent);
                }
            }
        });

    }

    //виведення всіх факультетів
    private List<Faculty> getAllFaculty(){
        db = databaseHelper.open();
        List<Faculty> listFaculty = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_FACULTY;
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Faculty faculty = new Faculty();
                faculty.setId_f(Integer.parseInt(cursor.getString(0)));
                faculty.setFaculty_name(cursor.getString(1));

                listFaculty.add(faculty);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listFaculty;
    }
}