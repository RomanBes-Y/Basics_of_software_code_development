package Basics_of_software_code_development;

import java.util.Scanner;

public class Task7Сycles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ НАЧАЛЬНОЕ ЗНАЧЕНИЕ : ");
        int m = scanner.nextInt();
        System.out.print("ВВЕДИТЕ КОНЕЧНОЕ ЗНАЧЕНИЕ : ");
        int n = scanner.nextInt();
        int k = n;
        if (m > 0 && n > 0 && n >= m) {
            for (; m <= n; m ++) {
                System.out.print(m + " : ");
                for (int b = 1; b < k; b ++) {
                    if ((m % b == 0) && (m != b) && (b !=1)) {
                        System.out.print(b + " ");
                    }
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ОШИБКА : ЕСТЬ НЕ НАТУРАЛЬНОЕ ЧИСЛО!");
        }

    }
}
