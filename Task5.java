package Basics_of_software_code_development;

public class Task5 {
    public static void main (String[] args) {
        int t = 643;
        int n = t / (60 * 60);
        int m = (t - (60 * 60)*n) / 60;
        int s = (t - (60 * 60)*n) % 60;
        System.out.println(n + " ч " + m +" мин " + s + " с");
    }
}
