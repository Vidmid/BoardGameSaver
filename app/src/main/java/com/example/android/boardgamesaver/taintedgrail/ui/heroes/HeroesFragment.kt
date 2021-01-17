package com.example.android.boardgamesaver.taintedgrail.ui.heroes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android.boardgamesaver.R

class HeroesFragment : Fragment() {

    private lateinit var heroesViewModel: HeroesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val root = inflater.inflate(R.layout.fragment_heroes, container, false)
        return root
    }
}