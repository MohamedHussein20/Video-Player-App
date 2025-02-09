package com.memo.videoplayer

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                YoutubePlayer(
                    youtubeVideoId = "VZGMXcVafoE",
                    lifeCycleOwner = this@MainActivity
                )
                Spacer(modifier = Modifier.height(16.dp))
                VideoPlayer(
                    videoUri = Uri.parse(
                        "android.resource://com.memo.videoplayer/raw/video_mp4"
                    )
                )
            }
        }
    }
}