package org.game.utils;

public  class Helper {

    public static int randomInt() {
        return (int) Math.round(Math.random());
    }

    public static void sleepForMilliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
