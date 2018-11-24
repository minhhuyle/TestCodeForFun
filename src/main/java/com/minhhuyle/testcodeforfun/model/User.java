package com.minhhuyle.testcodeforfun.model;

import java.util.List;

public class User {
    private List<Address> addressList;
    private List<Device> deviceList;
    private List<User> friendList;

    public User() {
    }

    public List<Address> getAddressList() {

        return addressList;
    }

    public List<Device> getDeviceList() {

        return deviceList;
    }

    public List<User> getFriendList() {

        return friendList;
    }
}
