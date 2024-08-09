public class ContructorDemo {
    public static void main(String[] args) {
    ContRectangle boxA = new ContRectangle(8.0, 12.0);
    ContRectangle boxB = new ContRectangle();

    /*
     Rectangle box = new Rectangle();
     box.setLength(8.0);
     box.setWidth(12.0);
     */
    System.out.println("the boxA's length is " +boxA.getLength());
    System.out.println("the boxA's width is " +boxA.getWidth());
    System.out.println("the boxA's area is " +boxA.getArea());
    System.out.println("the boxB's length is " +boxB.getLength());
    System.out.println("the boxB's width is " +boxB.getWidth());
    System.out.println("the boxB's area is " +boxB.getArea());
    }
}