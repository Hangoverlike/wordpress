package com.wordpress;

public abstract class WordpressVisibility {
    public enum AcessLevel{
        Anyone,
        Editor,
        Administrator
    }
    public abstract boolean isVisibleBy(AcessLevel level);

    public abstract boolean canView(String password);

    public boolean isInFeed(){
        return isVisibleBy(AcessLevel.Anyone);
    }
    public boolean canBeSearched(){
        return isVisibleBy(AcessLevel.Anyone);
    }
}
