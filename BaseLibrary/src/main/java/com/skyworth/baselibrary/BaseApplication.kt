package com.skyworth.baselibrary

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

//import android.text.TextUtils;
//
//import com.alibaba.android.arouter.launcher.ARouter;
//import com.kingja.loadsir.core.LoadSir;
//import com.qw.soul.permission.SoulPermission;
//import com.scwang.smart.refresh.footer.ClassicsFooter;
//import com.scwang.smart.refresh.header.ClassicsHeader;
//import com.scwang.smart.refresh.layout.SmartRefreshLayout;
//import com.scwang.smart.refresh.layout.api.RefreshFooter;
//import com.scwang.smart.refresh.layout.api.RefreshHeader;
//import com.scwang.smart.refresh.layout.api.RefreshLayout;
//import com.scwang.smart.refresh.layout.listener.DefaultRefreshFooterCreator;
//import com.scwang.smart.refresh.layout.listener.DefaultRefreshHeaderCreator;
//import com.skyworth.sharedlibrary.BuildConfig;
//import com.skyworth.sharedlibrary.callback.EmptyCallback;
//import com.skyworth.sharedlibrary.callback.ErrorCallback;
//import com.skyworth.sharedlibrary.callback.LoadingCallback;
//import com.skyworth.sharedlibrary.utils.ACache;
//import com.skyworth.sharedlibrary.utils.StaticConstant;
//import com.tencent.bugly.crashreport.CrashReport;
//
//import androidx.multidex.MultiDex;
//import cn.jpush.android.api.JPushInterface;
open class BaseApplication : Application() {
    //    private static ACache mACache;
    //
    //    //static 代码段可以防止内存泄露
    //    static {
    //        //设置全局的Header构建器
    //        SmartRefreshLayout.setDefaultRefreshHeaderCreator(new DefaultRefreshHeaderCreator() {
    //            @Override
    //            public RefreshHeader createRefreshHeader(Context context, RefreshLayout layout) {
    ////                layout.setPrimaryColorsId(R.color.mainThemeColor, android.R.color.white);//全局设置主题颜色
    //                return new ClassicsHeader(context);//.setTimeFormat(new DynamicTimeFormat("更新于 %s"));//指定为经典Header，默认是 贝塞尔雷达Header
    //            }
    //        });
    //        //设置全局的Footer构建器
    //        SmartRefreshLayout.setDefaultRefreshFooterCreator(new DefaultRefreshFooterCreator() {
    //            @Override
    //            public RefreshFooter createRefreshFooter(Context context, RefreshLayout layout) {
    //                //指定为经典Footer，默认是 BallPulseFooter
    //                return new ClassicsFooter(context).setDrawableSize(20);
    //            }
    //        });
    //    }
    override fun onCreate() {
        super.onCreate()
        instance = this
        //路由 跳转
        if (BuildConfig.DEBUG) {
            ARouter.openLog()
            ARouter.openDebug()
        }
        ARouter.init(instance)
        //        mACache = ACache.get(this);
////未同意协议前  不初始化
//        String isFirstShowPolicy = BaseApplication.getACache().getAsString(StaticConstant.ACacheTag.IS_FIRST_SHOW_POLICY);
//        if (!TextUtils.isEmpty(isFirstShowPolicy)) {
//            initOtherSDK();
//        }
    } //    public void initOtherSDK() {

    //        new Thread(new Runnable() {
    //            @Override
    //            public void run() {
    //                //路由 跳转
    //                if (BuildConfig.DEBUG) {
    //                    ARouter.openLog();
    //                    ARouter.openDebug();
    //                }
    //                ARouter.init(instance);
    //                JPushInterface.setDebugMode(true);
    //                JPushInterface.init(instance);
    //                SoulPermission.init(instance);
    //
    //                LoadSir.beginBuilder().addCallback(new LoadingCallback())
    //                        .addCallback(new EmptyCallback())
    //                        .addCallback(new ErrorCallback())
    ////                        .setDefaultCallback(LoadingCallback.class)
    //                        .commit();
    //
    //                //bugly 集成  建议在测试阶段建议设置成true，发布时设置为false。
    //                CrashReport.initCrashReport(getApplicationContext(), StaticConstant.SDKParams.BUGLY_API, BuildConfig.DEBUG);
    //
    //                MultiDex.install(instance);
    //
    //
    //            }
    //        }).start();
    //    }
    //
    //    public static ACache getACache() {
    //        if (mACache == null)
    //            mACache = ACache.get(getInstance());
    //        return mACache;
    //    }
    companion object {
        var instance: BaseApplication? = null
            private set
    }
}