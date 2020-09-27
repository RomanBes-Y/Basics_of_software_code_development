package Basics_of_software_code_development;

public class Task2Branching {
    public static void main(String[] args) {
        double a = 5;
        double b = 8.43;
        double c = 8.42;
        double d = 5;
        double min1;
        double min2;
        double max;
        if (a >= b) {
            min1 = b;
        }
        else {
            min1 = a;
        }
        if (c >= d) {
            min2 = d;
        }
        else {
            min2 = c;
        }
        if (min1 > min2) {
            System.out.println("MAX = " + min1);
        }
        else if (min1 < min2) {
            System.out.println("MAX = " + min2);
        }
        else if (min1 == min2) {
            System.out.println("Два значения одинаковые!");
        }

    }
}
