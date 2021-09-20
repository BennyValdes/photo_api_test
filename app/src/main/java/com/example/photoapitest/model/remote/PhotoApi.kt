package com.example.photoapitest.model.remote

import com.example.photoapitest.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

interface PhotoApi {
    // https://pixabay.com/
    // api/?
    // key=23408719-4037e6fe68e88ad73a5c30d0b&
    // safesearch=true
    // per_page=50&
    @GET(BuildConfig.END_POINT)
    //COROUTINES
    suspend fun getPhotos(
        @Query("key") key: String = "23408719-4037e6fe68e88ad73a5c30d0b",
        @Query("safesearch") searchType: Boolean = true,
        @Query("per_page") responseSize: Int = 50
    )
}