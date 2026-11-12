package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class DistanceUnit extends Unit {

    public DistanceUnit(String name, String nameSingle, String symbol, DistanceUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<DistanceUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}
