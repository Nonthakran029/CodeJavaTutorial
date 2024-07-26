import java.util.Scanner; //เรียกใช้คลาส Scanner 
public class calnum {
    public static void main(String[] args) {
        int x, y;
        Scanner in = new Scanner(System.in); // step2
        System.out.print("Input Number1 : ");
        x = in.nextInt(); //step3
        System.out.println("your Number is "+x);
        System.out.print("Input Number2 : ");
        y = in.nextInt();
        System.out.println("your Number2 is "+y);
        System.out.println(x+ " + " +y+ " = " +(x+y));
    }
}
