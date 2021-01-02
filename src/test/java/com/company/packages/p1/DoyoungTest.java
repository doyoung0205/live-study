package com.company.packages.p1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoyoungTest {


    @Test
    @DisplayName("Doyoung 의 이름은 doyoung")
    void doyoungNameIsDoyoung() {
        Doyoung doyoung = new Doyoung();
        final String doyoungName = doyoung.getName();

        assertEquals(doyoungName, "doyoung");
    }


}
