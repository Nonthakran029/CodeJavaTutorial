public class ExNo3 {
    public static void main(String[] args) {
        int multiplier = 8;
        int maxMultiplier = 12;
        System.out.println("Multiplication table for " + multiplier + ":");

        for (int i = 1; i <= maxMultiplier; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}