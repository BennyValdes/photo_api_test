package com.example.photoapitest.model.remote

import com.example.photoapitest.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Network {
    val api: PhotoApi by lazy{
        initRetrofit()
    }

    private fun initRetrofit(): PhotoApi {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PhotoApi::class.java)
    }
}