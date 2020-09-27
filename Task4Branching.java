package Basics_of_software_code_development;

public class Task4Branching {
    public static void main(String[] args) {
        double a = 5;
        double b = 10;
        double x = 11;
        double y = 5;
        double z = 10;
        if ((x <= a && y <= b) || (x <= b && y <= a)) {
            System.out.println("Кирпич пройдет!");
        }
        else if ((z <= a && y <= b) || (z <= b && y <= a)) {
            System.out.println("Кирпич пройдет!");
        }
        else if ((z <= a && x <= b) || (z <= b && x <= a)) {
            System.out.println("Кирпич пройдет!");
        }
        else {
            System.out.println("Кирпич не пройдет!");
        }
    }

}
