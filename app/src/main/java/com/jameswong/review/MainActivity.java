package com.jameswong.review;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text)
    TextView mText;
    @BindView(R.id.btn_sort)
    Button mBtnSort;
    @BindView(R.id.sort)
    TextView mSort;

    int[] array = {
            10,
            5,
            6,
            897,
            516,
            78,
            1
    };
    int[] array2 = {
            72,
            6,
            57,
            88,
            60,
            42,
            83,
            73,
            48,
            85
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        System.out.println(array.toString());
    }

    @OnClick(R.id.btn_sort)
    public void onClick() {
//        insertionSort(array);
//        selectSort(array);
//        sort(array);
//        quick_sort(array2, 0, array2.length - 1);
    }

    /**
     * 插入排序
     *
     * @param a
     * @param <AnyType>
     */
    public <AnyType extends Comparable<? super AnyType>>
    void insertionSort(AnyType[] a) {
        int j;
        for (int p = 1; p < a.length; p++) {
            AnyType temp = a[p];
            for (j = p; j > 0 && temp.compareTo(a[j - 1]) < 0; j--)
                a[j] = a[j - 1];
            a[j] = temp;
        }
        mSort.setText(a.toString());
    }

    /**
     * 选择排序
     *
     * @param a
     */
    public static void selectSort(int[] a) {
        int minIndex = 0;
        int temp = 0;
        if ((a == null) || (a.length == 0))
            return;
        for (int i = 0; i < a.length - 1; i++) {
            minIndex = i;//无序区的最小数据数组下标
            for (int j = i + 1; j < a.length; j++) {
                //在无序区中找到最小数据并保存其数组下标
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                //如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
        }
    }

    /**
     * 冒泡排序
     *
     * @param a
     */
    public void sort(int[] a) {
        int temp = 0;
        for (int i = a.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (a[j + 1] < a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param s
     * @param l
     * @param r
     */
    void quick_sort(int s[], int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }

}
