package items.util;

public class Rounder {
    public static double round(double v) {
        return Math.round(v * 100.0) / 100.0;
    }
}
