package com.song2.mygitapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.song2.mygitapp.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentHomeBinding.inflate(inflater, container, false)
            .apply { info = Info("Seunghee63", "이미ㅣ지지") }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        val adapter = GrassListAdapter()
        adapter.submitList(
            listOf(
                Grass("2020,2", 0),
                Grass("2020,3", 1),
                Grass("2020,3", 1),
                Grass("2020,3", 70),
                Grass("2020,3", 4),
                Grass("2020,3", 100),
                Grass("2020,3", 1),
                Grass("2020,3", 1000),
                Grass("2020,3", 0),
                Grass("2020,3", 4),
                Grass("2020,3", 100),
                Grass("2020,3", 1),
                Grass("2020,3", 1),
                Grass("2020,3", 70),
                Grass("2020,3", 4),
                Grass("2020,3", 100),
                Grass("2020,3", 1000),
                Grass("2020,3", 0),
                Grass("2020,3", 4),
                Grass("2020,3", 100),
                Grass("2020,3", 1),
                Grass("2020,3", 1),
                Grass("2020,3", 70),
                Grass("2020,3", 4),
                Grass("2020,3", 100),
                Grass("2020,3", 1),
                Grass("2020,3", 1000),
                Grass("2020,3", 0),
                Grass("2020,3", 4),
                Grass("2020,3", 100)
            )
        )
        rv_grass_list.layoutManager = GridLayoutManager(activity, 7)
        rv_grass_list.adapter = adapter
    }

    data class Info(
        val nickname: String,
        val profile: String
    )

}