package com.skyworth.adcommonutils.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.skyworth.adcommonutils.databinding.ActivityMainBinding
import com.skyworth.baselibrary.utils.ARouterPathConstant
import com.skyworth.baselibrary.utils.JumperUtils

@Route(path = ARouterPathConstant.AppMainActivity)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root) //用来返回 LinearLayout
        binding.btJumpVideo.setOnClickListener { JumperUtils.ARouterJump(ARouterPathConstant.VideoMainActivity) }
        binding.btJumpPhoto.setOnClickListener { JumperUtils.ARouterJump(ARouterPathConstant.PhotoMainActivity) }
    }
}