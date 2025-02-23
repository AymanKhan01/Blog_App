package com.example.blogreader.data

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class BlogRepository(private val apiService: ApiService) {
    fun fetchBlogs(): Flow<List<Blog>> = flow {
        emit(apiService.getBlogs())
    }
}
