package net.altoncook.measurelib.unit;

import net.altoncook.measurelib.unit.dimensions.DistanceUnit;
import net.altoncook.measurelib.unit.dimensions.MassUnit;
import net.altoncook.measurelib.unit.dimensions.TimeUnit;

public class Units {
    public static final DistanceUnit METERS = new DistanceUnit("meters", "meter", "m", null, 1);
    public static final DistanceUnit CENTIMETERS = new DistanceUnit("centimeters", "centimeters", "cm", METERS, 1 / 100D);
    public static final DistanceUnit FEET = new DistanceUnit("feet", "foot", "ft", METERS, 0.3048D);
    public static final DistanceUnit INCHES = new DistanceUnit("inches", "inch", "in", METERS, 0.0254D);

    public static final MassUnit KILOGRAM = new MassUnit("kilograms", "kiligram", "kg", null, 1);
    public static final MassUnit GRAM = new MassUnit("grams", "gram", "kg", KILOGRAM, 1 / 1000D);

    public static final TimeUnit SECONDS = new TimeUnit("seconds", "second", "s", null, 1);
    public static final TimeUnit MILLISECONDS = new TimeUnit("milliseconds", "milliseconds", "ms", SECONDS, 1 / 1000D);
    public static final TimeUnit MINUTES = new TimeUnit("minutes", "minute", "min", SECONDS, 60);
    private Units() {
    }

}
