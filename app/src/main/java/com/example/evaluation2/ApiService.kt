package com.example.evaluation2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search")
    fun getData(@Query("term") string:String):Call<ResponseDTO>
}