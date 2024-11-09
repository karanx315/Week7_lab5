package com.example.week7_lab5;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidatorTest {

    private final PasswordValidator passwordValidator = new PasswordValidator();

    @Test
    public void testMissingUpperCase() {
        Assert.assertTrue(passwordValidator.isMissingUpperCase("abc123!"));
        Assert.assertFalse(passwordValidator.isMissingUpperCase("Abc123!"));
    }

    @Test
    public void testMissingLowerCase() {
        Assert.assertTrue(passwordValidator.isMissingLowerCase("ABC123!"));
        Assert.assertFalse(passwordValidator.isMissingLowerCase("Abc123!"));
    }

    @Test
    public void testMissingNumeric() {
        Assert.assertTrue(passwordValidator.isMissingNumeric("Abc!"));
        Assert.assertFalse(passwordValidator.isMissingNumeric("Abc123!"));
    }

    @Test
    public void testMissingSpecialCharacter() {
        Assert.assertTrue(passwordValidator.isMissingSpecialCharacter("Abc123"));
        Assert.assertFalse(passwordValidator.isMissingSpecialCharacter("Abc123!"));
    }

    @Test
    public void testValidPassword() {
        Assert.assertTrue(passwordValidator.isValidPassword("Abc123!"));
        Assert.assertFalse(passwordValidator.isValidPassword("abc123"));
    }
}