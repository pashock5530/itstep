package com.example.pashock.lesson11;

/**
 * Created by pashock on 23.02.16.
 */

public class Conditioner {

    private String mark; //марка

    public String getMark() {
        return mark;
    }

    public void setMark(String Mark) {
        mark = Mark;
    }

    private String model; //модель

    public String getModel() {
        return model;
    }

    public void setModel(String Model) {
        model = Model;
    }

    private double width; //ширина

    public double getWidth() {
        return width;
    }

    public void setWidth(double Width) {
        width = Width;
    }

    private double height; //высота

    public double getHeight() {
        return height;
    }

    public void setHeight(double Height) {
        height = Height;
    }

    private double depth; //глубина

    public double getDepth() {
        return depth;
    }

    public void setDepth(double Depth) {
        depth = Depth;
    }

    private String energyEfficiency; //энергоэффективность

    public String getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(String Energy) {
        energyEfficiency = Energy;
    }

    private String seer; //сезонные коэффициенты

    public String getSeer() {
        return seer;
    }

    public void setSeer(String Seer) {
        seer = Seer;
    }

    private boolean invertor; //инверторный кондиционер?

    public boolean getInvertor() {
        return invertor;
    }

    public void setInvertor(boolean Invertor) {
        invertor = Invertor;
    }

    private boolean possibilityOfHeating; //возможность обогрева

    public boolean getPossibilityOfHeating() {
        return possibilityOfHeating;
    }

    public void setPossibilityOfHeating(boolean Poss) {
        possibilityOfHeating = Poss;
    }

    private int noiseLevel; //уровень шума

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int Level) {
        noiseLevel = Level;
    }

}
