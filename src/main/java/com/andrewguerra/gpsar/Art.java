package com.andrewguerra.gpsar;

import java.io.IOException;
import java.nio.file.Path;

import io.jenetics.jpx.GPX;

public class Art {
    public void render(String filename) throws IOException{
        final GPX gpx = GPX.builder().addTrack(track -> track
        .addSegment(segment -> segment
        .addPoint(p -> p.lat(44.977649).lon(-93.224717))
        .addPoint(p -> p.lat(44.977655).lon(-93.224428))
        .addPoint(p -> p.lat(44.97765).lon(-93.224215))
        .addPoint(p -> p.lat(44.97763).lon(-93.223971))
        .addPoint(p -> p.lat(44.977625).lon(-93.22394))
        ))
        .build();

        GPX.write(gpx, Path.of(filename));
    }

    public static void main(String[] args) throws IOException {
        Art art = new Art();
        art.render("test.gpx");
    }
}
