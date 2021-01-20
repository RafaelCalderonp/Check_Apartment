package com.example.checkapartment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import presenter.IViewPresenter;

public class LoginActivity extends AppCompatActivity implements IViewPresenter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}