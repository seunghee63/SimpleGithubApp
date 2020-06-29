package com.song2.mygitapp.network

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MyGitApplication : Application() {

    lateinit var service: NetworkService

    companion object {

        lateinit var instance: MyGitApplication
        fun getMyGitApplication(): MyGitApplication {
            return instance
        }
    }


    override fun onCreate() {
        super.onCreate()
        val BASE_URL = "https://api.github.com/"
        instance = this

        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(NetworkService::class.java)
    }
}