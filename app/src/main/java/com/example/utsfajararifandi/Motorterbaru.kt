package com.example.utsfajararifandi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Motorterbaru(
    val imgMotorterbaru: Int,
    val nameMotorterbaru: String,
    val descMotorterbaru: String
) : Parcelable
