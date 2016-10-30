package com.wordpress;

public class PrivateVisibility extends WordpressVisibility {

    @Override
    public boolean isVisibleBy(AcessLevel level) {
        return false;
    }

    @Override
    public boolean canView(String password) {
        return true;
    }
}
