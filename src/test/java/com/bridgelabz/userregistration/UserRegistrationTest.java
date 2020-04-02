package com.bridgelabz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Raj");
        Assert.assertTrue(result);
    }

    @Test
    public void givenValidLastName_ShouldReturnTrue()   {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkLastName("Kush");
        Assert.assertTrue(result);
    }

    @Test
    public void givenValidEmailId_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkEmailId("rajkush211.rk@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenValidMobileNumber_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkMobileNumber("91 7972299171");
        Assert.assertTrue(result);
    }
}
