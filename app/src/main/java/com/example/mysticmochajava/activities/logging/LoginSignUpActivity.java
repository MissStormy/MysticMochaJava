package com.example.mysticmochajava.activities.logging;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;

public class LoginSignUpActivity extends AppCompatActivity {
    Button BackBtn, EnterBtn;
    EditText NameTxt, EmailTxt, PassTxt, PassVerifTxt;
    CheckBox TCChb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_sign_up);
    }

    public void OnClickBack(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void OnClickEnter(View v){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}