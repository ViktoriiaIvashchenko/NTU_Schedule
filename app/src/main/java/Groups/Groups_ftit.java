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

import GroupsFTIT.KH_1_1.KH_1_1_m;
import GroupsFTIT.KH_4_1.KH_4_1_m;
import Utils.Group;
import Utils.Util;

public class Groups_ftit extends AppCompatActivity {

    public ListView listView;
    private EditText searchText;
    public DatabaseHelper databaseHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_ftit);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        listView = findViewById(R.id.listViewFtit);
        databaseHelper = new DatabaseHelper(getApplicationContext());
        databaseHelper.create_db();

        List<Group> groupListFtit = getGroupFtit();
        ArrayAdapter<Group> adapter = new ArrayAdapter<Group>(this, android.R.layout.simple_list_item_1, groupListFtit);

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
                Group selectedGroupFtit = adapter.getItem(position);
                // Визначити, який факультет був вибраний за допомогою ідентифікатора або значення
                int selectedGroupFtitId = selectedGroupFtit.getId_g();

                if (selectedGroupFtitId == 269) {
                    // ТТ(МП)-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                } else if (selectedGroupFtitId == 270) {
                    // ТТ(МП)-І-2 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 271) {
                    // ТТ(МП)-І-3 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 272) {
                    // МС-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 273) {
                    // МС-І-2 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 274) {
                    // УТ-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 275) {
                    // ВП-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 276) {
                    // ВП-І-2 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 277) {
                    // ТЛМ-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 278) {
                    // КН-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, KH_1_1_m.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 279) {
                    // КН-І-2 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 280) {
                    // ІБК-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 281) {
                    // ДЗ(УДК)-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 282) {
                    // ІПЗ(ПР)-І-1 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 283) {
                    // ІПЗ(ПР)-І-2 був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 284) {
                    // УТ-І-1тех. був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 285) {
                    // МС-І-1тех. був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 286) {
                    // МП-І-1тех. був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 287) {
                    // ВП-І-1тех. був вибраний, перехід на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 288) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 289) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 290) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 291) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 292) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 293) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 294) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 295) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 296) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 297) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 298) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 299) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 300) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 301) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 302) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 303) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 304) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 305) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 306) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 307) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 308) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 309) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 310) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 311) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 312) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 313) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 314) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 315) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 316) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 317) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 318) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 319) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 320) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 321) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 322) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 323) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 324) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 325) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 326) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 327) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 328) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 329) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 330) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 331) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 332) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 333) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 334) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 335) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 336) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 337) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 338) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 339) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 340) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, KH_4_1_m.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 341) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 342) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 343) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 344) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 345) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 346) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 347) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 348) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 349) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 350) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 351) {
                    // ТТ(МП)-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 352) {
                    // ТТ(МП)-І-3 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 353) {
                    // МС-І-1 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 354) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }else if (selectedGroupFtitId == 355) {
                    // МС-І-2 був вибраний, виконати дії і перейти на відповідну сторінку
                    Intent intent = new Intent(Groups_ftit.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

    private List<Group> getGroupFtit(){
        db = databaseHelper.open();
        List<Group> listGroupsFtit = new ArrayList<>();
        String selectAllF = "SELECT * FROM "+ Util.TABLE_GROUPS+" WHERE "+Util.COLUMN_G_F_NAME+"=5";
        Cursor cursor = db.rawQuery(selectAllF,null);

        if(cursor.moveToFirst()){
            do{
                Group group = new Group();
                group.setId_g(Integer.parseInt(cursor.getString(0)));
                group.setGroup_name(cursor.getString(3));

                listGroupsFtit.add(group);
            }while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return listGroupsFtit;
    }
}