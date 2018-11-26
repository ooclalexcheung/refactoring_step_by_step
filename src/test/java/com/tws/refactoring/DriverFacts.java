package com.tws.refactoring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DriverFacts {

    @Test
    void shouldGetDriverAge(){
        Police police = new Police();
        assertTrue(police.checkDriverAge(new Driver(18)));
        assertFalse(police.checkDriverAge(new Driver(17)));
    }

}
