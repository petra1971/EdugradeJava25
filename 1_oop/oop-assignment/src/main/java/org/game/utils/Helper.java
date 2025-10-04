package org.game.utils;

public class Helper {

    public static int randomInt(int multiplicator) {
        //Math.random generates a somewhat random double between 0.0 and 1.0
        return (int) Math.round(Math.random() * multiplicator);
    }

    public static double random() {
        return Math.round(Math.random());
    }

    public static void sleepForMilliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
