package edu.ensign.cs335.assignment2.interfaces.shape;

/**
 * Course: CS 335
 * Interface for defining methods that are common amongst all 2-dimensional shapes.
 *
 * NOTE: Do NOT change or modify this interface.
 */
public interface Shape {

    /**
     * Calculates the area of a Shape instance and returns it.
     * @return double The area of the instance.
     */
    Double getArea();

    /**
     * Calculates the perimeter of a Shape instance and returns it.
     * @return double The perimeter of the instance.
     */
    Double getPerimeter();

    /**
     * Returns the name of the Shape instance.
     * @return
     */
    String getName();
}