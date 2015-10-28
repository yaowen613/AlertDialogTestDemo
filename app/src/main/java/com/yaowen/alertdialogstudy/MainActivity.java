package com.yaowen.alertdialogstudy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * @author YAOWEN
 *         create on 2015-10-28
 **/
public class MainActivity extends AppCompatActivity {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);

        btn1.setOnClickListener(new MyListener());
        btn2.setOnClickListener(new MyListener());
        btn3.setOnClickListener(new MyListener());
        btn4.setOnClickListener(new MyListener());
        btn5.setOnClickListener(new MyListener());
        btn6.setOnClickListener(new MyListener());
        btn7.setOnClickListener(new MyListener());


    }

    /**
     * 私有类，实现点击相应事件的类
     **/
    private class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            if (v == btn1) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("这是标题")
                        .setMessage("简单的消息提示框")
                        .setPositiveButton("OK", null).show();
            }
            if (v == btn2) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("确定框")
                        .setMessage("确定吗？")
                        .setPositiveButton("确定", null)
                        .setNegativeButton("取消", null).show();
            }
            if (v == btn3) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("请输入")
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .setView(new EditText(MainActivity.this))
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null).show();
            }
            if (v == btn4) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("请选择")
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .setSingleChoiceItems(new String[]{"选项一", "选项二", "选项三"}, 0,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        dialog.dismiss();
                                    }
                                })
                        .setNegativeButton("Cancel", null)
                        .show();
            }
            if (v == btn5) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("请多项选择")
                        .setIcon(android.R.drawable.ic_dialog_info)
                        .setMultiChoiceItems(new String[]{"选项一", "选项二", "选项三", "选项四"}, null, null)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("cancel", null)
                        .show();
            }
            if (v == btn6) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("列表框")
                        .setItems(new String[]{"列表一", "列表二", "列表三"}, null)
                        .setNegativeButton("OK", null)
                        .show();
            }
            if (v == btn7) {
                ImageView img = new ImageView(MainActivity.this);
                img.setImageResource(R.mipmap.ic_launcher);
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("图片框")
                        .setView(img)
                        .setPositiveButton("OK", null)
                        .show();
            }
        }
    }
}
