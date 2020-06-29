package com.song2.mygitapp.ui.feed

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.song2.mygitapp.R
import com.song2.mygitapp.data.GetFeedResponse
import com.song2.mygitapp.network.MyGitApplication.Companion.getMyGitApplication
import com.song2.mygitapp.ui.star.StarListAdapter
import com.song2.mygitapp.ui.star.StarRepo
import kotlinx.android.synthetic.main.fragment_feed.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FeedFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        getFeedResponse("seunghee63")
    }

    private fun setRecyclerView(){
        val adapter = StarListAdapter()
        adapter.submitList(listOf(StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),
            StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan")
        ))
        rv_feed_list.layoutManager = LinearLayoutManager(activity)
        rv_feed_list.adapter = adapter
    }

    private fun getFeedResponse(id : String?) {
        val getFeedResponse = getMyGitApplication().service.getFeedResponse(id)

        getFeedResponse.enqueue(object : Callback<List<GetFeedResponse>> {

            override fun onFailure(call: Call<List<GetFeedResponse>>, t: Throwable) {
                Log.e("get feed fail", t.toString())
            }

            override fun onResponse(
                call: Call<List<GetFeedResponse>>,
                response: Response<List<GetFeedResponse>>
            ) {
                if (response.isSuccessful) {
                    Log.v("get feed Success", "성공 +${response.body()!!}")

                } else {
                    Log.v("get feed Success", "성공 - error")
                }
            }
        })
    }

}