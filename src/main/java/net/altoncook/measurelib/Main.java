package net.altoncook.measurelib;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.dimensions.DistanceUnit;

import static net.altoncook.measurelib.unit.Units.*;

public class Main {
    static void main() {
        Measure<DistanceUnit> dist = INCHES.of(9.99);

        System.out.println("in inches: " + dist);
        System.out.println("in meters: " + dist.in(METERS));
        System.out.println(METERS);
        System.out.println(KILOGRAM);
        System.out.println(INCHES);
        System.out.println(FEET);




        System.out.println("Printing time: " + MILLISECONDS.of(9.99324653).in(SECONDS).sci(10));


    }
}
