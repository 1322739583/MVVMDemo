package com.xzh.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LiveDataActivity extends AppCompatActivity {

    MutableLiveData<String> mutableLiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data);

        mutableLiveData=new MutableLiveData<>();

        mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                 Log.d("LiveDataActivity", s);
            }
        });

    }

    public void sendMsg(View view) {
        mutableLiveData.postValue("aaa");
    }
}
