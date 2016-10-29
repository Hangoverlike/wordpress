package com.wordpress;

import java.util.ArrayList;
import java.util.Date;

enum Status {Draft, Published, PendingReview};


public class WordpressPage {

    static ArrayList<WordpressPage> wpp = new ArrayList<>();
    static int pagecount = 0;
    String title = "Titlu pagina";
    public String content = "Page content";
    Status status = Status.Draft;
    boolean isVisible = true;
    Date publishDate = new Date();
    int order = 3;
    int viewCount = 5;
    WordpressPage child;
    WordpressPage parent;
    private int id = 1;

    public WordpressPage(String title, String content) {
        pagecount++;
        System.out.println(this.title + "," + this.content);
        this.id = pagecount;
        this.title = title;
        this.content = content;

    }

    ;

    public String toString() {


        return
                String.valueOf(id) + "," +
                        title + "," +
                        content + "," +
                        String.valueOf(status) + "," +
                        String.valueOf(isVisible) + "," +
                        String.valueOf(publishDate) + "," +
                        String.valueOf(parent) + "," +
                        String.valueOf(order) + "," +
                        String.valueOf(viewCount);
    }

    public int changeId(int id) {

        this.id = id;
        return this.id;
    }

    public void publish() {
        System.out.println(publishDate);
        System.out.println(status);
    }

    public void setPendingreview() {
        this.status = Status.PendingReview;
        this.wpp.add(this);
    }

    public void publish(int hours) {
        long time = new Date().getTime() + hours * 60 * 60 * 1000;
        publishDate.setTime(time);
    }

    public void publish(Date now) throws Exception {

        if (this.status == Status.Published) throw new Exception("Status already set");

                this.status =Status.Published;
                this.publishDate =now;

        }


    void setChild(WordpressPage page) {
        child = page;


    }

    void setParent(WordpressPage page) {
        parent = page;

    }

    public int getWordCount() {

        String[] words = this.content.split(" ");
        int nrofwords = words.length;
        return nrofwords;
    }

    public Status getSatus(Status status) {
        return status;
    }

    public boolean getisPublished(boolean publish) {
        if (this.status == Status.Published) {
            return true;
        } else {
            return false;
        }
    }

    public void setStatus(Status status) {
        this.status = status;
        if (status == Status.Published){
            this.publishDate = new Date();
        }
    }

    static public ArrayList<WordpressPage> doSort (ArrayList<WordpressPage> list) {
        ArrayList<WordpressPage> newList = new ArrayList();
        while (list.size() > 0){
            WordpressPage min = list.get(0);
            for (int i = 1; i < list.size(); i++){
                if (min.content.compareTo(list.get(i).content) > 0){
                    min = list.get(i);
                }
            }
            list.remove(min);
            newList.add(min);
        }
        return newList;
    }
}

