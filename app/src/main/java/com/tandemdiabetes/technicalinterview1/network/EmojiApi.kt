package com.tandemdiabetes.technicalinterview1.network

import com.tandemdiabetes.technicalinterview1.domain.Emoji

interface EmojiApi {
    // TODO Implement the function fetchAllEmojis(). The end point lives at the following url: https://emoji-api.com/emojis?access_key=352a31dea84f985ea8f35049d2fb4d268310e14e
    // The function should perform the http call and retrieve the data, which will be a list of Emoji

    suspend fun fetchAllEmojis(): List<Emoji>
}
