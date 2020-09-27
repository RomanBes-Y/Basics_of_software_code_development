package Basics_of_software_code_development;

import java.math.BigInteger;

public class Task4Сycles {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(1);
        for (int number = 1; number <= 200; number ++) {

            BigInteger num= BigInteger.valueOf(number * number);
            result = result.multiply(num);
        }
        System.out.println(result);
    }
}
