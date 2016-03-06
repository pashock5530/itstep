package com.example.pashock.lesson14_hw;

/**
 * Created by pashock on 06.03.16.
 */
public class ClassRoom {

    private Pupil pupils[] = new Pupil[4];

    public ClassRoom() {

    }

    public ClassRoom(Pupil pupil1) {
        pupils[0] = pupil1;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        pupils[0] = pupil1;
        pupils[1] = pupil2;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        pupils[0] = pupil1;
        pupils[1] = pupil2;
        pupils[2] = pupil3;
        pupils[3] = pupil4;
    }

    public Pupil[] getPupils() {
        return pupils;
    }

    public void infoPupils() {
        for (Pupil p:getPupils()) {
            if (p != null) {
                p.getInfo();
            }
        }
    }

}
