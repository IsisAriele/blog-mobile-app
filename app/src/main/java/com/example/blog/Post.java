package com.example.blog;

public class Post {
    private String title;
    private String author;
    private String description;
    private int imageResId;

    // Construtor
    public Post(String title, String author, String description, int imageResId) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageResId = imageResId;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResId() {
        return imageResId;
    }
}
