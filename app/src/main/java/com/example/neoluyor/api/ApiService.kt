package com.example.neoluyor.api

import com.example.neoluyor.response.HaberResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    //https://newsapi.org/v2/top-headlines?country=tr&apiKey=cc89e561914e4e33a8f45aa7adcb03eb

    @GET("top-headlines?country=tr")
    fun getNewsPaper(@Query("page") page:Int): Call<HaberResponse>
}