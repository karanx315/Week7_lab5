package com.example.week7_lab5;

import android.os.Build;

public class PasswordValidator {
public boolean isMissingUpperCase(String password) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        return !password.chars().anyMatch(Character::isUpperCase);
    }
    return false;
}

    public boolean isMissingLowerCase(String password) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return !password.chars().anyMatch(Character::isLowerCase);
        }
        return false;
    }

    public boolean isMissingNumeric(String password) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return !password.chars().anyMatch(Character::isDigit);
        }
        return false;
    }

    public boolean isMissingSpecialCharacter(String password) {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return !password.chars().anyMatch(ch -> specialChars.indexOf(ch) >= 0);
        }
        return false;
    }

    public boolean isValidPassword(String password) {
        return !isMissingUpperCase(password) &&
                !isMissingLowerCase(password) &&
                !isMissingNumeric(password) &&
                !isMissingSpecialCharacter(password);
    }
}