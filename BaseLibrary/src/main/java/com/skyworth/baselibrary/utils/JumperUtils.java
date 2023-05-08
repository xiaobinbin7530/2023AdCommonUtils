package com.skyworth.baselibrary.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;

import com.alibaba.android.arouter.launcher.ARouter;


public class JumperUtils {
    public static void JumpTo(Activity activity, Class<?> cls) {
        if (!ToastUtils.isFastClick()) {
            try {
                Intent intent = new Intent(activity, cls);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                activity.startActivity(intent);
            } catch (ActivityNotFoundException | NullPointerException e) {
                LogUtils.e("JumperUtils", e.getMessage());
            }
        }
    }

    public static void JumpTo(Activity activity, Class<?> cls, Bundle bundle) {
        try {
            Intent intent = new Intent(activity, cls);
            intent.putExtras(bundle);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            activity.startActivity(intent);
        } catch (ActivityNotFoundException | NullPointerException e) {
            LogUtils.e("JumperUtils", e.getMessage());
        }
    }

    public static void JumpTo(Context context, Class<?> cls) {
        if (!ToastUtils.isFastClick()) {
            try {
                Intent intent = new Intent(context, cls);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            } catch (ActivityNotFoundException | NullPointerException e) {
                LogUtils.e("JumperUtils", e.getMessage());
            }
        }
    }


    public static void JumpToForResult(Activity activity, Class<?> cls, int requestCode) {
        try {
            Intent intent = new Intent(activity, cls);
            activity.startActivityForResult(intent, requestCode);
        } catch (Exception e) {
            LogUtils.e("JumperUtils", e.getMessage());
        }
    }


    public static void JumpToForResult(Activity activity, Class<?> cls, int requestCode, Bundle bundle) {
        try {
            Intent intent = new Intent(activity, cls);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, requestCode);
        } catch (ActivityNotFoundException | NullPointerException e) {
            LogUtils.e("JumperUtils", e.getMessage());
        }
    }

    /**
     * 用于显示用户的数据。比较通用，会根据用户的数据类型打开相应的Activity。比如 tel:13400010001打开拨号程序，http://www.g.cn则会打开浏览器等。
     *
     * @param activity
     * @param url
     */
    public static void JumpTo(Activity activity, String url) {
        if (!ToastUtils.isFastClick()) {
            try {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                activity.startActivity(intent);
            } catch (ActivityNotFoundException | NullPointerException e) {
                LogUtils.e("JumperUtils", e.getMessage());
            }
        }
    }

    public static void ARouterJump(String path) {
        ARouter.getInstance().build(path).navigation();
    }

    public static void ARouterJump(String path, Bundle bundle) {
        ARouter.getInstance().build(path).with(bundle).navigation();
    }

    //清除webview的cookie
    public static void ClearWebviewCookie(Context context){
        CookieSyncManager cookieSyncMngr =
                CookieSyncManager.createInstance(context);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookie();
    }
}



