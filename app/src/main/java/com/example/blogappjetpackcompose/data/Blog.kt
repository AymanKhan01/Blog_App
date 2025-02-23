package com.example.blogreader.data

import com.google.gson.annotations.SerializedName

data class Blog(
    val id: Int,
    val title: Title,
    val link: String
)

data class Title(
    val rendered: String
)
