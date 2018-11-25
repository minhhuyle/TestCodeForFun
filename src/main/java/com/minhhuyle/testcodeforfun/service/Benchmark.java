package com.minhhuyle.testcodeforfun.service;

import java.util.function.Consumer;

public class Benchmark {

    public static void metering(final Runnable runnable, final int numberOfTimeToExecute) {
        long startTime = System.currentTimeMillis();

        for (int timeExecute = 0; timeExecute < numberOfTimeToExecute; timeExecute++) {
            runnable.run();
        }

        long endTime = System.currentTimeMillis();

        long durationExe = endTime - startTime;

        System.out.println("Time exe : " + durationExe);
    }
}
