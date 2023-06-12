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

public class Groups_fep extends AppCompatActivity {

    private ListView listView;
    private EditText searchText;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_fep);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewFep);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Group> groupListFep = getGroupFep();
        ArrayAdapter<Group> adapter = new ArrayAdapter<Group>(this, android.R.layout.simple_list_item_1, groupListFep);

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
                Group selectedGroupFep = groupListFep.get(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedGroupFepId = selectedGroupFep.getId_g();
                // Засновуючись на значенні або ідентифікаторі, виконати необхідні дії
                // і перейти на відповідну сторінку

                if (selectedGroupFepId == 230) {
                    // ТТ(МП)-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                } else if (selectedGroupFepId == 231) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 232) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 233) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 234) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 235) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 236) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 237) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 238) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 239) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 240) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 241) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 242) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 243) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 244) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 245) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 246) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 247) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 248) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 249) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 250) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 251) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 252) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 253) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 254) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 255) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 256) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 257) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 258) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 259) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 260) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 261) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 262) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 263) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 264) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 265) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 266) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 267) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFepId == 268) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fep.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }

    private List<Group> getGroupFep(){
        db = databaseHelper.open();
        List<Group> listGroupsFep = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_GROUPS+" WHERE "+Util.COLUMN_G_F_NAME+"=4";
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Group group = new Group();
                group.setId_g(Integer.parseInt(cursor.getString(0)));
                group.setGroup_name(cursor.getString(3));

                listGroupsFep.add(group);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listGroupsFep;
    }
}