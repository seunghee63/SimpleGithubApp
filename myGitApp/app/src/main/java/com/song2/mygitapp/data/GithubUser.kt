package com.song2.mygitapp.data


import com.google.gson.annotations.SerializedName

data class GithubUser(
    @SerializedName("avatar_url")
    val avatarUrl: String,
    @SerializedName("display_login")
    val displayLogin: String,
    @SerializedName("gravatar_id")
    val gravatarId: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("login")
    val login: String,
    @SerializedName("url")
    val url: String
)