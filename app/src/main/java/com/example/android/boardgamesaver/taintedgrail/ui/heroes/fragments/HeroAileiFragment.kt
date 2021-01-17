package com.example.android.boardgamesaver.taintedgrail.ui.heroes.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.android.boardgamesaver.R
import com.example.android.boardgamesaver.taintedgrail.ui.heroes.HeroesViewModel

class HeroAileiFragment : Fragment() {

    private lateinit var heroesViewModel : HeroesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        heroesViewModel =
            ViewModelProvider(this).get(HeroesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_hero, container, false)

        val heroName: TextView = root.findViewById(R.id.textCharacterName)
        heroesViewModel.aileiName.observe(viewLifecycleOwner, Observer { heroName.text = it })

        //val playerName: TextView = root.findViewById(R.id.editTextPLayerName)
        //heroesViewModel.beorPlayerName.observe(viewLifecycleOwner, Observer { playerName.text = it })
        return root
    }
    companion object {

        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): HeroAileiFragment {
            return HeroAileiFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}