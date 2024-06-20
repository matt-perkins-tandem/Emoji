package com.tandemdiabetes.technicalinterview1.di

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.tandemdiabetes.technicalinterview1.data.EmojiRepositoryImpl
import com.tandemdiabetes.technicalinterview1.domain.EmojiRepository
import com.tandemdiabetes.technicalinterview1.network.EmojiApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {
    // TODO OPTIONAL If you decide to use DI, you should implement the network module here


    companion object {
        @Provides
        @Singleton
        fun creteRetrofit(): EmojiApi {
            // we can provide OkHttpClient and moshi and DI also for Now I am putting here
            val moshi = Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
            val retrofit = Retrofit.Builder()
                .baseUrl("https://emojihub.yurace.pro/api/")
                .client(OkHttpClient.Builder().build())
                .addConverterFactory(MoshiConverterFactory.create(moshi))
                .build()

            val service: EmojiApi = retrofit.create(EmojiApi::class.java)
            return service
        }
    }

    @Binds
    abstract fun emojiRepo(emojiRepositoryImpl: EmojiRepositoryImpl): EmojiRepository

}
