public class ExNO2 {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Numbers from 1 to " + limit + " that are divisible by both 3 and 5:");

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}