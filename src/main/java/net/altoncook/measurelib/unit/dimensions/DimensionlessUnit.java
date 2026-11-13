package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class DimensionlessUnit extends Unit {

    public DimensionlessUnit(String name, String nameSingle, String symbol, DimensionlessUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<DimensionlessUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}

