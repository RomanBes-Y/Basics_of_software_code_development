package Basics_of_software_code_development;

public class Task8Сycles {
    public static void main (String[] args) {
        int number1 = 85091;
        int number2 = 851074;
        int min = Math.min(number1,number2);
        int max = Math.max(number1,number2);
        int maxR = max;
        int k;
        int m;
        while (min > 0) {
            k = min % 10;

            while (maxR > 0) {
                m = maxR % 10;
                if (k == m) {
                    System.out.print(k + " ");
                }
                maxR /= 10;
            }
            min /= 10;
            maxR += max;
        }

    }
}
