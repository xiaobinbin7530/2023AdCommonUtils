package com.skyworth.photolibrary.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.skyworth.baselibrary.utils.ARouterPathConstant
import com.skyworth.photolibrary.R

@Route(path = ARouterPathConstant.PhotoMainActivity)
class PhotoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photo)
    }
}