package net.altoncook.measurelib.contant;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.dimensions.RealUnit;

import static net.altoncook.measurelib.unit.Units.VALUE;

public class Constants {

    public static final Measure<RealUnit> PI = VALUE.of(Math.PI);
    public static final Measure<RealUnit> TAU = VALUE.of(Math.PI * 2);
    public static final Measure<RealUnit> E = VALUE.of(Math.E);
    public static final Measure<RealUnit> PHI = VALUE.of((1 + Math.sqrt(5)) / 2);

    private Constants() {}
}
