package edu.ensign.cs335.interfaces.shapes;

import edu.ensign.cs335.assignment2.interfaces.shape.Rectangle;
import edu.ensign.cs335.assignment2.interfaces.shape.Shape;
import edu.ensign.cs335.assignment2.interfaces.shape.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the Square class.
 *
 * NOTE: DO NOT MODIFY ANYTHING WITHIN THIS FILE.
 */
public class SquareTest extends Assertions {

    @Test
    public void testConstructorWithIllegalArgument() {
        assertThrows(IllegalArgumentException.class, () -> new Square(-1d));
    }

    @Test
    public void testConstructorWithValidArgument() {

        try {
            assertNotNull(new Square(4d));
        } catch (IllegalArgumentException e) {
            fail();
        }
    }

    @Test
    public void testGetArea() {
        Shape square = new Square(25d);

        assertEquals(625d, square.getArea());
    }

    @Test
    public void testGetPerimeter() {
        Shape square = new Square(45d);

        assertEquals(180d, square.getPerimeter());
    }

    @Test
    public void testGetName() {
        Shape square = new Square(34d);

        assertEquals("Square", square.getName());
    }
}