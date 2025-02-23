package com.example.blogreader.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.blogreader.data.Blog
import com.example.blogreader.data.BlogRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class BlogViewModel(private val repository: BlogRepository) : ViewModel() {
    private val _blogs = MutableStateFlow<List<Blog>>(emptyList())
    val blogs = _blogs.asStateFlow()

    fun fetchBlogs() {
        viewModelScope.launch {
            repository.fetchBlogs().collect { _blogs.value = it }
        }
    }
}
