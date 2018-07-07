package com.afei.bottomtabbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.afei.bottomtabbar.style1.Style1Activity;
import com.afei.bottomtabbar.style2.Style2Activity;
import com.afei.bottomtabbar.style3.Style3Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStyle1;
    private Button mBtnStyle2;
    private Button mBtnStyle3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtnStyle1 = findViewById(R.id.style1_btn);
        mBtnStyle2 = findViewById(R.id.style2_btn);
        mBtnStyle3 = findViewById(R.id.style3_btn);
        mBtnStyle1.setOnClickListener(this);
        mBtnStyle2.setOnClickListener(this);
        mBtnStyle3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.style1_btn:
                startActivity(new Intent(MainActivity.this, Style1Activity.class));
                break;
            case R.id.style2_btn:
                startActivity(new Intent(MainActivity.this, Style2Activity.class));
                break;
            case R.id.style3_btn:
                startActivity(new Intent(MainActivity.this, Style3Activity.class));
                break;
            default:
                break;
        }
    }
}
