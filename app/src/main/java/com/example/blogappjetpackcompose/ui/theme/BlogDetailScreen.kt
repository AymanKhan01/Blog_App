package com.example.blogreader.ui

import android.annotation.SuppressLint
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import android.net.Uri

@SuppressLint("SetJavaScriptEnabled")
@Composable
fun BlogDetailScreen(navController: NavController, backStackEntry: NavBackStackEntry) {
    val blogUrl = Uri.decode(backStackEntry.arguments?.getString("blogUrl") ?: "")

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                settings.javaScriptEnabled = true
                settings.domStorageEnabled = true
                settings.loadsImagesAutomatically = true
                settings.allowFileAccess = true
                settings.allowContentAccess = true
                webViewClient = WebViewClient()
                loadUrl(blogUrl)
            }
        },
        modifier = Modifier.fillMaxSize()
    )
}
