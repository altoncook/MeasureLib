package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class RealUnit extends Unit {

    public RealUnit(String name, String nameSingle, String symbol, RealUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<RealUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}

