package com.skyworth.videolibrary.ui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.skyworth.baselibrary.utils.ARouterPathConstant;
import com.skyworth.videolibrary.R;

@Route(path = ARouterPathConstant.VideoMainActivity)
public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
    }
}