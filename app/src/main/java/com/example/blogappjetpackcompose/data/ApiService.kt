package com.example.blogreader.data

import retrofit2.http.GET

interface ApiService {
    @GET("wp-json/wp/v2/posts?per_page=10&page=1")
    suspend fun getBlogs(): List<Blog>
}
