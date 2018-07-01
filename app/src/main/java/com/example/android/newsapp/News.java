package com.example.android.newsapp;

public class News {

    private String mTitleOfArticle;
    private String mNameOfSection;
    private String mDatePublished;
    private String mUrl;
    private String mAutherName;

    public News(String titleOfArticle, String nameOfSection, String datePublished, String url, String autherName) {
        mTitleOfArticle = titleOfArticle;
        mNameOfSection = nameOfSection;
        mDatePublished = datePublished;
        mUrl = url;
        mAutherName = autherName;
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

    public String getAutherName() {
        return mAutherName;
    }
}
