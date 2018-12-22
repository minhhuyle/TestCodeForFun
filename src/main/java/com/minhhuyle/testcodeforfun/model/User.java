package com.minhhuyle.testcodeforfun.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class User {
    private List<Address> addressList;
    private List<Device> deviceList;
    private List<User> friendList;

    private User() {
        addressList = new ArrayList<>();
    }

    public List<Address> getAddressList() {

        return Collections.unmodifiableList(addressList);
    }

    public void addNewAddress(Address newAddress) {
        addressList.add(newAddress);
    }

    public List<Device> getDeviceList() {

        return deviceList;
    }

    public List<User> getFriendList() {

        return friendList;
    }

    public static User createDefaultUser() {
        return new User();
    }
}
