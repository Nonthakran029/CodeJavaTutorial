public class LibraryCard {
    private Student_1 owner;/*ประกาศออบเจ๊กต์ owner ซึ่งอยู่ในคลาส Student */
    private int borrowcnt;
    public LibraryCard(){
        owner = null;
        borrowcnt = 0;
    }
    public void checkOut(int numOfBooks){
        borrowcnt = borrowcnt + numOfBooks;
    }
    public void setOwnerName(Student_1 student1){
        /*เมธอดกำหนดผู้ยืม โดยจะรับข้อมูล */
            owner = student1;
    }
    public int getNumberOfBooks(){
        return borrowcnt;
    }
    public String getOwnerName(){
        return owner.getName();
    }
    public String toString(){
        return ("owner Name : " +owner.getName()+ "\n"+"Email : " +owner.getEmail()+ "\n"+"Books Borrowner : " +borrowcnt);
    }
}
