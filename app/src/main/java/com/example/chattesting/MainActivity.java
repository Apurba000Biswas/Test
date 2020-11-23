package com.example.chattesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chattesting.data.Repository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //View loadingView = findViewById(R.id.loading_view);
        //loadingView.setVisibility(View.VISIBLE);

        Repository.getInstance().makeHomeDataRequest();
    }
}