package com.example.android.newsapp;

public class News {

    private String mTitleOfArticle;
    private String mNameOfSection;
    private String mDatePublished;
    private String mUrl;

    public News(String titleOfArticle, String nameOfSection, String datePublished, String url) {
        mTitleOfArticle = titleOfArticle;
        mNameOfSection = nameOfSection;
        mDatePublished = datePublished;
        mUrl = url;
    }

    public String getTitleOfArticle() {
        return mTitleOfArticle;
    }

    public String getNameOfSection() {
        return mNameOfSection;
    }

    public String getDatePublished() {
        return mDatePublished;
    }

    public String getUrl() {
        return mUrl;
    }
}
