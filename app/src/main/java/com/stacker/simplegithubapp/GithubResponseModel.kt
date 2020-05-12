package com.stacker.simplegithubapp

import com.google.gson.annotations.SerializedName

class GithubResponseModel {
    @SerializedName("login")
    val login: String = ""

    @SerializedName("avatar_url")
    val avatar_url: String =""

    @SerializedName("followers_url")
    val followers_url: String =""

    @SerializedName("items")
    val items: List<GithubRepoModel> = listOf()
}