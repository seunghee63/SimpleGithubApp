package com.stacker.simplegithubapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Search : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity!!.findViewById<Button>(R.id.search_btnSearch).setOnClickListener(){

        }

        val searchlist = listOf<SimpleProfile>(
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ"),
            SimpleProfile("송현석","무직","????","ㅁㄴㅇㄻㄴㅇㄹ")
        )

        val rv = activity!!.findViewById<RecyclerView>(R.id.Recyclear_Search)
        val adpater = SimpleProfileAdapter()

        adpater.initSimpleProfileItems(searchlist)

        rv.adapter = adpater
        rv.layoutManager = LinearLayoutManager(context)
    }
}