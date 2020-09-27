package Basics_of_software_code_development;

public class Task5Branching {
    public static void main(String[] args) {
        double f;
        double x = 3;
        if (x <= 3) {
            f = x * x - 3 * x + 9;
            System.out.printf("f(x) = %.3f", f);
        }
        else {
            f = 1 / (Math.pow(x, 3) + 6);
            System.out.printf("f(x) = %.3f", f);

        }
    }
}
