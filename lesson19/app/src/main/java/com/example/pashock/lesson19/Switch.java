package com.example.pashock.lesson19;

/**
 * Created by pashock on 24.03.16.
 */
public final class Switch {

    private final double maxV = 230.0;

    private double voltage;
    private String material;
    private String type;

    Switch(double voltage, String material, String type) {
        this.voltage = voltage;
        this.material = material;
        this.type = type;
    }

    public double on() {
        return voltage > maxV ? 0 : voltage;
    }

    public double off() {
        return 0;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

}
