import java.util.Scanner;

public class Gravitacija {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesite nadmorsko visino (km): ");
        double visina = sc.nextDouble();
        System.out.printf("Gravitacija na tej visini: %.2f m/s^2%n", nadmorskaVisina(visina));
        System.out.println("OIS je zakon!");
    }

    public static double nadmorskaVisina(double v) {

        final double G = 6.674e-11;
        final double MASA_ZEMLJE = 5.972e24;
        final double POLMER_ZEMLJE = 6.371e6;

        return (G * MASA_ZEMLJE) / kvadrat(POLMER_ZEMLJE + v * 1000);

    }

    public static double kvadrat(double a) {
        return a * a;
    }

    public static void izpisiNadmorskaVisina(double nadVisina) {     //naprinta nadmorsko višino
        System.out.println(nadVisina);
    }

    public static void izpisiGravitacijskiPospesek(double gravitacijskiPospesek) {      //Naprinta gravitacijski pospešek
        System.out.println(gravitacijskiPospesek);
    }

}