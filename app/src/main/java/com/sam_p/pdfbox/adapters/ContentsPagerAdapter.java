package com.sam_p.pdfbox.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sam_p.pdfbox.fragments.StarredFragment;
import com.sam_p.pdfbox.fragments.TableContentsFragment;

public class ContentsPagerAdapter extends FragmentPagerAdapter {
    private final String pdfPath;

    public ContentsPagerAdapter(FragmentManager fragmentManager, String str) {
        super(fragmentManager);
        this.pdfPath = str;
    }

    public int getCount() {
        return 2;
    }

    public Fragment getItem(int i) {
        if (i == 0) {
            return TableContentsFragment.newInstance(this.pdfPath);
        }
        if (i != 1) {
            return null;
        }
        return StarredFragment.newInstance(this.pdfPath);
    }
}
