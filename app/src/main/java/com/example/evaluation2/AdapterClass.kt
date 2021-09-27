package com.example.evaluation2

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import java.util.ArrayList

class AdapterClass(private val resultsDTOList: List<ResultsDTO>):RecyclerView.Adapter<ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
       val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolderClass(view)
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val resultsDTO=resultsDTOList[position]
        holder.setData(resultsDTO)
    }

    override fun getItemCount(): Int {
        return resultsDTOList.size
    }
}

