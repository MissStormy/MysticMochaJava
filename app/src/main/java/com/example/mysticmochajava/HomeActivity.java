package com.example.mysticmochajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mysticmochajava.models.Book;
import com.example.mysticmochajava.models.Event;
import com.example.mysticmochajava.models.MenuEntry;
import com.example.mysticmochajava.models.User;

public class HomeActivity extends AppCompatActivity {
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
//    User user1 = new User("pepe@gmail.com","Pepe","contraseña","User");
//    Event event1 = new Event("evento uno","Eventouno","martes");
//    Book book1 = new Book("book","author","synopsis","genre");
//    MenuEntry menuEntry = new MenuEntry("menuEntry","menu entry",0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db.onUpgrade(db.getWritableDatabase(),1,2);
    }
}