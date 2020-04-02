package com.bridgelabz.userregistration;

public class UserRegistration {

    String firstNamePattern = "^[A-Z][a-z]{2,}$";

    public boolean checkFirstName(String firstName) {
        boolean result = firstName.matches(firstNamePattern);
        return result;
    }
}
