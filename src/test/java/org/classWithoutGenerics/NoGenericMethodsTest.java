package org.classWithoutGenerics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NoGenericMethodsTest {
    private String name;
    private String city;
    private int age;

    @BeforeEach
    void setUp() {

        name = "Adriana";
        age = 27;
        city = "Barcelona";

    }

    @Test
    void testTypicallyOrder() {
        NoGenericMethods obj = new NoGenericMethods(name, age, city);

        assertEquals("Adriana", obj.getElement1());
        assertEquals(27, obj.getElement2());
        assertEquals("Barcelona", obj.getElement3());
    }

    @Test
    void testDifferentOrder() {
        NoGenericMethods obj = new NoGenericMethods(age, city, name);

        assertEquals(27, obj.getElement1());
        assertEquals("Barcelona", obj.getElement2());
        assertEquals("Adriana", obj.getElement3());

    }

}