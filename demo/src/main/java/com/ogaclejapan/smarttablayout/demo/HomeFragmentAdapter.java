package com.ogaclejapan.smarttablayout.demo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Masaki Ogata on 2015/08/05.
 */
public class HomeFragmentAdapter extends FragmentPagerAdapter {

  final FragmentManager fm;
  final Context context;

  public HomeFragmentAdapter(FragmentManager fm, Context context) {
    super(fm);
    this.fm = fm;
    this.context = context;
  }

  @Override
  public Fragment getItem(int position) {
    switch (position) {
      case 0:
        return new CatFrag();
      case 1:
        return new PremiumFrag();
      case 2:
        return new ExploreFrag();
      case 3:
        return new SocialFrag();
      case 4:
        return new FavFrag();
      default:
        return null;
    }
  }

  @Override
  public int getCount() {
    return 5;
  }

  @Override
  public CharSequence getPageTitle(int position) {
    switch (position) {
      case 0:
        return context.getString(R.string.tab_categories);
      case 1:
        return context.getString(R.string.tab_premium);
      case 2:
        return context.getString(R.string.tab_explore);
      case 3:
        return context.getString(R.string.tab_social);
      case 4:
        return context.getString(R.string.tab_favorites);
    }
    return null;
  }
}
