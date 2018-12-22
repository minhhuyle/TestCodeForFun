package com.minhhuyle.testcodeforfun.model;

public class UserBuilder {

    public static User createUserWith10FakeAddress() {
        User user = User.createDefaultUser();

        user.addNewAddress(Address.createAddressWith("aba", "00"));
        user.addNewAddress(Address.createAddressWith("bac", "11"));
        user.addNewAddress(Address.createAddressWith("ccd", "22"));
        user.addNewAddress(Address.createAddressWith("ddd", "33"));
        user.addNewAddress(Address.createAddressWith("eez", "44"));
        user.addNewAddress(Address.createAddressWith("ffd", "55"));
        user.addNewAddress(Address.createAddressWith("dzd", "66"));
        user.addNewAddress(Address.createAddressWith("ddd", "77"));
        user.addNewAddress(Address.createAddressWith("dfd", "88"));
        user.addNewAddress(Address.createAddressWith("dff", "99"));

        return user;
    }
}
