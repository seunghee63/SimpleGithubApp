package com.song2.mygitapp.data


import com.google.gson.annotations.SerializedName

data class GetFeedResponse(
    @SerializedName("actor")
    val actor: Actor,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("org")
    val org: Org,
    @SerializedName("payload")
    val payload: Payload,
    @SerializedName("public")
    val `public`: Boolean,
    @SerializedName("repo")
    val repo: Repo,
    @SerializedName("type")
    val type: String
)