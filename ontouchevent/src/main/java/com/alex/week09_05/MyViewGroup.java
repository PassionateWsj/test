package com.alex.week09_05;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * ***********************************************************
 * author: alex
 * time: 16/10/26 下午2:41
 * name:
 * desc:
 * step:
 * *************************************************************
 */
public class MyViewGroup extends LinearLayout {
    public MyViewGroup(Context context) {
        super(context);
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //事件的分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.e("tag", "MyViewGroup::dispatchTouchEvent" + EventUtils.getEvent(ev));
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    //
    //事件的拦截
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        Log.e("tag", "MyViewGroup::onInterceptTouchEvent" + EventUtils.getEvent(ev));
        return super.onInterceptTouchEvent(ev);
//        return true;
    }

    //事件处理
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        Log.e("tag", "MyViewGroup::onTouchEvent" + EventUtils.getEvent(event));
        return super.onTouchEvent(event);
//        return true;
    }

}
