package com.example.android.boardgamesaver.taintedgrail.ui.heroes

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroAileiFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroArevFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroBeorFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroMaggotFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> { HeroBeorFragment() }
            1 -> HeroArevFragment()
            2 -> HeroAileiFragment()
            else -> {
                return HeroMaggotFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Beor"
            1 -> "Arev"
            2 -> "Ailei"
            else -> {
                return "Maggot"
            }
        }
    }

}