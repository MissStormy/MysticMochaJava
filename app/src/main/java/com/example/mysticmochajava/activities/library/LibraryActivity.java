package com.example.mysticmochajava.activities.library;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.cafe.CafeMenuActivity;
import com.example.mysticmochajava.database.database;
import com.example.mysticmochajava.models.Book;

import java.util.List;

public class LibraryActivity extends AppCompatActivity {
    Button btBack, btNext, btPrev;
    TextView tvPage;
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
    int page = 1;
    int perPage = 4;
    int lastPage;
    List<Book> books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_library);
        btBack = findViewById(R.id.button8);
        btNext = findViewById(R.id.button11);
        btPrev = findViewById(R.id.button12);
        tvPage = findViewById(R.id.textView24);
        btPrev.setVisibility(View.INVISIBLE);
        books = db.getBookList(this);
        int temp = books.size() / perPage;
        tvPage.setText(temp);
    }
    public void OnClickBack(View v){
        finish();
    }
    public void OnClickNext(View v) {
        page += 1;
        if (page>1){
            btPrev.setVisibility(View.VISIBLE);
        }
    }
    public void OnClickPrev(View v) {
        page -= 1;
        if (page<2){
            btPrev.setVisibility(View.INVISIBLE);
        }
    }
    public void updatePage(){

    }
}