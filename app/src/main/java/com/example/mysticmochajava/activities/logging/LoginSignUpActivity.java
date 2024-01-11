package com.example.mysticmochajava.activities.logging;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mysticmochajava.R;
import com.example.mysticmochajava.activities.HomeActivity;
import com.example.mysticmochajava.database.database;
import com.example.mysticmochajava.models.User;

public class LoginSignUpActivity extends AppCompatActivity {
    Button BackBtn, EnterBtn;
    EditText NameTxt, EmailTxt, PassTxt, PassVerifTxt;
    CheckBox TCChb;
    database.AdminSQLiteOpenHelper db = new database.AdminSQLiteOpenHelper(this,"cafe",null,1);
    MediaPlayer mp;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_sign_up);
        NameTxt = findViewById(R.id.NameTxt);
        EmailTxt = findViewById(R.id.EmailTxt);
        PassTxt = findViewById(R.id.PassTxt);
        PassVerifTxt = findViewById(R.id.PassVerifTxt);
        TCChb = findViewById(R.id.TCChb);
    }

    public void OnClickBack(View v){
        finish();
    }
    public void OnClickEnter(View v){
        if (TCChb.isChecked()) {
            if (PassTxt.getText().toString().equals(PassVerifTxt.getText().toString())) {
                User user = new User(EmailTxt.getText().toString(), NameTxt.getText().toString(), PassTxt.getText().toString(), "user");
                if (db.addUser(this, user)) {
                    Intent intent = new Intent(this, HomeActivity.class);
                    intent.putExtra("user",user.getEmail());
                    door();
                    startActivity(intent);
                    finish();
                } else Toast.makeText(this, "There is already a user with that e-mail", Toast.LENGTH_LONG).show();
            } else Toast.makeText(this, "The passwords don't match", Toast.LENGTH_LONG).show();
        }else Toast.makeText(this, "You must accept the terms of service to crate an account", Toast.LENGTH_LONG).show();
    }
    public void destriur(){
        if(mp !=null){
            mp.release();
        }
    }
    public void mummy (){
        destriur();
        mp = MediaPlayer.create(this, R.raw.mummy);
        mp.start();
        mp.setLooping(true);
    }
    public void door(){
        destriur();
        mp = MediaPlayer.create(this, R.raw.chirrido);
        mp.start();
        mp.setLooping(false);
    }
    public void detener(){
        if (mp != null) {
            mp.stop();
            posicion = 0;
        }
    }
}