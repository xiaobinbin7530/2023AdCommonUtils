package com.skyworth.baselibrary.utils

import android.util.Log

/**
 * 日志打印类。
 * 所有log打印需使用。
 *
 */
object LogUtils {
    const val CESHI = true
    const val tag = "mylog"
    fun e(tag: String, msg: Any?) {
        if (CESHI) {
            if (null == msg) {
                return
            }
            Log.e(LogUtils.tag, "$tag:$msg")
        }
    }

    fun i(tag: String, msg: Any?) {
        if (CESHI) {
            if (null == msg) {
                return
            }
            Log.i(LogUtils.tag, "$tag:$msg")
        }
    }

    fun d(tag: String, msg: Any?) {
        if (CESHI) {
            if (null == msg) {
                return
            }
            Log.d(LogUtils.tag, "$tag:$msg")
        }
    }

    fun v(tag: String, msg: Any?) {
        if (CESHI) {
            if (null == msg) {
                return
            }
            Log.v(LogUtils.tag, "$tag:$msg")
        }
    }
}