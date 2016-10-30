package com.wordpress;

public class PasswordVisibility extends WordpressVisibility {

    public String password;


    @Override
    public boolean isVisibleBy(AcessLevel level) {
        return true;
    }

    @Override
    public boolean canView(String password) {
        if(password == this.password)
        return true;

        else return false;
    }
}
