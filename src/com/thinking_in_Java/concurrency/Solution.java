package com.thinking_in_Java.concurrency;

import java.util.concurrent.ThreadLocalRandom;

public class Solution {

    static class MyIntGenerator extends IntGenerator {

        @Override
        public int next() {

            return ThreadLocalRandom.current().nextInt(0, 1000);
        }
    }

    public static void main(String[] args) {

        MyIntGenerator myIntGenerator = new MyIntGenerator();
        EvenChecker evenChecker = new EvenChecker(myIntGenerator, 50);

        Thread t = new Thread(evenChecker, "111");
        evenChecker.test(myIntGenerator);

    }
}
