package Basics_of_software_code_development;

public class Task3 {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        double result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.printf("%.2f", result);
    }
}
