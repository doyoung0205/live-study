package com.company.inheritance.good;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnyClassTest {
    @Test
    @DisplayName("정말 모든 클래스가 Object 를 상속 받고 있을까?")
    void anyClass() {

        AnyClass anyClass = new AnyClass();

        assertTrue(anyClass instanceof Object);
    }
}
