package com.alex.week09_05;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * ***********************************************************
 * author: alex
 * time: 16/10/26 下午2:52
 * name:
 * desc:
 * step:
 * *************************************************************
 */
public class MyView extends TextView {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.w("tag", "MyView::dispatchTouchEvent" + EventUtils.getEvent(event));
        return super.dispatchTouchEvent(event);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.w("tag", "MyView::onTouchEvent" + EventUtils.getEvent(event));
//        return super.onTouchEvent(event);
        return true;
    }
}
