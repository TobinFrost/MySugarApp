package com.super_dev.mysugarapp.entities;

import com.orm.SugarRecord;

/**
 * Created by Tobin Frost on 08/03/2018.
 */

public class Note extends SugarRecord {
    public String title, note;
    public long time;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public Note(){

    }

    public Note(String title, String note, long time ){
        this.note = note;
        this.title = title;
        this.time = time;
    }
}
