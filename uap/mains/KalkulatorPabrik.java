package uap.mains;

import java.util.Scanner;
import uap.models.Sphere;
import uap.models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NAMA LENGKAP : Aldin Ramadhan");
        System.out.println("NIM          : 245150707111066");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");

        System.out.print("Isikan Radius : ");
        double R = input.nextDouble();
        System.out.print("Isikan radius : ");
        double r = input.nextDouble();

        Torus torus = new Torus(R, r);
        System.out.println("=============================================");
        torus.printInfo();
        System.out.println("=============================================");

        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius : ");
        double radius = input.nextDouble();

        Sphere sphere = new Sphere(radius);
        System.out.println("=============================================");
        sphere.printInfo();
        System.out.println("=============================================");
    }
}
