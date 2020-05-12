package com.stacker.simplegithubapp

import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable

class GitHubAPI {

    interface GithubAPIlmpl{
        @GET("/search/repositories")
        fun getRepoList(@Query("q") query: String): Observable<GithubResponseModel>
    }

    companion object{
        fun getRepoList(query: String): Observable<GithubResponseModel>{
            return RetrofitCreator.create(GithubAPIlmpl::class.java).getRepoList(query)
        }
    }
}