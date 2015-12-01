package main.codeacid.com.clone.Adapter;

/**
 * Created by sujana on 12/1/2015.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

import main.codeacid.com.clone.Fragments.TabFragment1;
import main.codeacid.com.clone.Fragments.TabFragment2;
import main.codeacid.com.clone.Fragments.TabFragment3;

public class PagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragmentList = new ArrayList<>();
    private List<String> mFragmentTitleList = new ArrayList<>();
    public PagerAdapter(FragmentManager fm) {
        super(fm);

    }

    public void addFragment(Fragment fragment,
                            String title){
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);

    }

    @Override
    public Fragment getItem(int position) {

        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }
}