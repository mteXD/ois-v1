public class Gravitacija {
    
    public static void main(String[] args) {
        System.out.println("OIS je zakon!");
    }

    public static double nadmorskaVisina(double v) {

        final double G = 6.674e-11;
        final double MASA_ZEMLJE = 5.972e24;
        final double POLMER_ZEMLJE = 6.371e6;

        return (G * MASA_ZEMLJE) / kvadrat(POLMER_ZEMLJE + v);

    }

    public static double kvadrat(double a) {
        return a * a;
    }

}

