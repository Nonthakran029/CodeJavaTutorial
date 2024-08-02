public class DemoArg {
    public static void main(String[] args) {
        System.out.println("start in main.");
        int total;
        int tesetNum = 10;
        displaymessage(5);
        displaymessage(tesetNum);
        displaymessage(tesetNum * 5);
        total = showSum(3, 4);
        System.out.println("total have value :"+total);
    }
    public static void displaymessage(int num){
        System.out.println("value is "+num);
    }
    public static int showSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }
}
