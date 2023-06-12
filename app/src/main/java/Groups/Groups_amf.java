package Groups;

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

import com.example.ntu.DatabaseHelper;
import com.example.ntu.MainActivity;
import com.example.ntu.R;

import java.util.ArrayList;
import java.util.List;

import GroupsFTIT.KH_4_1.KH_4_1_m;
import Utils.Group;
import Utils.Util;

public class Groups_amf extends AppCompatActivity {

    public ListView listView;
    private EditText searchText;
    public DatabaseHelper databaseHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_amf);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewAmf);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Group> groupListAmf = getGroupAmf();
        ArrayAdapter<Group> adapter = new ArrayAdapter<Group>(this, android.R.layout.simple_list_item_1, groupListAmf);

        listView.setAdapter(adapter);

        searchText = findViewById(R.id.searchGroupFtit);
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
                // Отримуємо обраний об'єкт зі списку
                Group selectedGroupAmf = groupListAmf.get(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedGroupAmfId = selectedGroupAmf.getId_g();
                // Засновуючись на значенні або ідентифікаторі, виконати необхідні дії
                // і перейти на відповідну сторінку

                if (selectedGroupAmfId == 1) {
                    // ТТ(МП)-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                } else if (selectedGroupAmfId == 2) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 3) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 4) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 5) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 6) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 7) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 8) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 9) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 10) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 11) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 12) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 13) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 14) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 15) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 16) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 17) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 18) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 19) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 20) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 21) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 22) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 23) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 24) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 25) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 26) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 27) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 28) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 29) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 30) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 31) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 32) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 33) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 34) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 35) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 36) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 37) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 38) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 39) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 40) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 41) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 42) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 43) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 44) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 45) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 46) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 47) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 48) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 49) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 50) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 51) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 52) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 53) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 54) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 55) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 56) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 57) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 58) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 59) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 60) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 61) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 62) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 63) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 64) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 65) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 66) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 67) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 68) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 69) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 70) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 71) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 72) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, KH_4_1_m.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 73) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 74) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 75) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 76) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 77) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 78) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 79) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 80) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 81) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 82) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 83) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 84) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 85) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 86) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 87) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 88) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 89) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 90) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 91) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 92) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 93) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 94) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupAmfId == 95) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_amf.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private List<Group> getGroupAmf(){
        db = databaseHelper.open();
        List<Group> listGroupsAmf = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_GROUPS+" WHERE "+Util.COLUMN_G_F_NAME+"=1";
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Group group = new Group();
                group.setId_g(Integer.parseInt(cursor.getString(0)));
                group.setGroup_name(cursor.getString(3));

                listGroupsAmf.add(group);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listGroupsAmf;
    }
}