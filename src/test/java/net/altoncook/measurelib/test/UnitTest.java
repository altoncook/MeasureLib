package net.altoncook.measurelib.test;

import net.altoncook.measurelib.measure.Measure;
import net.altoncook.measurelib.unit.dimensions.DistanceUnit;
import org.junit.jupiter.api.Test;

import static net.altoncook.measurelib.test.Utils.registerTestEquals;
import static net.altoncook.measurelib.test.Utils.space;
import static net.altoncook.measurelib.unit.Units.*;
import static net.altoncook.measurelib.unit.Units.FEET;
import static net.altoncook.measurelib.unit.Units.INCHES;
import static net.altoncook.measurelib.unit.Units.MILLISECONDS;
import static net.altoncook.measurelib.unit.Units.SECONDS;

class UnitTest {

    @Test
    void testUnitToString() {

        // checks rounding and sig figs
        Measure<DistanceUnit> dist = INCHES.of(9.999);
        registerTestEquals("1.00 × 10^1 inches", dist.toString());
        registerTestEquals("9.999 × 10^0 inches", dist.sci(4));
        registerTestEquals("2.54 × 10^-1 meters", dist.in(METERS).toString());
        Measure<DistanceUnit> dist2 = FEET.of(10);
        registerTestEquals("1.00 × 10^1 feet", dist2.toString());
        registerTestEquals("1.00 × 10^1 feet", dist2.toString());
        registerTestEquals("1.20 × 10^2 inches", dist2.in(INCHES).toString());
        registerTestEquals("1.00 × 10^1 feet", dist2.in(FEET).toString());
        registerTestEquals("9.993246000 × 10^-3 seconds", MILLISECONDS.of(9.993246).in(SECONDS).sci(10));
        space();

        // TODO: add all units
        registerTestEquals("meter, meters (m)", METERS.toString());
        registerTestEquals("kilogram, kilograms (kg)", KILOGRAM.toString());
        registerTestEquals("inch, inches (in)", INCHES.toString());
        registerTestEquals("foot, feet (ft)", FEET.toString());
        space();

        registerTestEquals("i, i (i)", IMAGINARY.toString());
        registerTestEquals("1.00 × 10^0 pi", VALUE.of(3.14159).in(PI_UNITS).toString());

    }
}
