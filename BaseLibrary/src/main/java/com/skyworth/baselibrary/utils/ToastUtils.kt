package com.skyworth.baselibrary.utils

import android.content.*
import android.widget.Toast
import com.skyworth.baselibrary.BaseApplication

/**
 * Created by xulei on 2016/7/28.
 */
object ToastUtils {
    var LAST_CLOCK_TIME: Long = 0
    private var toast //在类前面声明吐司，确保在这个页面只有一个吐司
            : Toast? = null

    fun toastShort(text: String?) {
        Toast.makeText(BaseApplication.Companion.instance, text, Toast.LENGTH_SHORT).show()
    }

    /**
     * 短时间显示Toast
     *
     * @param info 显示的内容
     */
    fun showToast(context: Context?, info: String?) {
        Toast.makeText(context, info, Toast.LENGTH_SHORT).show()
    }

    /**
     * 长时间显示Toast
     *
     * @param info 显示的内容
     */
    fun showToastLong(context: Context?, info: String?) {
        showToastLong(info)
    }

    /**
     * 短时间显示Toast
     *
     * @param resId 显示的内容
     */
    fun showToast(context: Context?, resId: Int) {
        showToast(resId)
    }

    /**
     * 长时间显示Toast
     *
     * @param resId 显示的内容
     */
    fun showToastLong(context: Context?, resId: Int) {
        showToastLong(resId)
    }

    /**
     * 短时间显示Toast
     *
     * @param info 显示的内容
     */
    fun showToast(info: String?) {
        Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT).show()
    }

    /**
     * 长时间显示Toast
     *
     * @param info 显示的内容
     */
    fun showToastLong(info: String?) {
        Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_LONG).show()
    }

    /**
     * 短时间显示Toast
     *
     * @param resId 显示的内容
     */
    fun showToast(resId: Int) {
        if (toast == null) {
            toast =
                Toast.makeText(BaseApplication.Companion.instance, resId, Toast.LENGTH_SHORT)
        } else {
            toast!!.cancel() //关闭吐司显示
            toast =
                Toast.makeText(BaseApplication.Companion.instance, resId, Toast.LENGTH_SHORT)
        }
        toast?.show() //重新显示吐司
    }

    /**
     * 长时间显示Toast
     *
     * @param resId 显示的内容
     */
    fun showToastLong(resId: Int) {
        Toast.makeText(BaseApplication.Companion.instance, resId, Toast.LENGTH_LONG).show()
    }

    // 防误点
    @get:Synchronized
    val isFastClick: Boolean
        get() {
            val time = System.currentTimeMillis()
            if (time - LAST_CLOCK_TIME < 1000) {
                return true
            }
            LAST_CLOCK_TIME = time
            return false
        }

    /**
     * 连续触发时只弹出一个吐司
     *
     * @param info 吐司内容
     */
    fun showToastOnlyOnce(info: String?) {
        if (toast == null) {
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        } else {
            toast!!.cancel() //关闭吐司显示
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        }
        toast?.show() //重新显示吐司
    }

    fun showToastOnly(info: String?) {
        if (toast == null) {
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        } else {
            toast!!.cancel() //关闭吐司显示
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        }
        toast?.show() //重新显示吐司
    }

    fun showToastOnly(info: Int) {
        if (toast == null) {
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        } else {
            toast!!.cancel() //关闭吐司显示
            toast =
                Toast.makeText(BaseApplication.Companion.instance, info, Toast.LENGTH_SHORT)
        }
        toast?.show() //重新显示吐司
    }
}