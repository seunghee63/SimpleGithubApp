package com.song2.mygitapp.ui.star

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.song2.mygitapp.R
import com.song2.mygitapp.data.GetStarResponse
import com.song2.mygitapp.network.MyGitApplication.Companion.getMyGitApplication
import kotlinx.android.synthetic.main.fragment_star.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StarFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_star, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setRecyclerView()
        getStarResponse("seunghee63")
    }

    private fun setRecyclerView(){
        val adapter = StarListAdapter()
        adapter.submitList(listOf(StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan"),StarRepo("0", "seunghee63","FlowerRecognition","This project identify some kind of flowers and developed by Android users.", " Java", 3,"16 Jan")))
        rv_star_list.layoutManager = LinearLayoutManager(activity)
        rv_star_list.adapter = adapter
    }

    private fun getStarResponse(id: String) {
        val getStarResponse =
            getMyGitApplication().service.getStarResponse(id)

        getStarResponse.enqueue(object : Callback<List<GetStarResponse>> {

            override fun onFailure(call: Call<List<GetStarResponse>>, t: Throwable) {
                Log.e("get StarList fail", t.toString())
            }

            override fun onResponse(
                call: Call<List<GetStarResponse>>,
                response: Response<List<GetStarResponse>>
            ) {
                if (response.isSuccessful) {
                    Log.v("get StarList Success", "성공 +${response.body()!!}")

                } else {
                    Log.v("get StarList Success", "성공 - error")
                }
            }
        })
    }
}