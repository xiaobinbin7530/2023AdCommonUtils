package com.skyworth.baselibrary.utils;

import android.content.Context;
import android.widget.Toast;


import com.skyworth.baselibrary.BaseApplication;

import static android.widget.Toast.makeText;


/**
 * Created by xulei on 2016/7/28.
 */
public class ToastUtils {
    public static long LAST_CLOCK_TIME;
    private static Toast toast;//在类前面声明吐司，确保在这个页面只有一个吐司

    public static void toastShort(String text) {
        makeText(BaseApplication.getInstance(), text, Toast.LENGTH_SHORT).show();
    }

    /**
     * 短时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToast(Context context, String info) {
        makeText(context, info, Toast.LENGTH_SHORT).show();

    }

    /**
     * 长时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToastLong(Context context, String info) {
        showToastLong(info);
    }

    /**
     * 短时间显示Toast
     *
     * @param resId 显示的内容
     */
    public static void showToast(Context context, int resId) {
        showToast(resId);
    }

    /**
     * 长时间显示Toast
     *
     * @param resId 显示的内容
     */
    public static void showToastLong(Context context, int resId) {
        showToastLong(resId);
    }

    /**
     * 短时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToast(String info) {

        makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param info 显示的内容
     */
    public static void showToastLong(String info) {
        makeText(BaseApplication.getInstance(), info, Toast.LENGTH_LONG).show();
    }

    /**
     * 短时间显示Toast
     *
     * @param resId 显示的内容
     */
    public static void showToast(int resId) {
        if (toast == null) {
            toast = makeText(BaseApplication.getInstance(), resId, Toast.LENGTH_SHORT);
        } else {
            toast.cancel();//关闭吐司显示
            toast = makeText(BaseApplication.getInstance(), resId, Toast.LENGTH_SHORT);
        }
        toast.show();//重新显示吐司
    }

    /**
     * 长时间显示Toast
     *
     * @param resId 显示的内容
     */
    public static void showToastLong(int resId) {
        makeText(BaseApplication.getInstance(), resId, Toast.LENGTH_LONG).show();
    }

    // 防误点
    public synchronized static boolean isFastClick() {
        long time = System.currentTimeMillis();
        if (time - LAST_CLOCK_TIME < 1000) {
            return true;
        }
        LAST_CLOCK_TIME = time;
        return false;
    }

    /**
     * 连续触发时只弹出一个吐司
     *
     * @param info 吐司内容
     */
    public static void showToastOnlyOnce(String info) {
        if (toast == null) {
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        } else {
            toast.cancel();//关闭吐司显示
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        }
        toast.show();//重新显示吐司
    }

    public static void showToastOnly(String info) {
        if (toast == null) {
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        } else {
            toast.cancel();//关闭吐司显示
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        }
        toast.show();//重新显示吐司
    }

    public static void showToastOnly(int info) {
        if (toast == null) {
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        } else {
            toast.cancel();//关闭吐司显示
            toast = makeText(BaseApplication.getInstance(), info, Toast.LENGTH_SHORT);
        }
        toast.show();//重新显示吐司
    }


}
