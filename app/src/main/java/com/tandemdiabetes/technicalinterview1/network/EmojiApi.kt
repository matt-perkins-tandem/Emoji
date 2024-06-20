package com.tandemdiabetes.technicalinterview1.network

import com.tandemdiabetes.technicalinterview1.domain.Emoji
import retrofit2.http.GET

interface EmojiApi {
    // TODO Implement the function fetchAllEmojis(). The end point lives at the following url: https://emojihub.yurace.pro/api/all
    // The function should perform the http call and retrieve the data, which will be a list of Emoji

    @GET("all")
    suspend fun fetchAllEmojis(): List<Emoji>
}
