package com.skyworth.baselibrary.utils

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.CookieSyncManager
import com.alibaba.android.arouter.launcher.ARouter

object JumperUtils {
    fun JumpTo(activity: Activity, cls: Class<*>?) {
        if (!ToastUtils.isFastClick) {
            try {
                val intent = Intent(activity, cls)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                activity.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                LogUtils.e("JumperUtils", e.message)
            } catch (e: NullPointerException) {
                LogUtils.e("JumperUtils", e.message)
            }
        }
    }

    fun JumpTo(activity: Activity, cls: Class<*>?, bundle: Bundle?) {
        try {
            val intent = Intent(activity, cls)
            intent.putExtras(bundle!!)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            activity.startActivity(intent)
        } catch (e: ActivityNotFoundException) {
            LogUtils.e("JumperUtils", e.message)
        } catch (e: NullPointerException) {
            LogUtils.e("JumperUtils", e.message)
        }
    }

    fun JumpTo(context: Context, cls: Class<*>?) {
        if (!ToastUtils.isFastClick) {
            try {
                val intent = Intent(context, cls)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                context.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                LogUtils.e("JumperUtils", e.message)
            } catch (e: NullPointerException) {
                LogUtils.e("JumperUtils", e.message)
            }
        }
    }

    fun JumpToForResult(activity: Activity, cls: Class<*>?, requestCode: Int) {
        try {
            val intent = Intent(activity, cls)
            activity.startActivityForResult(intent, requestCode)
        } catch (e: Exception) {
            LogUtils.e("JumperUtils", e.message)
        }
    }

    fun JumpToForResult(activity: Activity, cls: Class<*>?, requestCode: Int, bundle: Bundle?) {
        try {
            val intent = Intent(activity, cls)
            intent.putExtras(bundle!!)
            activity.startActivityForResult(intent, requestCode)
        } catch (e: ActivityNotFoundException) {
            LogUtils.e("JumperUtils", e.message)
        } catch (e: NullPointerException) {
            LogUtils.e("JumperUtils", e.message)
        }
    }

    /**
     * 用于显示用户的数据。比较通用，会根据用户的数据类型打开相应的Activity。比如 tel:13400010001打开拨号程序，http://www.g.cn则会打开浏览器等。
     *
     * @param activity
     * @param url
     */
    fun JumpTo(activity: Activity, url: String?) {
        if (!ToastUtils.isFastClick) {
            try {
                val uri = Uri.parse(url)
                val intent = Intent(Intent.ACTION_VIEW, uri)
                activity.startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                LogUtils.e("JumperUtils", e.message)
            } catch (e: NullPointerException) {
                LogUtils.e("JumperUtils", e.message)
            }
        }
    }

    fun ARouterJump(path: String?) {
        ARouter.getInstance().build(path).navigation()
    }

    fun ARouterJump(path: String?, bundle: Bundle?) {
        ARouter.getInstance().build(path).with(bundle).navigation()
    }

    //清除webview的cookie
    fun ClearWebviewCookie(context: Context?) {
        val cookieSyncMngr = CookieSyncManager.createInstance(context)
        val cookieManager = CookieManager.getInstance()
        cookieManager.removeAllCookie()
    }
}