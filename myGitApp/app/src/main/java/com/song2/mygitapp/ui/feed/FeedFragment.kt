package com.song2.mygitapp.ui.feed

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.song2.mygitapp.R

class FeedFragment : Fragment(R.layout.fragment_feed) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setRecyclerView()
    }

    fun setRecyclerView(){
        val adapter = TestListAdapter()
        adapter.submitList(listOf(Test("", "")))
    }

}