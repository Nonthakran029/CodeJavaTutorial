import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        /*
         1.nextByte() ชนิดขอมูลแบบ Byte
         2.nextDouble() ชนิดขอมูลแบบ Double
         3.nextFloat() ชนิดขอมูลแบบ Float
         4.nextInt() ชนิดขอมูลแบบ Int
         5.nextline() ชนิดขอมูลแบบ String
         6.nextlong() ชนิดขอมูลแบบ long
         7.nextshort() ชนิดขอมูลแบบ Short
         */
        String name;
        int hours;
        double payRate;
        double grossPay;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your name? : ");
        name = keyboard.nextLine();
        System.out.print("How many hours dis you work this week? : ");
        hours = keyboard.nextInt();
        System.out.print("What is your hourly pay rate? : ");
        payRate = keyboard.nextDouble();
        grossPay = hours * payRate;
        System.out.println("Hello " +name);
        System.out.println("Your gross pay is "+grossPay);
    }
}
