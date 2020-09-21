package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hallo Toasts!", Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        mShowCount = (TextView) findViewById(R.id.text_count);
        mCount++;
        mShowCount.setText(Integer.toString(mCount));
    }
}