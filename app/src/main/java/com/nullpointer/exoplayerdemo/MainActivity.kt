package com.nullpointer.exoplayerdemo

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dash = "http://www.bok.net/dash/tears_of_steel/cleartext/stream.mpd"
        val hls = "http://qthttp.apple.com.edgesuite.net/1010qwoeiuryfg/sl.m3u8"
        val smoothStreaming = "http://playready.directtaps.net/smoothstreaming/SSWSS720H264/SuperSpeedway_720.ism/Manifest"
        val progressive = "http://ftp.nluug.nl/pub/graphics/blender/demo/movies/Sintel.2010.720p.mkv"

        exoPlayerView.prepare(Uri.parse(smoothStreaming))
    }

    override fun onPause() {
        super.onPause()
        exoPlayerView.onPause()
    }

    override fun onResume() {
        super.onResume()
        exoPlayerView.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        exoPlayerView.onDestroy()
    }
}