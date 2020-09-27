package Basics_of_software_code_development;

public class Task1Branching {
    public static void main (String[] args) {
        int u1 = 60;
        int u2 = 119;
        if ((u1 + u2) < 180) {
            System.out.println("Треугольник существует!");
            int u3 = 180 - u1 - u2;

                if (u1 == 90 || u2 == 90 || u3 == 90) {
                    System.out.println("Треугольник прямоугольный!");
                }
                else {
                    System.out.println("Треугольник не прямоугольный!");
                }
        }
        else {
            System.out.println("Треугольника не существует!");
        }

    }
}
