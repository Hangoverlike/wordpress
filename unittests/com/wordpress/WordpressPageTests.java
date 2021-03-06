package com.company;


import com.wordpress.*;
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

    @Test
    public void testClassid(){
        WordpressPage page = new WordpressPage("title", "content");
        WordpressPost post = new WordpressPost("title", "content");

        Assert.assertEquals(page.id,1);
        Assert.assertEquals(post.id,1);

        WordpressPage page2 = new WordpressPage("title", "content");
        WordpressPost post2 = new WordpressPost("title", "content");

        Assert.assertNotEquals(page.id, page2.id);
        Assert.assertNotEquals(post.id, post2.id);
    }

    public void testPublish(IPublish element){
        element.publish();
        Assert.assertTrue(element.isPublished());
    }

    @Test
    public void testPublished(){
        IPublish published = new WordpressPage("", "");
        testPublish(published);

    }

    @Test
    public void testPublished2(){
        IPublish published = new WordpressComment();
        testPublish(published);
    }

    @Test
    public void testPageVisibilityPublic(){
        WordpressVisibility visible = new PublicVisibility();

        Assert.assertTrue(visible.isInFeed());
        Assert.assertTrue(visible.canBeSearched());
    }

    @Test
    public void testPageVisibilityPrivate(){
        WordpressVisibility visible = new PrivateVisibility();

        Assert.assertFalse(visible.isInFeed());
        Assert.assertFalse(visible.canBeSearched());
    }

    @Test
    public void testPageVisibilityPassword(){
        PasswordVisibility visible = new PasswordVisibility();

        visible.password = "test";

        Assert.assertTrue(visible.canView("test"));
        Assert.assertFalse(visible.canView("test2"));
    }

}
