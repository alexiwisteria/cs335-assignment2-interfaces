package edu.ensign.cs335.interfaces.shapes;

import edu.ensign.cs335.assignment2.interfaces.shape.Circle;
import edu.ensign.cs335.assignment2.interfaces.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the Circle class.
 *
 * NOTE: DO NOT MODIFY ANYTHING WITHIN THIS FILE.
 */
public class CircleTest extends Assertions {

    @Test
    public void testConstructorWithIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> new Circle(-1d));
    }

    @Test
    public void testConstructorWithValidArgument() {

        try {
            assertNotNull(new Circle(4d));
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @Test
    public void testGetArea() {
        Shape circle = new Circle(27d);

        assertEquals(2290.221044466959d, circle.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Shape circle = new Circle(67d);

        assertEquals(420.97341558103227d, circle.getPerimeter());
    }

    @Test
    public void testGetName() {
        Shape circle = new Circle(34d);

        assertEquals("Circle", circle.getName());
    }
}