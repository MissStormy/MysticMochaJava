package com.example.mysticmochajava.models;

public class Book {
    int id;
    String title;
    String author;
    String synopsis;
    String genre;

    public Book(int id, String title, String author, String synopsis, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.genre = genre;
    }
    public Book(String title, String author, String synopsis, String genre) {
        this.title = title;
        this.author = author;
        this.synopsis = synopsis;
        this.genre = genre;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString(){
        return this.id +" "+ this.title +" "+ this.author;
    }
}
