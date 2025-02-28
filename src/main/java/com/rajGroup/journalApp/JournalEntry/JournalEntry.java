package com.rajGroup.journalApp.JournalEntry;
//pojo class
public class JournalEntry {
    long id;
    String title;
    String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return (int) id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
