package Basics_of_software_code_development;

public class Task6 {
    public static void main(String[] args) {
        int x = 2;
        int y = 0;
        boolean flagUp;
        boolean flagDown;
        boolean flagResult;
        flagUp = ((x < 2 && x > -2 && y < 4 && y >= 0));
        flagDown = ((x < 4 && x > -4 && y <= -1 && y > -3));
        flagResult = (flagUp || flagDown);
        System.out.println(flagResult);
    }
}
