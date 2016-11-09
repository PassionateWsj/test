package com.jameswong.equals;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat c1 = new Cat(1, 1, 1);
        Cat c2 = new Cat(1, 1, 1);
        System.out.println("c1==c2的结果是：" + (c1 == c2));//false
        System.out.println("c1.equals(c2)的结果是：" + c1.equals(c2));//false
    }
}

class Cat {
    int color, weight, height;

    public Cat(int color, int weight, int height) {
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }
}
