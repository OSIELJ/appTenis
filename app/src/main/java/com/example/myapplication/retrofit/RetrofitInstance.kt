package com.example.myapplication.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api:TenisApi by lazy {
        Retrofit.Builder()
            .baseUrl("http://localhost:8080/api/tenis/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(TenisApi::class.java)
    }
}