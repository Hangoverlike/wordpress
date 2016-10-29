package com.wordpress;

public class WordpressComment implements IPublish{

    private boolean status;

    @Override
    public void publish() {
        status = true;
    }

    @Override
    public void unpublish() {
        status = false;
    }

    @Override
    public boolean isPublished() {
        return status;
    }


}
