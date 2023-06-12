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

import Utils.Group;
import Utils.Util;

public class Groups_ftb extends AppCompatActivity {

    public ListView listView;
    private EditText searchText;
    public DatabaseHelper databaseHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_ftb);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewFtb);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Group> groupListFtb = getGroupFtb();
        ArrayAdapter<Group> adapter = new ArrayAdapter<Group>(this, android.R.layout.simple_list_item_1, groupListFtb);

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
                Group selectedGroupFtb = groupListFtb.get(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedGroupFtbId = selectedGroupFtb.getId_g();
                // Засновуючись на значенні або ідентифікаторі, виконати необхідні дії
                // і перейти на відповідну сторінку

                if (selectedGroupFtbId == 96) {
                    // ТТ(МП)-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                } else if (selectedGroupFtbId == 97) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 98) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 99) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 100) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 101) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 102) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 103) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 104) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 105) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 106) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 107) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 108) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 109) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 110) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 111) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 112) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 113) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 114) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 115) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 116) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 117) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 118) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 119) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 120) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 121) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 122) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 123) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 124) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 125) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 126) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 127) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 128) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 129) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 130) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 131) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 132) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 133) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 134) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 135) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 136) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 137) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 138) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 139) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 140) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 141) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 142) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 143) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 144) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 145) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 146) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 147) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 148) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 149) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 150) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 151) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 152) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 153) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 154) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 155) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 156) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 157) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 158) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 159) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 160) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 161) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 162) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtbId == 163) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftb.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private List<Group> getGroupFtb(){
        db = databaseHelper.open();
        List<Group> listGroupsFtb = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_GROUPS+" WHERE "+Util.COLUMN_G_F_NAME+"=2";
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Group group = new Group();
                group.setId_g(Integer.parseInt(cursor.getString(0)));
                group.setGroup_name(cursor.getString(3));

                listGroupsFtb.add(group);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listGroupsFtb;
    }
}