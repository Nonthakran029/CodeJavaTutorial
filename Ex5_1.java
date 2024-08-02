public class Ex5_1 {
    public static double AIS(double base, double height) {
        return 0.5 * base * height;
    }
    public static void main(String[] args) {
        double base = 5.0;
        double height = 10.0;

        double area = AIS(base, height);
        System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
    }
}
