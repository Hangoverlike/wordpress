package com.wordpress;

import java.util.ArrayList;
import java.util.Locale;

public class WordpressPost extends WordpressPage {

    enum Format {Standard, Aside, Image, Video, Quote, Link}
    ArrayList<String> tags;
    ArrayList<String> categories;
    Format format = Format.Link;



    public WordpressPost(String title, String content) {
        super(title, content);
    }
}

