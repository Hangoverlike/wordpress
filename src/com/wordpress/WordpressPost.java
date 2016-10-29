package com.wordpress;

import java.util.ArrayList;
import java.util.Locale;

public class WordpressPost extends WordpressPage {

    enum Format {Standard, Aside, Image, Video, Quote, Link}
    static int postcount = 0;
    ArrayList<String> tags;
    ArrayList<String> categories;
    Format format = Format.Link;

    public WordpressPost(String title, String content) {
        super();
        postcount++;
        System.out.println(this.title + "," + this.content);
        this.id = postcount;
        this.title = title;
        this.content = content;
    }
}

