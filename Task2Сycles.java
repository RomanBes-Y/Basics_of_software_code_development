package Basics_of_software_code_development;

public class Task2Сycles {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double h = 0.2;
        double y = 0;
        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                y = y + x;
            }
            else {
                y = y + (- x);
            }
        }
        System.out.printf("y(x) = %.3f", y);


    }
}
