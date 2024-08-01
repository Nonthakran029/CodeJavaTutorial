public class ExNO1 {
    public static void main(String[] args) {
        int form = 2;
        int ex = 100;
        System.out.println("Even numbers from " + form + " to " + ex + ":");
        for (int i = form; i <= ex; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}