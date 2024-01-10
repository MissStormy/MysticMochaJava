package com.example.mysticmochajava.activities.library;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.cafe.CafeMenuActivity;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_library);
    }
    public void OnClickBack(View v){
        finish();
    }
}