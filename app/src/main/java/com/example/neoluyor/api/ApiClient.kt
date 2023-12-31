package com.example.neoluyor.api

import com.example.neoluyor.utils.Constant.BASE_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private val moshi= Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
private val retrofit=Retrofit.Builder()
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

object Haber{
    val retrofitService:ApiService by lazy { retrofit.create(ApiService::class.java) }
}