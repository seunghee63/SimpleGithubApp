package com.song2.mygitapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.song2.mygitapp.R
import com.song2.mygitapp.ui.Test
import com.song2.mygitapp.ui.TestListAdapter

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setRecyclerView()

    }

    fun setRecyclerView(){
        val adapter = TestListAdapter()
        adapter.submitList(listOf(Test("", "")))
    }
}