package net.altoncook.measurelib.unit.dimensions;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.Unit;

public class ImagnaryUnit extends Unit {

    public ImagnaryUnit(String name, String nameSingle, String symbol, ImagnaryUnit baseUnit, double scaleFactor) {
        super(name, nameSingle, symbol, baseUnit, scaleFactor);
    }

    public Measure<ImagnaryUnit> of(double magnitude) {
        return new Measure<>(magnitude, this);
    }
}

