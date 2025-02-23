package com.example.blogreader.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.blogreader.data.Blog
import com.example.blogreader.viewmodel.BlogViewModel

@Composable
fun BlogListScreen(navController: NavController, viewModel: BlogViewModel) {
    val blogs by viewModel.blogs.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.fetchBlogs()
    }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Blog Reader") }) }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            if (blogs.isEmpty()) {
                Text(
                    text = "No blogs available",
                    modifier = Modifier.padding(16.dp)
                )
            } else {
                LazyColumn(contentPadding = PaddingValues(16.dp)) {
                    items(blogs) { blog ->
                        BlogItem(blog, onClick = {
                            val encodedUrl = java.net.URLEncoder.encode(blog.link, "UTF-8")
                            navController.navigate("blogDetail/$encodedUrl")
                        })
                    }
                }
            }
        }
    }
}

@Composable
fun BlogItem(blog: Blog, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick),
        elevation = 4.dp
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = blog.title.rendered, style = MaterialTheme.typography.h6)
        }
    }
}
