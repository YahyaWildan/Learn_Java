package com.example.homefragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerMarketplaceCategoryProduc extends FragmentStateAdapter {
    public ViewPagerMarketplaceCategoryProduc(@NonNull MarketplaceFragment fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ProductFragment();
            case 1:
                return new ListenFragment();
            case 2:
                return new ListenFragment();
            case 3:
                return new ListenFragment();
            case 4:
                return new ListenFragment();

            default:
                return new WatchFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
