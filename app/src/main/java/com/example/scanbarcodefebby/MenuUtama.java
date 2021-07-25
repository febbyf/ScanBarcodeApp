package com.example.scanbarcodefebby;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MenuUtama extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        BottomNavigationView bntNav = findViewById(R.id.menu_utama);
        bntNav.setOnNavigationItemSelectedListener(navListener);

        //setting home fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.layout_menu, new HomeFragment()).commit();

    }


    //Listener Nav Bar
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.home_menu:
                            selectedFragment = new HomeFragment();
                            break;

                        case R.id.data_menu:
                            selectedFragment = new DataFragment();
                            break;

                        case R.id.setting_menu:
                            selectedFragment = new SettingFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.layout_menu
                            ,selectedFragment).commit();

                    return  true;
                }
            };
}



