package com.wordpress;

import java.io.IOException;

public class Main {



    public static void main(String[] args) throws IOException {
          WordpressPage  wordPresspage = new  WordpressPage("titlu","content nuibiu");
          WordpressPage  wordPresspage1 = new  WordpressPage("titlu1","content1");
          System.out.println(wordPresspage);
          System.out.println(wordPresspage1);

        wordPresspage.changeId(1);
        wordPresspage.isVisible = false;
        System.out.println(wordPresspage);

        wordPresspage.publish(10);


        wordPresspage.setPendingreview();
        System.out.println(wordPresspage);
        wordPresspage1.setPendingreview();
        System.out.println(wordPresspage1);
        System.out.println(wordPresspage.wpp);

        wordPresspage.setChild(wordPresspage1);
        wordPresspage1.setParent(wordPresspage);
        System.out.println(wordPresspage.child + "\n" + wordPresspage.parent);
        System.out.println(wordPresspage1.child + "\n" + wordPresspage1.parent);


        wordPresspage.publish();

        try{
            wordPresspage.publish();
        }
        catch (Exception error){

        }

        System.out.println(wordPresspage.getWordCount());
        }
    }



