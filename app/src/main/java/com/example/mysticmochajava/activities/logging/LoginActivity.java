package com.example.mysticmochajava.activities.logging;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mysticmochajava.R;

public class LoginActivity extends AppCompatActivity {
    Button SignInBtn, SignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnClickSignUp(View v){
        Intent intent = new Intent(this, LoginSignUpActivity.class);
        startActivity(intent);
    }
    public void OnClickSignIn(View v){
        Intent intent = new Intent(this, LoginSignInActivity.class);
        startActivity(intent);
    }
}