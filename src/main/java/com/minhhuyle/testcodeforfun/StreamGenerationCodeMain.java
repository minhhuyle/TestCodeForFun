package com.minhhuyle.testcodeforfun;

import com.minhhuyle.testcodeforfun.model.Address;
import com.minhhuyle.testcodeforfun.model.User;
import com.minhhuyle.testcodeforfun.model.UserBuilder;

import java.util.function.ToLongFunction;
import java.util.stream.Stream;

public class StreamGenerationCodeMain {
    public static void main(String[] args) {
        User userWith10FakeAddress = UserBuilder.createUserWith10FakeAddress();

        Stream<Address> addressStream = userWith10FakeAddress.getAddressList().stream();

        ToLongFunction<Address> addressPostalCodeToLong = address -> Long.parseLong(address.getPostalCode());
        long count = addressStream.mapToLong(addressPostalCodeToLong).count();

        System.out.println(count);
    }
}
