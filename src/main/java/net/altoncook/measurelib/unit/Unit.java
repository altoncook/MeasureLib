package net.altoncook.measurelib.unit;

import net.altoncook.measurelib.measure.Measure;

public abstract class Unit {
    public final String name; // Human-readable name of the unit. should be plural,  e.g. ,eters
    public final String nameSingle; // Human-readable name of the unit singular, e.g. meter
    public final String symbol; // Symbol of the unit. e.g. m, mm, s, K

    private final Unit baseUnit; // Base unit this unit is connected to. will be null if this is a base unit

    private final UnitConverterFunction toBaseFunction; // Converts a value to the base unit
    private final UnitConverterFunction fromBaseFunction; // Converts a value from the base unit

    public Unit(String name, String nameSingle, String symbol, Unit baseUnit, UnitConverterFunction toBaseFunction, UnitConverterFunction fromBaseFunction) {
        this.name = name;
        this.nameSingle = nameSingle;
        this.symbol = symbol;
        this.baseUnit = baseUnit;
        this.toBaseFunction = toBaseFunction;
        this.fromBaseFunction = fromBaseFunction;
    }

    public Unit(String name, String nameSingle, String symbol, Unit baseUnit, double scaleFactor) {
        this.name = name;
        this.nameSingle = nameSingle;
        this.symbol = symbol;
        this.baseUnit = baseUnit;
        this.toBaseFunction = i -> i * scaleFactor;
        this.fromBaseFunction = i -> i / scaleFactor;
    }

    abstract public Measure<?> of(double magnitude);

    public double toBaseUnit(double nativeMagnitude) {
        return this.toBaseFunction.apply(nativeMagnitude);
    }

    public double fromBaseUnit(double baseMagnitude) {
        return this.fromBaseFunction.apply(baseMagnitude);
    }


    @Override
    public String toString() {
        return "%s, %s (%s)".formatted(this.nameSingle, this.name, this.symbol);
    }
}
