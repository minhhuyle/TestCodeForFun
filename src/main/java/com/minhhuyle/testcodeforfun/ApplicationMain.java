package com.minhhuyle.testcodeforfun;

import com.minhhuyle.testcodeforfun.model.User;

public class ApplicationMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();


        User user = new User();
        System.out.println(user);


        long endTime = System.currentTimeMillis();

        long durationExe = endTime - startTime;

        System.out.println("Time exe : " + durationExe);
    }
}
