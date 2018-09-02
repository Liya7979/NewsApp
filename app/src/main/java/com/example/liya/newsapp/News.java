package com.example.liya.newsapp;

public class News {

    String title;
    String author;
    String date;
    String topic;
    String url;


    public News(String title, String author, String date, String topic, String url) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.topic = topic;
        this.url = url;

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



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

}
