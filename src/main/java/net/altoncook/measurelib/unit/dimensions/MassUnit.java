package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class MassUnit extends Unit {

    public MassUnit(String name, String nameSingle, String symbol, MassUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<MassUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}

