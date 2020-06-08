package com.song2.mygitapp.ui.mypage

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.song2.mygitapp.R
import com.song2.mygitapp.data.GetStarResponse
import com.song2.mygitapp.network.ApplicationClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MyPageFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        getStarResponse("seunghee63")
        return inflater.inflate(R.layout.fragment_mypage, container, false)
    }

    private fun getStarResponse(id: String) {
        val getStarResponse =
            ApplicationClient.service.getStarResponse(id)

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