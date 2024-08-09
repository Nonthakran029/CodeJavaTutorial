public class OverloadDemo {
    int x;
    OverloadDemo(){
        System.out.println("Insedde OverrloadDemo(). ");
        x = 0;
    }
    OverloadDemo(int i){
        System.out.println("Insedde OverrloadDemo(int). ");
        x = i;
    }
    OverloadDemo(double d){
        System.out.println("Insedde OverrloadDemo(double). ");
        x = (int)d;
    }
    OverloadDemo(int i, int j){
        System.out.println("Insedde OverrloadDemo(int, int). ");
        x = i * j;
    }
}
