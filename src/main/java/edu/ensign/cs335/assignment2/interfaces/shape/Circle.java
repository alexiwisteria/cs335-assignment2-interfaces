package edu.ensign.cs335.assignment2.interfaces.shape;

/**
 * Class representing a Circle. The circle has a radius that is a double.
 * The area of a circle is calculated using the formula: π * radius².
 * The perimeter (or circumference) of a circle is calculated using the formula: 2 * π * radius.
 *
 * @param <T> The type of the number used for the radius, which must extend from Number.
 */
public class Circle<T extends Number> implements Shape {

    private Double radius;

    /**
     * Constructor for the Circle class.
     * It creates a Circle with a given radius.
     *
     * @param radius The radius of the circle. Must be a positive number.
     * @throws IllegalArgumentException if the radius is less than or equal to zero.
     */
    public Circle(Double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     * The area is found using the formula: π * radius².
     *
     * @return The area of the circle as a Double.
     */
    @Override
    public Double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /**
     * Calculates and returns the perimeter (circumference) of the circle.
     * The perimeter is found using the formula: 2 * π * radius.
     *
     * @return The perimeter of the circle as a Double.
     */
    @Override
    public Double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns the name of the shape, which is "Circle".
     *
     * @return The string "Circle".
     */
    @Override
    public String getName() {
        return "Circle";
    }
}
