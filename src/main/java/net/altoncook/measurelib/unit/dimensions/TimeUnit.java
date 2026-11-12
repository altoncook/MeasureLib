package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class TimeUnit extends Unit {

    public TimeUnit(String name, String nameSingle, String symbol, TimeUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<TimeUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}
