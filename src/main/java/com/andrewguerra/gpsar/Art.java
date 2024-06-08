package com.andrewguerra.gpsar;

import java.io.IOException;
import java.nio.file.Path;

import io.jenetics.jpx.GPX;

/**
 * An Art object reprents GPS art that will be rendered into a GPX file.
 */
public class Art {
    private final Coordinates position;
    private final Coordinates[] coordinates;

    /**
     * Constructs an Art object with a position and a list of coordinates.
     * 
     * @param position The position of the GPS art
     * @param coordinates The coordinates that make up the GPS art
     */
    public Art(Coordinates position, Coordinates[] coordinates) {
        this.position = position;
        this.coordinates = coordinates;
    }

    /**
     * Renders the Art object into a GPX file with filename.
     * 
     * @param filename File name of rendered GPX file
     * @throws IOException If GPX file is not properly written
     */
    public void render(String filename) throws IOException {
        final GPX gpx = GPX.builder().addTrack(track -> track.addSegment(segment -> {
            for(Coordinates point : coordinates) {
                segment.addPoint(p -> p.lat(point.latitude).lon(point.longitude));
            }
        })).build();

        GPX.write(gpx, Path.of(filename));
    }
}
