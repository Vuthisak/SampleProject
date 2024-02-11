package com.vuthisak.sample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vuthisak.sample.fragment.FirstFragment
import com.vuthisak.sample.fragment.SecondFragment
import com.vuthisak.sample.fragment.ThirdFragment

// An equivalent ViewPager2 adapter class
class ScreenSlidePagerAdapter(
    fm: FragmentManager, lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    private val fragments = arrayListOf<Fragment>(
        FirstFragment(), SecondFragment(), ThirdFragment()
    )

    override fun getItemCount(): Int = fragments.size


    override fun createFragment(position: Int): Fragment = fragments[position]

}