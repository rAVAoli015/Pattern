public class Pattern{

    //use while loops
    public static void stars(int rows){
        String star = "*";
        while (rows > 0 ) {
            System.out.println(star);
            star = star + "**";
            rows -= 1;
        } 
    }
    public static void triangle(int rows){
        int row =0;
        while(row < rows){
            int col =0;
            while(col<=row){
                System.out.print(row+1);
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void odds(int start){
        for (int count = start; count > 0; count-=2){
            System.out.println(count);
            for(){
                
            }
        }
        
    }
   
    public static void main(String[] args) {
        //stars(7);
        //triangle(9);
        odds(9);
    }
}