public class SameArray {
    public static void main(String[] args) {
        int [] arrat1 = {2, 4, 6, 8, 10,};
        int [] arrat2 = arrat1;
        arrat1[0] = 200;
        arrat2[4] = 1000;
        System.out.println("The contents of array1 : ");
        for(int index = 0; index < arrat1.length; index++){
            System.out.print(arrat1[index]+ " ");
            System.out.println();
        }
        System.out.println("The contents of array2 : ");
        for(int index = 0; index < arrat2.length; index++){
            System.out.print(arrat1[index]+ " ");
            System.out.println();
        }
    }
}