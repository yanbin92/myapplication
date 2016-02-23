package com.yanb.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/2/23.
 */
public class NDK extends Activity {

    static {
        System.loadLibrary("MyJni");
    }
    public native String getStringFromNative();//本地方法
    public native String getString_From_c();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myjni);
        System.out.println(getStringFromNative());
    }

    public void onClick(View view) {
        System.out.println(getString_From_c());
        Toast.makeText(this, getStringFromNative(), Toast.LENGTH_LONG).show();
    }

}
