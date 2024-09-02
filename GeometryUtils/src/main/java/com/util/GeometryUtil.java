package com.util;

public class GeometryUtil {
    public static double convertToCentimeters(double meters) {
        return meters * 100;
    }

    public static double convertToMeters(double centimeters) {
        return centimeters / 100;
    }
}
