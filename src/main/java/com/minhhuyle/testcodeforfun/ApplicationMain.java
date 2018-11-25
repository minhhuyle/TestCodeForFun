package com.minhhuyle.testcodeforfun;

import com.minhhuyle.testcodeforfun.model.Address;
import com.minhhuyle.testcodeforfun.model.User;
import com.minhhuyle.testcodeforfun.service.Benchmark;

public class ApplicationMain {
    public static void main(String[] args) {


        Benchmark.metering(ApplicationMain::byLamda, 1000000);
//        Benchmark.metering(ApplicationMain::byNormal, 1000000);
//        Benchmark.metering(ApplicationMain::byVariable, 8000);


    }

    private static void byLamda() {
        User user = new User();
        for (int i = 0; i < 100; i++) {
            user.getAddressList().add(new Address());
        }


        StringBuilder stringBuilder = new StringBuilder();
        user.getAddressList().forEach(address -> stringBuilder.append( address.getStreet()));
    }

    private static void byNormal() {
        User user = new User();
        for (int i = 0; i < 100; i++) {
            user.getAddressList().add(new Address());
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Address address : user.getAddressList()) {
            stringBuilder.append( address.getStreet());
        }
    }

}
