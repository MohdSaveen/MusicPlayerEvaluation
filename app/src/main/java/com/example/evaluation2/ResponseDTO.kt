package com.example.evaluation2

import com.google.gson.annotations.SerializedName
import com.example.evaluation2.ResultsDTO
import java.io.Serializable

class ResponseDTO : Serializable {
    @SerializedName("resultCount")
    val resultCount = 0

    @SerializedName("results")
    val results: List<ResultsDTO>? = null
}