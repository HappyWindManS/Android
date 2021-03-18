package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button login_but;
    private EditText edit_text_login_name;
    private TextView tx4;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_but = (Button)findViewById(R.id.login_but);
        edit_text_login_name = (EditText)findViewById(R.id.edit_text_login_name);
        tx4 = (TextView)findViewById(R.id.textView4);
        login_but.setOnClickListener(this);
    }

    public  void  onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.login_but:
                String temp = edit_text_login_name.getText().toString();
                if(temp=="用户名或登录邮箱"||temp.equals(""))
                {
                    dialog = new AlertDialog.Builder(this).setTitle("错误")
                            .setMessage("请输入账号")
                            .setPositiveButton("确定",null)
                            .setNegativeButton("取消",null)
                            .create();
                    dialog.show();
                }
                else
                {
                    tx4.setText(temp);
                }
        }
    }
}