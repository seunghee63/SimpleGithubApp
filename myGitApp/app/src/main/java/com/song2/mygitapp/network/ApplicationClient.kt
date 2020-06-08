package com.song2.mygitapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApplicationClient{
    private const val BASE_URL = "https://api.github.com/"

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: NetworkService = retrofit.create(NetworkService::class.java)
}