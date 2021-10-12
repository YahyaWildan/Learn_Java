package com.example.homefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    ChipNavigationBar bottomNav;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottom_nav);

        if (savedInstanceState == null) {
            bottomNav.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, homeFragment).commit();
        }

        bottomNav.setOnItemSelectedListener(id -> {
            Fragment fragment = null;
            switch (id) {
                case R.id.home:
                    fragment = new HomeFragment();
                    break;
                case R.id.kajian:
                    fragment = new KajianFragment();
                    break;
                case R.id.marketplace:
                    fragment = new MarketplaceFragment();
                    break;
                case R.id.profile:
                    fragment = new ProfileFragment();
                    break;
            }
            if (fragment != null) {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).
                        commit();
            } else {
                Log.e(TAG, "Halaman Rusak");
            }
        });
    }


}