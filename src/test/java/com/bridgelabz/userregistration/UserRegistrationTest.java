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
}
