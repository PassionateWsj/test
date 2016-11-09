package com.alex.week09_05;

import android.view.MotionEvent;

/**
 * ***********************************************************
 * author: alex
 * time: 16/10/26 下午2:48
 * name:
 * desc:
 * step:
 * *************************************************************
 */
public class EventUtils {

    public static String getEvent(MotionEvent event) {
        String str = "";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                str = "- 按下";
                break;
            case MotionEvent.ACTION_MOVE:
                str = "- 移动";
                break;
            case MotionEvent.ACTION_UP:
                str = "- 抬起";
                break;
        }
        return str;
    }
}
