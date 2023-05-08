package com.skyworth.videolibrary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.skyworth.baselibrary.utils.ARouterPathConstant
import com.skyworth.videolibrary.R

@Route(path = ARouterPathConstant.VideoMainActivity)
class VideoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)
    }
}