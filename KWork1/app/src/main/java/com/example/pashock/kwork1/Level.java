package com.example.pashock.kwork1;

/**
 * Created by pashock on 12.04.16.
 */
public class Level implements ILevel {

    private int number;
    private int count;
    private int help;
    private String word;
    private String[] images = new String[4];

    public Level(int number, int count, int help, String word, String img1, String img2, String img3, String img4) {
        this.number = number;
        this.count = count;
        this.help = help;
        this.word = word;
        this.images[0] = img1;
        this.images[1] = img2;
        this.images[2] = img3;
        this.images[3] = img4;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public int getHelp() {
        return help;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public String[] getImages() {
        return images;
    }

    @Override
    public boolean checkWord(String tempWord) {
        if (word.equalsIgnoreCase(tempWord)) {
            return true;
        }
        return false;
    }

    @Override
    public String getImage(int id) {
        return "level_" + number + "/" + images[id-1];
    }

}
