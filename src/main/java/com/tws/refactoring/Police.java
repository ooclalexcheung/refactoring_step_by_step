package com.tws.refactoring;

public class Police {
    private static int validAdultAge = 18;


    public boolean checkDriverAge(Driver driver) {
        return(driver.getAge() >= this.validAdultAge);
    }
}
