package com.example.mysticmochajava.activities.user;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;
import com.example.mysticmochajava.activities.cafe.ShopActivity;
import com.example.mysticmochajava.database.database;
import com.example.mysticmochajava.models.User;

public class ProfileActivity extends AppCompatActivity {
    Button BBtn;
    TextView tvNombre;
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_profile);
        user = db.getUser(this, getIntent().getExtras().getString("user"));
        tvNombre = findViewById(R.id.textView5);
        tvNombre.setText(user.getName());
    }
    public void OnClickBack(View v){
        finish();
    }
    public void OnClickShop(View v){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
}