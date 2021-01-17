package com.example.android.boardgamesaver.taintedgrail.ui.heroes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.android.boardgamesaver.R
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroAileiFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroArevFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroBeorFragment
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments.HeroMaggotFragment
import com.google.android.material.tabs.TabLayout
import java.util.ArrayList

class HeroesTabFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_heroes_tab, container, false)

        val viewPager: ViewPager = root.findViewById(R.id.viewpager);
        setupViewPager(viewPager)

        val tabs: TabLayout = root.findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        return root
    }

    private fun setupViewPager(viewPager: ViewPager) {
        val adapter = Adapter(getChildFragmentManager())
        adapter.addFragment(HeroBeorFragment(), "Beor")
        adapter.addFragment(HeroArevFragment(), "Arev")
        adapter.addFragment(HeroAileiFragment(), "Ailei")
        adapter.addFragment(HeroMaggotFragment(), "Maggot")
        viewPager.adapter = adapter
    }

    internal class Adapter(manager: FragmentManager?) : FragmentPagerAdapter(manager) {
        private val mFragmentList: MutableList<Fragment> = ArrayList<Fragment>()
        private val mFragmentTitleList: MutableList<String> = ArrayList()
        override fun getItem(position: Int): Fragment {
            return mFragmentList[position]
        }

        override fun getCount(): Int {
            return mFragmentList.size
        }

        fun addFragment(fragment: Fragment, title: String) {
            mFragmentList.add(fragment)
            mFragmentTitleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return mFragmentTitleList[position]
        }
    }
}