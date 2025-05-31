package uap.models;

import uap.bases.Shape;
import uap.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {}

    public Torus(double majorRadius, double minorRadius) {
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    public double gramToKilogram() {
        return Math.ceil(getMass() / DENOMINATOR);
    }

    public double calculateCost() {
        return gramToKilogram() * PRICE_PER_KG;
    }

    public void printInfo() {
        System.out.printf("Volume         : %.2f\n", getVolume());
        System.out.printf("Luas permukaan : %.2f\n", getSurfaceArea());
        System.out.printf("Massa          : %.2f\n", getMass());
        System.out.printf("Massa dalam kg : %.0f\n", gramToKilogram());
        System.out.printf("Biaya kirim    : Rp%.0f\n", calculateCost());
    }
}