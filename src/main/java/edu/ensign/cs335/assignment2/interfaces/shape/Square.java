package edu.ensign.cs335.assignment2.interfaces.shape;

/**
 * Class representing a Square. The square has a side length, and all sides are equal in length.
 * The area of a square is calculated using the formula: length * length.
 * The perimeter of a square is calculated using the formula: 4 * length.
 */
public class Square implements Shape {

    private Double length;

    /**
     * Constructor for the Square class.
     * It creates a Square with a given side length.
     *
     * @param length The side length of the square. Must be a positive number.
     * @throws IllegalArgumentException if the length is less than or equal to zero.
     */
    public Square(Double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    /**
     * Calculates and returns the area of the square.
     * The area is found using the formula: length * length.
     *
     * @return The area of the square as a Double.
     */
    @Override
    public Double getArea() {
        return length * length;
    }

    /**
     * Calculates and returns the perimeter of the square.
     * Since all sides of a square are equal, the perimeter is found using the formula: 4 * length.
     *
     * @return The perimeter of the square as a Double.
     */
    @Override
    public Double getPerimeter() {
        return 4 * length;
    }

    /**
     * Returns the name of the shape, which is "Square".
     *
     * @return The string "Square".
     */
    @Override
    public String getName() {
        return "Square";
    }
}
