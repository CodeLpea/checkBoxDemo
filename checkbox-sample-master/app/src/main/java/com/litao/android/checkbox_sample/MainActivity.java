package com.litao.android.checkbox_sample;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CheckBoxSample checkBoxSample1;
    private CheckBoxSample checkBoxSample2;
    private CheckBoxSample checkBoxSample3;
    private CheckBoxSample checkBoxSample4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxSample1 = (CheckBoxSample) findViewById(R.id.check1);
        checkBoxSample2 = (CheckBoxSample) findViewById(R.id.check2);
        checkBoxSample3 = (CheckBoxSample) findViewById(R.id.check3);
        checkBoxSample4 = (CheckBoxSample) findViewById(R.id.check4);
        checkBoxSample1.setBackground(getResources().getDrawable(R.mipmap.xx1));
        checkBoxSample1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSample1.toggle();

            }
        });
        checkBoxSample2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSample2.toggle();
            }
        });
        checkBoxSample3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSample3.toggle();
            }
        });
        checkBoxSample4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkBoxSample4.toggle();
            }
        });
    }

}
