package com.example.pashock.kwork1;

/**
 * Created by pashock on 12.04.16.
 */
public interface ILevel {

    int getNumber();

    int getCount();

    int getHelp();

    String getWord();

    String[] getImages();

    boolean checkWord(String tempWord);

    String getImage(int id);

}
