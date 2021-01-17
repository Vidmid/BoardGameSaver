package com.example.android.boardgamesaver.taintedgrail.ui.achievements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.android.boardgamesaver.R
import java.util.zip.Inflater

class AchievementsFragment : Fragment() {

    private lateinit var achievementsViewModel : AchievementsViewModel

            override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
                achievementsViewModel = ViewModelProvider(this).get(AchievementsViewModel::class.java)
                val root = inflater.inflate(R.layout.fragment_achievements, container, false)
                return root
    }
}