package Basics_of_software_code_development;

import java.lang.Math;

public class Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        int c = 8;
        double result = ((b + Math.sqrt(b * b+ 4 * a * c))/ (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, - 2);
        System.out.println(result);
    }
}
