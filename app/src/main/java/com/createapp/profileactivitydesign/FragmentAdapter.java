package com.createapp.profileactivitydesign;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.createapp.profileactivitydesign.Fragment.ChatFragment;
import com.createapp.profileactivitydesign.Fragment.ContactFragment;
import com.createapp.profileactivitydesign.Fragment.StatusFragment;

public class FragmentAdapter extends FragmentPagerAdapter {
    String [] fragmentNames = {"Post","Tagged","About"};
    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new ChatFragment();

            case 1: return new ContactFragment();
            case 2: return new StatusFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return fragmentNames.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNames[position];
    }
}
