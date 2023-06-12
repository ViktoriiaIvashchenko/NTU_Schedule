package Teachers.Sylenok_HA;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ntu.R;

public class SylenokHA_tue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylenok_ha_tue);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
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