public class TwoDArray {
    public static void main(String[] args) {
        int[ ] [ ] table = new int[5][10];
        for(int row = 0; row < table.length; row++){
            for(int cal = 0; cal < table[row].length; cal++){
                table[row][cal] = row * 10 + cal;
            }
        }
        for(int row = 0; row < table.length; row++){
            for(int cal = 0; cal < table[row].length; cal++){
                System.out.print(table[row][cal]+"\t");
            }
            System.out.println();
        }   
    }
}
