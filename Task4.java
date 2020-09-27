package Basics_of_software_code_development;

public class Task4 {
    public static void main(String[] args) {
        double r = 734.924;
        double m1 = Math.floor(r);
        double m2 = r - m1;
        double result = m1 / 1000 + m2 * 1000;
        System.out.printf("%.3f", result);
    }
}
