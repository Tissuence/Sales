package utils;

import java.text.DecimalFormat;

public class Rounder {

    public Rounder() {
    }

    public static String roundValue(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }
}
