package net.altoncook.measurelib.measure;

import net.altoncook.measurelib.unit.Unit;
import net.altoncook.measurelib.unit.Units;


/**
 * Represents a {@link Unit} and the amount of it as a magnitude.
 * @param <U> Dimension of the unit e.g. {@link net.altoncook.measurelib.unit.dimensions.DistanceUnit}, {@link net.altoncook.measurelib.unit.dimensions.MassUnit}
 */
public class Measure<U extends Unit> {
    private final double magnitude;
    private final U unit;

    public Measure(double magnitude, U unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Measure<U> in(U other) {
        return new Measure<>(other.fromBaseUnit(unit.toBaseUnit(magnitude)), other);
    }


    /**
     * Gets the magnitude of the Measure Object.
     *
     * @return Magnitude of the Measure Object in terms of the unit.
     */
    public double get() {
        return magnitude;
    }

    public Unit getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return sci(3);
    }

    /**
     * Turns this measure into scientific notation. The value is stored in floating point, so there will be floating point imprecision.
     *
     * @param sigFigs number of significant figures to show.
     * @return String representation in scientific notation.
     */
    public String sci(int sigFigs) {
        int exponent = (int) Math.floor(Math.log10(Math.abs(magnitude)));
        double value = Math.round(magnitude * Math.pow(10, sigFigs - 1) / Math.pow(10, exponent)) / Math.pow(10, sigFigs - 1);
        String formattedValue = ("%." + sigFigs + "g").formatted(value);

        // if the rounding made the number 10 or -10, recalculate
        if (Math.abs(Double.parseDouble(formattedValue)) >= 10.0) {
            value /= 10.0;
            exponent++;
            formattedValue = ("%." + sigFigs + "g").formatted(value);
        }
        return ("%s × 10^%s %s").formatted(formattedValue, exponent, unit.name);
    }

}

