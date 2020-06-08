package com.song2.mygitapp.network

import com.song2.mygitapp.data.GetStarResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkService {

    @GET("/users/{username}/starred")
    fun getStarResponse(
        @Path("username") username: String?
    ) : Call<List<GetStarResponse>>
}