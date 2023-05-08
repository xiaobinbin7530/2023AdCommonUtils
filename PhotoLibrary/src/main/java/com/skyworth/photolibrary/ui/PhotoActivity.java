package com.skyworth.photolibrary.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.skyworth.baselibrary.utils.ARouterPathConstant;
import com.skyworth.photolibrary.R;
@Route(path = ARouterPathConstant.PhotoMainActivity)
public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
    }
}