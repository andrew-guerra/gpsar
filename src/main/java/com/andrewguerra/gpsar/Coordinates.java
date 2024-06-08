package com.andrewguerra.gpsar;

/**
 * A Coordinates object represents both the latitudinal and longitudinal
 * coordinates for Earth coordinates.   
 */
public class Coordinates {
    public final double latitude, longitude;

    /**
     * Constructs a Coordinates object with a latitude and longitude.
     * 
     * @param latitude The latitude coordinate
     * @param longitude The longitude coordinate
     */
    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
