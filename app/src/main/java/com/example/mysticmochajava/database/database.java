package com.example.mysticmochajava.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.mysticmochajava.models.Book;
import com.example.mysticmochajava.models.Event;
import com.example.mysticmochajava.models.MenuEntry;
import com.example.mysticmochajava.models.User;

import java.util.ArrayList;
import java.util.List;

public class database {
    public static class AdminSQLiteOpenHelper extends SQLiteOpenHelper {
        int version;
        public AdminSQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table users(email text primary key, name text, password text, type text)");
            db.execSQL("insert into users(email,name,password,type) values('admin@cofee.com','admin','admin','admin')");

            db.execSQL("create table menu(id integer primary key, name text, description text, price int)");

            db.execSQL("create table books(id integer primary key, title text, author text, synopsis text, genre text)");
            db.execSQL("insert into books(title,author,synopsis,genre) values('La emperatriz de los etereos','Laura Gallego','Un mundo congelado y una chica que tiene que salvarlo','Fantasia')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('El libro de los cuentos legendarios','Miss Stormy','Un mundo de fantasia muy loco','Fantasia++')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('La trastienda batibaleno','Pierdomenico Baccallario','Una tienda de curiosidades muy rara','Fantasia')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('The Lord Of the rings','Tolkien','Un hobbit la lia parda','Aventura, Fantasia')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('Lo que Habita Dentro','Malenka Ramos','Es como IT pero en Españita','Terror')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('Los mitos de Cthulu','Lovecraft','Recopilacion de historias muy raras','Varios')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('Mundodisco','Terry Pratchet','En verdad es una saga de fantasia muy graciosa','Humor, Fantasia')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('Good Omens','Terry Pratchet, Neil Gaiman','Un angel y un demonio muy amigos','Apocaliptico')");
            db.execSQL("insert into books(title,author,synopsis,genre) values('El libro del cementerio','Neil Gaiman','Un chaval que crece en un cementerio','Juvenil')");

            db.execSQL("create table events(id integer primary key, name text, description text, datetime text)");
            version = 2;
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int i, int i1) {
            if (i==0 && i1==2){
                db.execSQL("drop table if exists users");
                db.execSQL("drop table if exists menu");
                db.execSQL("drop table if exists books");
                db.execSQL("drop table if exists events");

                db.execSQL("create table users(email text primary key, name text, password text, type text)");
                db.execSQL("insert into users(email,name,password,type) values('admin@cofee.com','admin','admin','admin')");

                db.execSQL("create table menu(id integer primary key, name text, description text, price int)");
                db.execSQL("insert into books(title,author,synopsis,genre) values('La emperatriz de los etereos','Laura Gallego','Un mundo congelado y una chica que tiene que salvarlo','Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('El libro de los cuentos legendarios','Miss Stormy','Un mundo de fantasia muy loco','Fantasia++')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('La trastienda batibaleno','Pierdomenico Baccallario','Una tienda de curiosidades muy rara','Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('The Lord Of the rings','Tolkien','Un hobbit la lia parda','Aventura, Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Lo que Habita Dentro','Malenka Ramos','Es como IT pero en Españita','Terror')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Los mitos de Cthulu','Lovecraft','Recopilacion de historias muy raras','Varios')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Mundodisco','Terry Pratchet','En verdad es una saga de fantasia muy graciosa','Humor, Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Good Omens','Terry Pratchet, Neil Gaiman','Un angel y un demonio muy amigos','Apocaliptico')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('El libro del cementerio','Neil Gaiman','Un chaval que crece en un cementerio','Juvenil')");

                db.execSQL("create table books(id integer primary key, title text, author text, synopsis text, genre text)");

                db.execSQL("create table events(id integer primary key, name text, description text, datetime text)");
            }
            if (i==1 && i1 == 2){
                db.execSQL("insert into books(title,author,synopsis,genre) values('La emperatriz de los etereos','Laura Gallego','Un mundo congelado y una chica que tiene que salvarlo','Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('El libro de los cuentos legendarios','Miss Stormy','Un mundo de fantasia muy loco','Fantasia++')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('La trastienda batibaleno','Pierdomenico Baccallario','Una tienda de curiosidades muy rara','Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('The Lord Of the rings','Tolkien','Un hobbit la lia parda','Aventura, Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Lo que Habita Dentro','Malenka Ramos','Es como IT pero en Españita','Terror')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Los mitos de Cthulu','Lovecraft','Recopilacion de historias muy raras','Varios')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Mundodisco','Terry Pratchet','En verdad es una saga de fantasia muy graciosa','Humor, Fantasia')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('Good Omens','Terry Pratchet, Neil Gaiman','Un angel y un demonio muy amigos','Apocaliptico')");
                db.execSQL("insert into books(title,author,synopsis,genre) values('El libro del cementerio','Neil Gaiman','Un chaval que crece en un cementerio','Juvenil')");
            }
        }
        public boolean addUser(Context context, User user){
            User tempuser = getUser(context,user.getEmail());
            if (tempuser.getName().equals("Error")) {
                SQLiteDatabase database = this.getWritableDatabase();
                ContentValues newUser = new ContentValues();
                newUser.put("name", user.getName());
                newUser.put("password", user.getPassword());
                newUser.put("email", user.getEmail());
                newUser.put("type", user.getType());
                database.insert("users", null, newUser);
                database.close();
                return true;
            }else {
                Toast.makeText(context,"Ya se ha utilizado ese correo",Toast.LENGTH_LONG).show();
                return false;
            }
        }
        public User getUser(Context context,String email){
            SQLiteDatabase database = this.getWritableDatabase();
            User user;
            Cursor cursor = database.rawQuery("select email,name,password,type from users where email='"+email+"'", null);
            if (cursor.moveToFirst()){
                user = new User(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));
            }else {
                user = new User("Error","Error","Error","Error");
            }
            cursor.close();
            database.close();
            return user;
        }
        public List<User> getUserList(Context context){
            SQLiteDatabase database = this.getWritableDatabase();
            List<User> userList = new ArrayList<>();
            Cursor cursor = database.rawQuery("select email,name,password,type from users", null);
            while (cursor.moveToNext()){
                userList.add(new User(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3)));
            }
            cursor.close();
            database.close();
            return userList;
        }

        public void addEvent(Context context, Event event){
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues newEvent = new ContentValues();
            newEvent.put("name", event.getName());
            newEvent.put("datetime", event.getDatetime());
            newEvent.put("description", event.getDescription());
            database.insert("events",null,newEvent);
            database.close();
        }
        public Event getEvent(Context context,String id){
            SQLiteDatabase database = this.getWritableDatabase();
            Event event;
            Cursor cursor = database.rawQuery("select id,name,description,datetime from events where id='"+id+"'", null);
            if (cursor.moveToFirst()){
                event = new Event(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),cursor.getString(3));
            }else {
                event = new Event(-1,"Error","Error","Error");
            }
            cursor.close();
            database.close();
            return event;
        }
        public List<Event> getEventList(Context context){
            SQLiteDatabase database = this.getWritableDatabase();
            List<Event> eventList = new ArrayList<>();
            Cursor cursor = database.rawQuery("select id,name,description,datetime from events", null);
            while (cursor.moveToNext()){
                eventList.add(new Event(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),cursor.getString(3)));
            }
            cursor.close();
            database.close();
            return eventList;
        }
        public void addBook(Context context, Book book){
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues newBook = new ContentValues();
            newBook.put("title", book.getTitle());
            newBook.put("author", book.getAuthor());
            newBook.put("synopsis", book.getSynopsis());
            newBook.put("genre", book.getGenre());
            database.insert("books",null,newBook);
            database.close();
        }
        public Book getBook(Context context,String id){
            SQLiteDatabase database = this.getWritableDatabase();
            Book book;
            Cursor cursor = database.rawQuery("select id,title,author,synopsis,genre from books where id='"+id+"'", null);
            if (cursor.moveToFirst()){
                book = new Book(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4));
            }else {
                book = new Book(-1,"Error","Error","Error","Error");
            }
            cursor.close();
            database.close();
            return book;
        }
        public List<Book> getBookList(Context context){
            SQLiteDatabase database = this.getWritableDatabase();
            List<Book> bookList = new ArrayList<>();
            Cursor cursor = database.rawQuery("select id,title,author,synopsis,genre from books", null);
            while (cursor.moveToNext()){
                bookList.add(new Book(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4)));
            }
            cursor.close();
            database.close();
            return bookList;
        }
        public void addMenuEntry(Context context, MenuEntry menuEntry){
            SQLiteDatabase database = this.getWritableDatabase();
            ContentValues newMenuEntry = new ContentValues();
            newMenuEntry.put("name", menuEntry.getName());
            newMenuEntry.put("description", menuEntry.getDescription());
            newMenuEntry.put("price", menuEntry.getPrice());
            database.insert("menu",null,newMenuEntry);
            database.close();
        }
        public MenuEntry getMenuEntry(Context context, String id){
            SQLiteDatabase database = this.getWritableDatabase();
            MenuEntry menuEntry;
            Cursor cursor = database.rawQuery("select id,name,description,price from menu where id='"+id+"'", null);
            if (cursor.moveToFirst()){
                menuEntry = new MenuEntry(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),Integer.parseInt(cursor.getString(3)));
            }else {
                menuEntry = new MenuEntry(-1,"Error","Error",-1);
            }
            cursor.close();
            database.close();
            return menuEntry;
        }
        public List<MenuEntry> getMenuEntryList(Context context){
            SQLiteDatabase database = this.getWritableDatabase();
            List<MenuEntry> menuEntryList = new ArrayList<>();
            Cursor cursor = database.rawQuery("select id,name,description,price from menu", null);
            while (cursor.moveToNext()){
                menuEntryList.add(new MenuEntry(Integer.parseInt(cursor.getString(0)) ,cursor.getString(1),cursor.getString(2),Integer.parseInt(cursor.getString(3))));
            }
            cursor.close();
            database.close();
            return menuEntryList;
        }
        public int getVersion() {
            return version;
        }
    }
}
