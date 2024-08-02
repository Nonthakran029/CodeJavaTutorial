import java.util.Scanner;
public class Ex5_4 {
    public static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        checkEvenOdd(num);
        scanner.close();
    }
}
