package com.example.blogreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.blogreader.ui.BlogListScreen
import com.example.blogreader.ui.BlogDetailScreen
import com.example.blogreader.viewmodel.BlogViewModel
import com.example.blogreader.data.BlogRepository
import com.example.blogreader.data.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import android.webkit.WebView
import android.util.Log

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val apiService = Retrofit.Builder()
            .baseUrl("https://blog.vrid.in/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)

        val repository = BlogRepository(apiService)
        val viewModel = BlogViewModel(repository)

        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = "blogList") {
                composable("blogList") { BlogListScreen(navController, viewModel) }
                composable("blogDetail/{blogUrl}") { backStackEntry ->
                    BlogDetailScreen(navController, backStackEntry)
                }
            }
        }
    }
}
