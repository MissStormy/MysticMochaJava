package com.example.mysticmochajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mysticmochajava.models.User;

public class HomeActivity extends AppCompatActivity {
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
//    User user1 = new User("pepe@gmail.com","Pepe","contraseña","User");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}