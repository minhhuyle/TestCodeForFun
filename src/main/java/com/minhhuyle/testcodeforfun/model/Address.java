package com.minhhuyle.testcodeforfun.model;

public class Address {
    private String street;
    private String postalCode;

    private Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    private void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }





    public static Address createDefaultAddress() {
        return new Address();
    }

    public static Address createAddressWith(final String street, final String postalCode) {
        Address address = new Address();
        address.setStreet(street);
        address.setPostalCode(postalCode);

        return address;
    }
}
