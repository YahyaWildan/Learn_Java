package com.example.homefragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class DialogsheetDetailCategoryActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogsheet_detail_category);
        viewPager = findViewById(R.id.viewpager_detail_category);
        viewPager.setAdapter(new ViewPagerDetailCategoryAdapter(this));

        tabLayout = findViewById(R.id.tab_layout_category);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                tabLayout, viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Zakat");
                        break;
                    case 1:
                        tab.setText("Infak");
                        break;
                    case 2:
                        tab.setText("Wakaf");
                        break;
                }
            }
        }
        );
        tabLayoutMediator.attach();

    }
}

