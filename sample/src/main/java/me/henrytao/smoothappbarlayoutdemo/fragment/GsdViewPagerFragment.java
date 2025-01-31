/*
 * Copyright 2015 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.smoothappbarlayoutdemo.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import butterknife.Bind;
import me.henrytao.smoothappbarlayoutdemo.R;
import me.henrytao.smoothappbarlayoutdemo.apdater.ViewPagerAdapter;

public class GsdViewPagerFragment extends BaseFeatureFragment {

  public static Fragment newInstance() {
    return new GsdViewPagerFragment();
  }

  @Bind(R.id.tab_layout)
  TabLayout vTabLayout;

  @Bind(R.id.view_pager)
  ViewPager vViewPager;

  @Override
  public int getContentLayout() {
    return R.layout.fragment_gsd_view_pager;
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
    adapter.addFragment(DummyRecyclerViewFragment.newInstance("Cat", 100), "Cat");
    adapter.addFragment(DummyRecyclerViewFragment.newInstance("Dog", 100), "Dog");
    adapter.addFragment(DummyRecyclerViewFragment.newInstance("Mouse", 5), "Mouse");
    vViewPager.setAdapter(adapter);
    vTabLayout.setupWithViewPager(vViewPager);
  }
}
