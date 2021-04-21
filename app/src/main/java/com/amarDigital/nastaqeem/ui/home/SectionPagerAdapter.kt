package com.amarDigital.nastaqeem.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.amarDigital.nastaqeem.ui.home.evaluasi.EvaluasiFragment

class SectionPagerAdapter(fm: FragmentManager) :   FragmentPagerAdapter(fm) {
    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "Home"
            1 -> "Evaluasi"
            else -> ""
        }
    }


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        var fragment : Fragment
        return when(position) {
            0 -> {
                fragment = HomeFragment()
                return fragment
            }
            1 -> {
                fragment = EvaluasiFragment()
                return fragment
            }
            else -> {
                fragment = HomeFragment()
                return fragment
            }
        }
    }

}