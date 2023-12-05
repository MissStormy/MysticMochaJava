package com.example.mysticmochajava;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.mysticmochajava.models.User;

public class database {
    public static class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
        public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table users(email text primary key, name text, password text, type text)");
            db.execSQL("create table menu(id integer primary key, name text, description text, price int)");
            db.execSQL("create table books(id integer primary key, title text, author text, synopsis text, genre text)");
            db.execSQL("create table events(id integer primary key, name text, description text, datetime text)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            db.execSQL("drop table if exists users");
            db.execSQL("drop table if exists menu");
            db.execSQL("drop table if exists books");
            db.execSQL("drop table if exists events");

            db.execSQL("create table users(email text primary key, name text, password text, type text)");
            db.execSQL("create table menu(id integer primary key, name text, description text, price int)");
            db.execSQL("create table books(id integer primary key, title text, author text, synopsis text, genre text)");
            db.execSQL("create table events(id integer primary key, name text, description text, datetime text)");
        }
        public void addUser(Context context, User user){
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues newUser = new ContentValues();
            newUser.put("name", user.getName());
            newUser.put("password", user.getPassword());
            newUser.put("email", user.getEmail());
            newUser.put("type", user.getType());
            database.insert("users",null,newUser);
            database.close();
            Toast.makeText(context,"Nuevo usuario guardado correctamente",Toast.LENGTH_LONG).show();
        }
        public User getUser(Context context,String email){
            SQLiteDatabase database = this.getReadableDatabase();
            User user;
            Cursor cursor = database.rawQuery("select email,name,password,type from users where email="+email, null);
            if (cursor.moveToFirst()){
                user = new User(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));
            }else {
                user = new User("Error","Error","Error");
            }
            cursor.close();
            database.close();
            Toast.makeText(context,user.toString(),Toast.LENGTH_LONG).show();
            return user;
        }
    }
}
