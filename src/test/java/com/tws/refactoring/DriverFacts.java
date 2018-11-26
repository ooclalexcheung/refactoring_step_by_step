package com.tws.refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DriverFacts {

    @Test
    void shouldGetDriverAge(){
        Police police = new Police();
        assertTrue(police.checkDriver(new Driver(18)));
        assertFalse(police.checkDriver(new Driver(17)));
    }

}
