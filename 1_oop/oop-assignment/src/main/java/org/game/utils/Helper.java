package org.game.utils;

public class Helper {

    //Math.random generates a somewhat random double between 0.0 and 1.0
    public static int randomInt(double multiplicator) {
//        System.out.println(String.valueOf(Math.random() ));
//        System.out.println(String.valueOf(Math.round(Math.random() * multiplicator)));
        return (int)Math.round(multiplicator * Math.random());
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
