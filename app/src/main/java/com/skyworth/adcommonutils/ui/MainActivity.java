package com.skyworth.adcommonutils.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.skyworth.adcommonutils.R;
import com.skyworth.adcommonutils.databinding.ActivityMainBinding;
import com.skyworth.baselibrary.utils.ARouterPathConstant;
import com.skyworth.baselibrary.utils.JumperUtils;

@Route(path = ARouterPathConstant.AppMainActivity)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot()); //用来返回 LinearLayout
        binding.btJumpVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JumperUtils.ARouterJump(ARouterPathConstant.VideoMainActivity);
            }
        });
        binding.btJumpPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JumperUtils.ARouterJump(ARouterPathConstant.PhotoMainActivity);
            }
        });
    }
}