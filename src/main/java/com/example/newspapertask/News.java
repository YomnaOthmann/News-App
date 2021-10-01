package com.example.newspapertask;

public class News {
    private int news_img;
    private int news_intro;
    private int news_author;
    private int news_date;
    public News(int img , int intro ,int author , int date ){
        this.news_img = img;
        this.news_intro = intro;
        this.news_author = author;
        this.news_date = date;
    }
    public void setNewsImage(int img){
        this.news_img = img;
    }
    public void setNewsIntro(int intro){
        this.news_intro = intro;
    }
    public void setNewsAuthor(int author){
        this.news_author = author;
    }
    public void setNewsDate(int date){
        this.news_date = date;
    }
    public int getNewsImage(){
        return news_img;
    }
    public int getNewsIntro(){
        return news_intro;
    }
    public int getNewsAuthor(){
        return news_author;
    }
    public int getNewsDate(){
        return news_date;
    }

}
