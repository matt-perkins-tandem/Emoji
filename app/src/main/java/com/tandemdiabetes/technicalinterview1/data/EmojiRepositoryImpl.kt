package com.tandemdiabetes.technicalinterview1.data

import com.tandemdiabetes.technicalinterview1.domain.Emoji
import com.tandemdiabetes.technicalinterview1.domain.EmojiRepository
import com.tandemdiabetes.technicalinterview1.network.EmojiApi
import javax.inject.Inject
import javax.inject.Singleton

class EmojiRepositoryImpl @Inject constructor(
    private val api: EmojiApi
) : EmojiRepository {

    override suspend fun fetchAllEmojis(): Result<List<Emoji>> {
        return try {
            api.fetchAllEmojis().let {
                return Result.success(it)
            }
        } catch (e: Exception) {
            return Result.failure(e)
        }
    }
}
