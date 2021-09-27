package com.example.evaluation2

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class ViewHolderClass(private val itemView: View) : RecyclerView.ViewHolder(itemView) {


    fun setData(resultsDTO: ResultsDTO) {
       itemView.tvArtistName.text=resultsDTO.artistName
        itemView.tvSongName.text=resultsDTO.trackName
        Glide.with(itemView.context).load(resultsDTO.previewUrl).into(itemView.ivSongPic)
    }

}