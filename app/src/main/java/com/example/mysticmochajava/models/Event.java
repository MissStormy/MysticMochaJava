package com.example.mysticmochajava.models;

public class Event {
    int id;
    String name;
    String description;
    String datetime;

    public Event() {
    }

    public Event(int id, String name, String description, String datetime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.datetime = datetime;
    }
    public Event(String name, String description, String datetime) {
        this.name = name;
        this.description = description;
        this.datetime = datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
    @Override
    public String toString(){
        return this.id +" "+ this.name +" "+ this.datetime;
    }
}
