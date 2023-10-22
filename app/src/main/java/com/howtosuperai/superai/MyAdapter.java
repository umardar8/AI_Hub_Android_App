package com.howtosuperai.superai;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.howtosuperai.superai.fragments.CreativityFragment;
import com.howtosuperai.superai.fragments.ProductivityFragment;
import com.howtosuperai.superai.fragments.PopularFragment;
import com.howtosuperai.superai.fragments.AcademicFragment;

public class MyAdapter extends FragmentStateAdapter {

    public MyAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 1:
                return new AcademicFragment();
            case 2:
                return new ProductivityFragment();
            case 3:
                return new CreativityFragment();
            default:
                return new PopularFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
