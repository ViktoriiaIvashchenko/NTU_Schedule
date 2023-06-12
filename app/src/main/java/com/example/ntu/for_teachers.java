package com.example.ntu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Groups.Groups_amf;
import Groups.Groups_fep;
import Groups.Groups_fmlt;
import Groups.Groups_ftb;
import Groups.Groups_ftit;
import Teachers.Sylenok_HA.SylenokHA;
import Utils.Teacher;
import Utils.TeacherAdapter;
import Utils.Util;

public class for_teachers extends AppCompatActivity {

    private ListView listView;
    private EditText searchText;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_teachers);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewT);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Teacher> teacherList = getAllTeacher();
        ArrayAdapter<Teacher> adapter = new ArrayAdapter<Teacher>(this, android.R.layout.simple_list_item_1, teacherList);

        listView.setAdapter(adapter);

        searchText = findViewById(R.id.searchTeacher);
        searchText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Не потрібно реалізовувати
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Викликайте фільтрацію адаптера при зміні тексту у рядку пошуку
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Не потрібно реалізовувати
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Отримуємо обраний об'єкт Faculty зі списку
                Teacher selectedTeacher = adapter.getItem(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedTeacherId = selectedTeacher.getId_f();

                if (selectedTeacherId == 1) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 2) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 3) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 4) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 5) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 6) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 7) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 8) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 9) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 10) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 11) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 12) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 13) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 14) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 15) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 16) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 17) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 18) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 19) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 20) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 21) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 22) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 23) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 24) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 25) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 26) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 27) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 28) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 29) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 30) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 31) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 32) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 33) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 34) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 35) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 36) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 37) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 38) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 39) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 40) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 41) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 42) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 43) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 44) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 45) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 46) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 47) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 48) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 49) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 50) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 51) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 52) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 53) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 54) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 55) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 56) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 57) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 58) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 59) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 60) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 61) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 62) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 63) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 64) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 65) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 66) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 67) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 68) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 69) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 70) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 71) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 72) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 73) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 74) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 75) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 76) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 77) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 78) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 79) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 80) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 81) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 82) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 83) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 84) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 85) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 86) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 87) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 88) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 89) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 90) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 91) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 92) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 93) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 94) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 95) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 96) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 97) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 98) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 99) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 100) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 101) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 102) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 103) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 104) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 105) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 106) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 107) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 108) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 109) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 110) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 111) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 112) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 113) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 114) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 115) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 116) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 117) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 118) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 119) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 120) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 121) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 122) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 123) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 124) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 125) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 126) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 127) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 128) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 129) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 130) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 131) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 132) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 133) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 134) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 135) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 136) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 137) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 138) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 139) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 140) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 141) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 142) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 143) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 144) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 145) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 146) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 147) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 148) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 149) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 150) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 151) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 152) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 153) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 154) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 155) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 156) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 157) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 158) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 159) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 160) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 161) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 162) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 163) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 164) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 165) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 166) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 167) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 168) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 169) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 170) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 171) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 172) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 173) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 174) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 175) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 176) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 177) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 178) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 179) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 180) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 181) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 182) {
                    // Силенок Ганна Анатоліївна
                    Intent intent = new Intent(for_teachers.this, SylenokHA.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 183) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 184) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 185) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 186) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 187) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 188) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 189) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 190) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 191) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 192) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 193) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 194) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 195) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 196) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 197) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 198) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 199) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 200) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 201) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 202) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 203) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 204) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 205) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 206) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 207) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 208) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 209) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 210) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 211) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 212) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 213) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 214) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 215) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 216) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 217) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 218) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 219) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 220) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 221) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 222) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 223) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 224) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 225) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 226) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 227) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 228) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 229) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 230) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 231) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 232) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 233) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 234) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 235) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 236) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 237) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 238) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 239) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 240) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 241) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 242) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 243) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 244) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 245) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 246) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 247) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 248) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 249) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 250) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 251) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 252) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 253) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 254) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 255) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 256) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 257) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 258) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 259) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 260) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 261) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 262) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 263) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 264) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 265) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 266) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 267) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 268) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 269) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 270) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 271) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 272) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 273) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 274) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 275) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 276) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 277) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 278) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 279) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 280) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 281) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 282) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 283) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 284) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 285) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 286) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 287) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 288) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 289) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 290) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 291) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 292) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 293) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 294) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 295) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 296) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 297) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 298) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 299) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 300) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 301) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 302) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 303) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 304) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 305) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 306) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 307) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 308) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 309) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 310) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 311) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 312) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 313) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 314) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 315) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 316) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 317) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 318) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 319) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 320) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 321) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 322) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 323) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 324) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 325) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 326) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 327) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 328) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 329) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 330) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 331) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 332) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 333) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 334) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 335) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 336) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 337) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 338) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 339) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 340) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 341) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 342) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 343) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 344) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 345) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 346) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 347) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 348) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 349) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 350) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 351) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 352) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 353) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 354) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 355) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 356) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 357) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 358) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 359) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 360) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 361) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 362) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 363) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 364) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 365) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 366) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 367) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 368) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 369) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 370) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 371) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 372) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 373) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 374) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 375) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 376) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 377) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 378) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 379) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 380) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 381) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 382) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 383) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 384) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 385) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 386) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 387) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 388) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 389) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 390) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 391) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 392) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 393) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 394) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 395) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 396) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 397) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 398) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 399) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 400) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 401) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 402) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 403) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 404) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 405) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 406) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 407) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 408) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 409) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 410) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 411) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 412) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 413) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 414) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 415) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 416) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 417) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 418) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 419) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 420) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 421) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 422) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 423) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 424) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 425) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 426) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 427) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 428) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 429) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 430) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 431) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 432) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 433) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 434) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 435) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 436) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 437) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 438) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 439) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 440) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 441) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 442) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 443) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 444) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 445) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 446) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 447) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 448) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 449) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 450) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 451) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 452) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 453) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 54) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 455) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 456) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 457) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 458) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 459) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 460) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 461) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 462) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 463) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 464) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 465) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 466) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 467) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 468) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 469) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 470) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 471) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 472) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 473) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 474) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 475) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 476) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 477) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 478) {
                    // Лавринович Олена Анатоліївна
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 479) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 480) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 481) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 482) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 483) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 484) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 485) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 486) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 487) {
                    //
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 488) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 489) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 490) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 491) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 492) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 493) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 494) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 495) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 496) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 497) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 498) {
                    // ФЕП 4 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fep.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 499) {
                    // ФТІТ 5 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftit.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 500) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 501) {
                    // АМФ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_amf.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 502) {
                    // ФТБ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_ftb.class);
                    startActivity(intent);
                }else if (selectedTeacherId == 503) {
                    // ФМЛТ був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(for_teachers.this, Groups_fmlt.class);
                    startActivity(intent);
                }
            }
        });
    }

    //виведення всіх викладачів
    private List<Teacher> getAllTeacher(){
        db = databaseHelper.open();
        List<Teacher> listTeacher = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_TEACHERS;
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Teacher teacher = new Teacher();
                teacher.setId_f(Integer.parseInt(cursor.getString(0)));
                teacher.setTeacher_name(cursor.getString(1));

                listTeacher.add(teacher);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listTeacher;
    }
}