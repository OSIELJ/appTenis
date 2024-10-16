package com.example.myapplication.retrofit

import com.example.myapplication.data.TenisList
import retrofit2.Call
import retrofit2.http.GET

interface TenisApi {

    @GET("aleatorio")
    fun getRandomTenis(): Call<TenisList>
}