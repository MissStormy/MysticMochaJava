package com.example.mysticmochajava.activities.user;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;
import com.example.mysticmochajava.activities.cafe.ShopActivity;

public class ProfileActivity extends AppCompatActivity {
    Button BBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_profile);
    }
    public void OnClickBack(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    public void OnClickShop(View v){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
}