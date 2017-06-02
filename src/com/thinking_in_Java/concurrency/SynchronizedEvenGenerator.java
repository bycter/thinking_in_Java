package com.thinking_in_Java.concurrency;

public class SynchronizedEvenGenerator extends IntGenerator {

    private int currentEvenValue = 0;

    public synchronized int next() {

        ++currentEvenValue;
        Thread.yield(); // Ускоряем сбой
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {

        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}