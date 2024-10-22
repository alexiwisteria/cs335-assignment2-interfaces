package edu.ensign.cs335.assignment2.interfaces.shape;

/**
 * Class representing a Rectangle. The rectangle has a length and a width.
 * The area of a rectangle is calculated using the formula: length * width.
 * The perimeter of a rectangle is calculated using the formula: (2 * length) + (2 * width).
 */
public class Rectangle implements Shape {

    private Double length;
    private Double width;

    /**
     * Constructor for the Rectangle class.
     * It creates a Rectangle with a given length and width.
     *
     * @param length The length of the rectangle. Must be a positive number.
     * @param width The width of the rectangle. Must be a positive number.
     * @throws IllegalArgumentException if either the length or the width is less than or equal to zero.
     */
    public Rectangle(Double length, Double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Values must be greater than 0.");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates and returns the area of the rectangle.
     * The area is found using the formula: length * width.
     *
     * @return The area of the rectangle as a Double.
     */
    @Override
    public Double getArea() {
        return length * width;
    }

    /**
     * Calculates and returns the perimeter of the rectangle.
     * The perimeter is found using the formula: (2 * length) + (2 * width).
     *
     * @return The perimeter of the rectangle as a Double.
     */
    @Override
    public Double getPerimeter() {
        return 2 * length + 2 * width;
    }

    /**
     * Returns the name of the shape, which is "Rectangle".
     *
     * @return The string "Rectangle".
     */
    @Override
    public String getName() {
        return "Rectangle";
    }
}
