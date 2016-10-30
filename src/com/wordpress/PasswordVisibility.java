package com.wordpress;

public class PasswordVisibility extends PrivateVisibility {

    public String password;


    @Override
    public boolean canView(String password) {
        if(password == this.password)
        return true;

        else return false;
    }
}
