package com.mit.newsaggregator;

/**
 * Created by Mitaly on 7/3/2016.
 */
public class NewsObjects {
    int icon;
    String language,newspaper,url;

    public NewsObjects(int icon, String language, String newspaper, String url) {
        this.icon = icon;
        this.language = language;
        this.newspaper = newspaper;
        this.url = url;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getNewspaper() {
        return newspaper;
    }

    public void setNewspaper(String newspaper) {
        this.newspaper = newspaper;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
