package com.song2.mygitapp.network

import com.song2.mygitapp.data.GetFeedResponse
import com.song2.mygitapp.data.GetStarResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface NetworkService {
    companion object{
        val BASE_URL = "https://api.github.com/"
    }

    @GET("/users/{username}/starred")
    fun getStarResponse(
        @Path("username") username: String?
    ) : Call<List<GetStarResponse>>

    @GET("/users/{username}/received_events/public")
    fun getFeedResponse(
        @Path("username") username: String?
    ) : Call<List<GetFeedResponse>>
}