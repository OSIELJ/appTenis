package com.example.myapplication.retrofit

import com.example.myapplication.data.Tennis
import retrofit2.Call
import retrofit2.http.GET

interface TenisApi {

    @GET("aleatorio")
    fun getRandomTenis(): Call<Tennis>
}