package com.frgp.f1telemetry.entity.elements;

public enum Formula {
    MODERN,
    CLASSIC,
    F2,
    GENERIC;

    public static Formula fromInt(int i) {
        switch (i) {
            case 0:
                return Formula.MODERN;
            case 1:
                return Formula.CLASSIC;
            case 2:
                return Formula.F2;
            case 3:
                return Formula.GENERIC;
            default:
                return null;
        }
    }
}
