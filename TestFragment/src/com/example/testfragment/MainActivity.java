package com.example.testfragment;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

public class MainActivity extends FragmentActivity {
  
  private ArrayList<Fragment> fragments;
  private ViewPager viewPager;
  private MyViewPagerAdapter myViewPagerAdapter;
  
  private AllPhotosFragment allPhotosFragment;
  private MyAlbumFragment myAlbumFragment;
  private ShareTimeFragment shareTimeFragment;
  private ShotTimeFragment shotTimeFragment;
  private ThemeAlbumFragment themeAlbumFragment;
  private PersonalFragment personalFragment;
  

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);// 去掉标题栏
    setContentView(R.layout.activity_main);
    
    viewPager = (ViewPager) findViewById(R.id.viewpager);
    
    fragments = new ArrayList<Fragment>();
    allPhotosFragment = new AllPhotosFragment();
    myAlbumFragment = new MyAlbumFragment();
    shareTimeFragment = new ShareTimeFragment();
    shotTimeFragment = new ShotTimeFragment();
    themeAlbumFragment = new ThemeAlbumFragment();
    personalFragment = new PersonalFragment();
    fragments.add(allPhotosFragment);
    fragments.add(myAlbumFragment);
    fragments.add(shareTimeFragment);
    fragments.add(shotTimeFragment);
    fragments.add(themeAlbumFragment);
    fragments.add(personalFragment);
    myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments);
    
    viewPager.setAdapter(myViewPagerAdapter);
    viewPager.setCurrentItem(0);
  }
  
}
