package com.kodilla.good.patterns.challenges;

public class Customer {

    private String name;
    private String surname;
    private String email;
    private int phoneNumber;
    private String address;

    public Customer(String name, String surname, String email, int phoneNumber, String address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
