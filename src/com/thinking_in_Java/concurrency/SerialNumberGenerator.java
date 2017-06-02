package com.thinking_in_Java.concurrency;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber() {
        return serialNumber++; // Операция не является потоково-безопасной
    }
}