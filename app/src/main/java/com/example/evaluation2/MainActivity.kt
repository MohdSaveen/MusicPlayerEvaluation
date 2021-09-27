package com.example.evaluation2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private var resultsDTOList :List<ResultsDTO> = listOf<ResultsDTO>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch.setOnClickListener {
            callAPI()
        }

    }

    private fun callAPI() {
        val apiService=Network.getRetrofitInstance().create(ApiService::class.java)
        apiService.getData(etSearchSong.text.toString())
            .enqueue(object:Callback<ResponseDTO>{
                override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                    resultsDTOList= response.body()?.results!!
                    setRecyclerView()
                }

                override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })

    }

    private fun setRecyclerView(){
        val adapterClass=AdapterClass(resultsDTOList)
        val linearLayoutManager=LinearLayoutManager(this)
        recyclerView.adapter=adapterClass
        recyclerView.layoutManager=linearLayoutManager
    }

}