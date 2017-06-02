package com.thinking_in_Java.concurrency;

public class EvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    public int next() {

        ++currentEvenValue;  // Опасная точка!
        Thread.yield();
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {

        EvenChecker.test(new EvenGenerator());
    }
}
