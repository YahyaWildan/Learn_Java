package com.example.homefragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerDetailCategoryAdapter extends FragmentStateAdapter {
    public ViewPagerDetailCategoryAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
      switch (position){
          case 0:
              return new ZakatFragment();
          case 1:
              return new InfakFragment();
          default:
              return new WakafFragment();
      }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
