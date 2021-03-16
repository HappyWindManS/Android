package com.example.kxxxl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button clickBtu;
    private TextView tx1;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = (TextView)findViewById(R.id.textView) ;
        clickBtu = (Button)findViewById(R.id.but_demo);
        clickBtu.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.but_demo:
                n++;
                tx1.setText("n:"+n);
                break;
        }
    }
}