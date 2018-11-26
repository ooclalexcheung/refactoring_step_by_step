package com.tws.refactoring;

public class Police {
    private static int validAdultAge = 18;

    public boolean checkDriver(Driver driver) {
        if(driver.getAge() >= Police.validAdultAge) return true;
        else return false;
    }
}
