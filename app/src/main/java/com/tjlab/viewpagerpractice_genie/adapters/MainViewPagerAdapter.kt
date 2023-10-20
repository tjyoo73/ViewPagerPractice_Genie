package com.tjlab.viewpagerpractice_genie.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjlab.viewpagerpractice_genie.fragments.GreetingsFragment
import com.tjlab.viewpagerpractice_genie.fragments.MyInfoFragment
import com.tjlab.viewpagerpractice_genie.fragments.NameFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
//        if (position == 0) {
//            return NameFragment()
//        }
//        else if (position == 1) {
//            return MyInfoFragment()
//        }
//        else {
//            return GreetingsFragment()
//        }

        return when (position) {
            0 -> NameFragment()
            1 -> MyInfoFragment()
            else -> GreetingsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        //return super.getPageTitle(position)
//        if (position == 0) {
//            return "이름"
//        }
//        else if (position == 1) {
//            return "내 정보"
//        }
//        else {
//            return "인사말"
//        }

//        when (position) {
//            0 -> return "이름"
//            1 -> return "내 정보"
//            else -> return "인사말"

        return when (position) {
            0 -> "이름"
            1 -> "내 정보"
            else -> "인사말"
        }
    }
}