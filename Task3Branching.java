package Basics_of_software_code_development;

public class Task3Branching {
    public static void main(String[] args) {
        double x1 = 2;
        double y1 = 4;
        double x2 = 4;
        double y2 = 6;
        double x3 = 3;
        double y3 = 5;
        double num1 = (x3 - x1) / (x2 - x1);
        double num2 = (y3 - y1) / (y2 - y1);
        if (num1 == num2) {
            System.out.println("НА ОДНОЙ ЛИНИИ!");
        }
        else {
            System.out.println("НЕ НА ОДНОЙ ЛИНИИ!");
        }

    }
}
