package com.zhongsm.androidlibs;

import android.content.Context;
import android.widget.Toast;

public class ZhongsmTool {
    public static void sayHello(Context context) {
        Toast.makeText(context, "你好，这里是由「衷水木」提供的测试库！", Toast.LENGTH_LONG).show();
    }
}
