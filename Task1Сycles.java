package Basics_of_software_code_development;

import java.util.Scanner;

public class Task1Сycles {
    public static void main(String[] args) {
        int result = 0;
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ ЧИСЛО >= 1: ");
        num = scan.nextInt();
        System.out.println();
        if (num >= 1) {
            for (int m = 1; m <= num; m++) {
                result = result + m;
            }
            System.out.println(result);
        }
        else {
            result = num;
            System.out.println("ВВЕДЕННОЕ ЧИСЛО < 1: " + result);
        }

    }
}
