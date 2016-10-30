package com.wordpress;

public class PublicVisibility extends WordpressVisibility {

    @Override
    public boolean isVisibleBy(AcessLevel level) {
        return true;
    }

    @Override
    public boolean canView(String password) {
        return true;
    }
}
