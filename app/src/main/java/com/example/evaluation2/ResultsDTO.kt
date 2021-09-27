package com.example.evaluation2

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResultsDTO : Serializable {
    @SerializedName("wrapperType")
    val wrapperType: String? = null

    @SerializedName("kind")
    val kind: String? = null

    @SerializedName("artistId")
    val artistId = 0

    @SerializedName("collectionId")
    val collectionId = 0

    @SerializedName("trackId")
    val trackId = 0

    @SerializedName("artistName")
    val artistName: String? = null

    @SerializedName("collectionName")
    val collectionName: String? = null

    @SerializedName("trackName")
    val trackName: String? = null

    @SerializedName("collectionCensoredName")
    val collectionCensoredName: String? = null

    @SerializedName("trackCensoredName")
    val trackCensoredName: String? = null

    @SerializedName("artistViewUrl")
    val artistViewUrl: String? = null

    @SerializedName("collectionViewUrl")
    val collectionViewUrl: String? = null

    @SerializedName("trackViewUrl")
    val trackViewUrl: String? = null

    @SerializedName("previewUrl")
    val previewUrl: String? = null

    @SerializedName("artworkUrl30")
    val artworkUrl30: String? = null

    @SerializedName("artworkUrl60")
    val artworkUrl60: String? = null

    @SerializedName("artworkUrl100")
    val artworkUrl100: String? = null

    @SerializedName("collectionPrice")
    val collectionPrice: Any? = null

    @SerializedName("trackPrice")
    val trackPrice: Any? = null

    @SerializedName("releaseDate")
    val releaseDate: String? = null

    @SerializedName("collectionExplicitness")
    val collectionExplicitness: String? = null

    @SerializedName("trackExplicitness")
    val trackExplicitness: String? = null

    @SerializedName("discCount")
    val discCount = 0

    @SerializedName("discNumber")
    val discNumber = 0

    @SerializedName("trackCount")
    val trackCount = 0

    @SerializedName("trackNumber")
    val trackNumber = 0

    @SerializedName("trackTimeMillis")
    val trackTimeMillis = 0

    @SerializedName("country")
    val country: String? = null

    @SerializedName("currency")
    val currency: String? = null

    @SerializedName("primaryGenreName")
    val primaryGenreName: String? = null

    @SerializedName("isStreamable")
    val isIsStreamable = false
}