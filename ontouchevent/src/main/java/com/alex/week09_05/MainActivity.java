package com.alex.week09_05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.my_view)
    MyView mMyView;
    @BindView(R.id.my_view_group)
    MyViewGroup mMyViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mMyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag", "mMyView::内部类::OnClick");
            }
        });
        mMyViewGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("tag", "mMyViewGroup::内部类::OnClick");
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("tag", "MainActivity::dispatchTouchEvent:" + EventUtils.getEvent(ev));
        return super.dispatchTouchEvent(ev);
//        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("tag", "MainActivity::onTouchEvent:" + EventUtils.getEvent(event));
        return super.onTouchEvent(event);
//        return true;
    }

    @OnClick({R.id.my_view, R.id.my_view_group})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_view:
                Log.i("tag", "mMyView::view.getId()::OnClick");
                break;
            case R.id.my_view_group:
                Log.i("tag", "mMyViewGroup::view.getId()::OnClick");
                break;
        }
    }
}
