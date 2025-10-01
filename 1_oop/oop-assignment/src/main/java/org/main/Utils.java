package org.main;

public class Utils {

    public int randomInt(int probability) {
        return (int) Math.round(Math.random() * probability);
    }

    public void sleepForMilliseconds(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
