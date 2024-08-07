public class Student {
    private String id;
    private String name;
    private double gpa;
    public void setDetails(String ID,String N,double GPA){
        id = ID;
        name = N;
        gpa = GPA;
    }
    public void showDetails(){
        System.out.println("ID : " +id);
        System.out.println("Name : " +name);
        System.out.println("GPA : " +gpa);
    }
    public static void main(String[] args) {
        Student sc1 = new Student();
        sc1.setDetails("12123", "Nonthakarn", 4.00);
        sc1.showDetails();
        Student sc2 = new Student();
        sc2.setDetails("34123", "Boob", 3.50);
        sc2.showDetails();
    }
}
