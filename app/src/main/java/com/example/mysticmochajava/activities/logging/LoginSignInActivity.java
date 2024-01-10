package com.example.mysticmochajava.activities.logging;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;
import com.example.mysticmochajava.database.database;
import com.example.mysticmochajava.models.User;

public class LoginSignInActivity extends AppCompatActivity {
    Button BackLogBtn, EnterLogBtn;
    EditText etEmail, etPass;

    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_sign_in);
        etEmail = findViewById(R.id.etEmail);
        etPass = findViewById(R.id.etPass);
    }
    public void OnClickBack(View v){
        finish();
    }
    public void OnClickEnter(View v){
        User user = db.getUser(this, etEmail.getText().toString());
        if (user.getPassword().equals(etPass.getText().toString())){
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra("user",user.getEmail());
        startActivity(intent);
        finish();
        } else Toast.makeText(this,"The e-mail or password are incorrect",Toast.LENGTH_LONG).show();
    }
}