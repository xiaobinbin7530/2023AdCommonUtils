package com.skyworth.baselibrary.utils;

import android.util.Log;


/**
 * 日志打印类。
 * 所有log打印需使用。
 *
 */
public class LogUtils {
	public final static boolean CESHI = true;
	public final static String tag = "mylog";

	public static void e(String tag, Object msg) {
		if (CESHI) {
			if (null == msg) {
				return;
			}
			Log.e(LogUtils.tag, tag+":"+msg.toString());
		}
	}
	public static void i(String tag, Object msg) {
		if (CESHI) {
			if (null == msg) {
				return;
			}
			Log.i(LogUtils.tag, tag+":"+msg.toString());
		}
	}
	public static void d(String tag, Object msg) {
		if (CESHI) {
			if (null == msg) {
				return;
			}
			Log.d(LogUtils.tag, tag+":"+msg.toString());
		}
	}
	public static void v(String tag, Object msg) {
		if (CESHI) {
			if (null == msg) {
				return;
			}
			Log.v(LogUtils.tag, tag+":"+msg.toString());
		}
	}
}