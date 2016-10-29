package com.company;


import com.wordpress.WordpressPage;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WordpressPageTests {

    @Test
    public void myTest() {
        ArrayList<WordpressPage> pageList = new ArrayList<>();
        pageList.add(new WordpressPage("title", "content"));
        pageList.add(new WordpressPage("title1", "a content1"));

        ArrayList<WordpressPage> result = WordpressPage.doSort(pageList);

        Assert.assertEquals(result.get(0).content, "a content1");
        Assert.assertEquals(result.get(1).content, "content");

    }


}
