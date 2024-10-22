package edu.ensign.cs335.interfaces.shapes;

import edu.ensign.cs335.assignment2.interfaces.shape.Rectangle;
import edu.ensign.cs335.assignment2.interfaces.shape.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the Rectangle class.
 *
 * NOTE: DO NOT MODIFY ANYTHING WITHIN THIS FILE.
 */
public class RectangleTest extends Assertions {

    @Test
    public void testConstructorWithIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1d, 0d));
    }

    @Test
    public void testConstructorWithValidArgument() {

        try {
            assertNotNull(new Rectangle(2d, 4d));
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @Test
    public void testGetArea() {
        Shape square = new Rectangle(155d, 95d);

        assertEquals(14725d, square.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Shape square = new Rectangle(74d, 23d);

        assertEquals(194d, square.getPerimeter());
    }

    @Test
    public void testGetName() {
        Shape rectangle = new Rectangle(34d, 95d);

        assertEquals("Rectangle", rectangle.getName());
    }
}