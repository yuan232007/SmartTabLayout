package com.ogaclejapan.smarttablayout.demo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItem;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class DemoAlwaysInCenterActivity extends ActionBarActivity {

  private static final String KEY_DEMO = "demo";

  public static void startActivity(Context context, Demo demo) {
    Intent intent = new Intent(context, DemoAlwaysInCenterActivity.class);
    intent.putExtra(KEY_DEMO, demo.name());
    context.startActivity(intent);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_demo_always_in_center);

    Demo demo = getDemo();

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    toolbar.setTitle(demo.titleResId);

    ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
    SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.tabs);

    viewPager.setAdapter(new HomeFragmentAdapter(getSupportFragmentManager(), this));
    viewPagerTab.setViewPager(viewPager);
    viewPagerTab.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

      }

      @Override
      public void onPageSelected(int position) {

      }

      @Override
      public void onPageScrollStateChanged(int state) {

      }
    });

    viewPager.setCurrentItem(2);


  }

  private Demo getDemo() {
    return Demo.valueOf(getIntent().getStringExtra(KEY_DEMO));
  }
}
