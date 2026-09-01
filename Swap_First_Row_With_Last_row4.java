public class Swap_First_Row_With_Last_row4 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int i=0;i<array.length;i++){
            int temp=array[i][0];
            array[i][0]=array[i][array[i].length-1];
            array[i][array[i].length-1]=temp;


        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        
        }
        
    }
    
}