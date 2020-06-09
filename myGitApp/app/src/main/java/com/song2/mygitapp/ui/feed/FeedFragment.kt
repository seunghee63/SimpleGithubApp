package com.song2.mygitapp.ui.feed

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.song2.mygitapp.R
import com.song2.mygitapp.data.GetFeedResponse
import com.song2.mygitapp.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FeedFragment : Fragment(R.layout.fragment_feed) {

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        getFeedResponse("seunghee63")
    }

    private fun getFeedResponse(id : String?) {
        val getFeedResponse =
            ApiClient.service.getFeedResponse(id)

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