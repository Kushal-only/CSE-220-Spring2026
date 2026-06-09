//Assignment Task 02: Matrix Compression
class AssgnTask2{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static Integer[][] compressMatrix( Integer[][] matrix ){
      Integer [][] a = matrix;
      int sum = 0;
      int row = a.length;
      int col = a[0].length;
      Integer [][] arr = new Integer [row/2][col/2];
      int row2 = 0;
      int col2 = 0;
      for(int i=0;i<row;i=i+2) {
        for(int j=0;j<col;j=j+2) {
          sum = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+1][j+1];
          arr[row2][col2] = sum;
          col2++;
        }
        col2=0;
        row2++;
      }  
        return arr;
    }
    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] matrix = {
            { 1 , 2 , 3 , 4 },
            { 5 , 6 , 7 , 8 },
            { 1 , 3 , 5 , 2 },
            {-2 , 0 , 6 ,-3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix( matrix );
        Arr.print2D( returnedArray );
    }
}
