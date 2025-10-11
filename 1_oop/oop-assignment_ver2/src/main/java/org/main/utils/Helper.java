package org.main.utils;

public class Helper {

    //Math.random generates a somewhat random double between 0.0 and 1.0
    public static int randomInt(double multiplicator) {
        return (int)(multiplicator * Math.random());
    }

    public static double random() {
        return Math.random();
    }

    public static void sleepForMilliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
