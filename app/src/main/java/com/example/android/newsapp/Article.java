package com.example.android.newsapp;

import java.io.Serializable;

public class Article implements Serializable{

    /** Title of the article */
    private String mTitle;

    /** Section of the article */
    private String mSection;

    /** Website URL of the article */
    private String mUrl;

    /**
     * Constructs a new {@link Article} object.
     *
     * @param title title of the article
     * @param section section of the article
     * @param url the website URL to open the article
     */
    public Article(String title, String section, String url) {
        mTitle = title;
        mSection = section;
        mUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the section of the article.
     */
    public String getSection() {
        return "Section: " + mSection;
    }

    /**
     * Returns the website URL of the article.
     */
    public String getUrl() {
        return mUrl;
    }
}
