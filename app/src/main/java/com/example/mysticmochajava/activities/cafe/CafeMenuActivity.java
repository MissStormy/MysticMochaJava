package com.example.mysticmochajava.activities.cafe;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;

public class CafeMenuActivity extends AppCompatActivity {
    Button BtnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_cafe_menu);
    }
    public void OnClickBack(View v){
        finish();
    }
    public void OnClickShop(View v){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
}