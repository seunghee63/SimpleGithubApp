package com.stacker.simplegithubapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Follower : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_follower, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val follwerlist = listOf<SimpleProfile>(
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석", "무직", "????", "ㅁㄴㅇㄻㄴㅇㄹ")
        )


        val rv = activity!!.findViewById<RecyclerView>(R.id.follower_recyclerFollower)
        val adapter = SimpleProfileAdapter()

        adapter.initSimpleProfileItems(follwerlist)

        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)
    }
}