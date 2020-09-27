package Basics_of_software_code_development;

public class Task3Сycles {
    public static void main(String[] args) {
        int result = 0;
        for (int number = 1; number <= 100; number ++) {
            result = result + (int) Math.pow(number, 2);
        }
        System.out.println(result);
    }
}
