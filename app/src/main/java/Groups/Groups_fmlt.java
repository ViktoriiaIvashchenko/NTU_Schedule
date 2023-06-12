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

public class Groups_fmlt extends AppCompatActivity {

    private ListView listView;
    private EditText searchText;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_fmlt);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewFmlt);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Group> groupListFmlt = getGroupFmlt();
        ArrayAdapter<Group> adapter = new ArrayAdapter<Group>(this, android.R.layout.simple_list_item_1, groupListFmlt);

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
                Group selectedGroupFmlt = groupListFmlt.get(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedGroupFmltId = selectedGroupFmlt.getId_g();
                // Засновуючись на значенні або ідентифікаторі, виконати необхідні дії
                // і перейти на відповідну сторінку

                if (selectedGroupFmltId == 164) {
                    // ТТ(МП)-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                } else if (selectedGroupFmltId == 165) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 166) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 167) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 168) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 169) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 170) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 171) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 172) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 173) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 174) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 175) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 176) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 177) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 178) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 179) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 180) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 181) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 182) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 183) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 184) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 185) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 186) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 187) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 188) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 189) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 190) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 191) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 192) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 193) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 194) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 195) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 196) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 197) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 198) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 199) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 200) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 201) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 202) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 203) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 204) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 205) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 206) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 207) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 208) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 209) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 210) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 211) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 212) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 213) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 214) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 215) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 216) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 217) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 218) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 219) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 220) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 221) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 222) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 223) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 224) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 225) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 226) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 227) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 228) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFmltId == 229) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_fmlt.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private List<Group> getGroupFmlt(){
        db = databaseHelper.open();
        List<Group> listGroupsFmlt = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_GROUPS+" WHERE "+Util.COLUMN_G_F_NAME+"=3";
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Group group = new Group();
                group.setId_g(Integer.parseInt(cursor.getString(0)));
                group.setGroup_name(cursor.getString(3));

                listGroupsFmlt.add(group);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listGroupsFmlt;
    }
}