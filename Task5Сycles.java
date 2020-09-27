package Basics_of_software_code_development;

public class Task5Сycles {
    public static void main(String[] args) {
        double e = 0.0001;
        int numEnd = 200;
        double sum;
        double result = 0;
        for (int num = 0; num <= numEnd; num ++) {
            sum = 1 / Math.pow(2, num) + 1 / Math.pow(3, num);
            if (sum >= e) {
                result = result + sum;
            }
        }
        System.out.println(result);

    }
}
