public class LoopCall {
    public static void main(String[] args) {
        System.out.println("Hello from the main method.");
        for(int i = 1; i <= 5; i++){
            displaymessage();
        }
        System.out.println("back in the main method.");
    }
    public static void displaymessage() {
        System.out.println("Hello from the displaymessage.");
    }
}
