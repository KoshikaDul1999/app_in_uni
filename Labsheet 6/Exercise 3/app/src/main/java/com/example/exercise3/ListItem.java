package com.example.exercise3;

public class ListItem {
    private String name;
    private int imageResourceId;

    public ListItem(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
