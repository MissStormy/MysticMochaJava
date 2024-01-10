package com.example.mysticmochajava.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.cafe.CafeMenuActivity;
import com.example.mysticmochajava.activities.cafe.ShopActivity;
import com.example.mysticmochajava.activities.library.LibraryActivity;
import com.example.mysticmochajava.activities.user.ProfileActivity;
import com.example.mysticmochajava.database.database;
import com.example.mysticmochajava.models.User;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity{
    Button CafeBtn, ShopBtn, BookBtn, ProfileBtn;
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
    User user;
    MediaPlayer mp;
    int posicion = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_home);
        user = db.getUser(this, getIntent().getExtras().getString("user"));
    }
    public void OnClickCafe(View v){
        Intent intent = new Intent(this, CafeMenuActivity.class);
        startActivity(intent);
    }
    public void OnClickBook(View v){
        Intent intent = new Intent(this, LibraryActivity.class);
        startActivity(intent);
    }
    public void OnClickShop(View v){
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }
    public void OnClickProfile(View v){
        Intent intent = new Intent(this, ProfileActivity.class);
        intent.putExtra("user",user.getEmail());
        startActivity(intent);
    }
    public void destriur(){
        if(mp !=null){
            mp.release();
        }
    }
    public void iniciar (View view){
        destriur();
        mp = MediaPlayer.create(this, R.raw.mummy);
        mp.start();
        mp.setLooping(true);
    }
    public void detener(View view){
        if (mp != null) {
            mp.stop();
            posicion = 0;
        }
    }
}