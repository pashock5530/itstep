package com.example.pashock.lesson13;

/**
 * Created by pashock on 10.03.16.
 */
public class Converter {

    private double baseCurrency;
    private double[] currency;
    private double[] rate;

    public Converter() {
        baseCurrency = 0;
        currency = new double[0];
        rate = new double[0];
    }

    public Converter(double baseCurrency, double[] currency, double[] rate) {
        this.baseCurrency = baseCurrency;
        this.currency = currency;
        this.rate = rate;
    }

    public void setBaseCurrency(double baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public void setCurrency(double[] currency) {
        this.currency = assignmentArray(this.currency, currency);
    }

    public void setRate(double[] rate) {
        this.rate = assignmentArray(this.rate, rate);
    }

    public double[] getCurrency() {
        return currency;
    }

    public double[] getRate() {
        return rate;
    }

    public void addCurrency(double currency) {
        this.currency = addArray(this.currency, currency);
    }

    public void addRate(double rate) {
        this.rate = addArray(this.rate, rate);
    }

    private double[] assignmentArray(double[] variable, double[] array) {
        variable = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            variable[i] = array[i];
        }
        return variable;
    }

    private double[] addArray(double[] variable, double var) {
        double[] temp = new double[variable.length+1];
        for (int i = 0; i < variable.length; i++) {
            temp[i] = variable[i];
        }
        temp[variable.length] = var;
        return temp;
    }

}
