package oop.task1.service;

public class Random {

    public int randomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public boolean randomBool() {
        int max = 1;
        int min = 0;
        return ((int) (Math.random() * ++max) + min) != 0;
    }
}
