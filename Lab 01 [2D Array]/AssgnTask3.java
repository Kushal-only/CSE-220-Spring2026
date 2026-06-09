//Assignment Task 03: Game Arena
class AssgnTask3{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void playGame( Integer[][] arena ){ 
      Integer [][] a = arena ;
     int sum = 0;
     int row  = a.length;
     int col = a[0].length;
     for(int i=0;i<row;i++) {
       for(int j=0;j<col;j++) {
         if(a[i][j]%50==0 && a[i][j]!=0) {
           if(j>0) {
             if(a[i][j-1]!=0 && a[i][j-1]!=1) {
               sum = sum + 2;
             }
           }
           if(j<col-1) {
             if(a[i][j+1]!=0 && a[i][j+1]!=1) {
               sum = sum + 2;
             }
           }
           if(i>0) {
             if(a[i-1][j]!=0 && a[i-1][j]!=1) {
               sum = sum + 2;
             }
           }
           if(i<row-1) {
             if(a[i+1][j]!=0 && a[i+1][j]!=1) {
               sum = sum + 2;
             }
           }
         }
       }
     }
     if(sum<10) {
       System.out.println("Points Gained: " + sum + ". " + "Your team is out");
     }
     else {
       System.out.println("Points Gained: " + sum + ". " + "Your team has survived the game");
     }
    }
    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[][] arena = {
            {0,2,2,0},
            {50,1,2,0},
            {2,2,2,0},
            {1,100,2,0}
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena );

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
            {0,2,2,0,2},
            {1,50,2,1,100},
            {2,2,2,0,2},
            {0,200,2,0,0}
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);
        
        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");
        
        System.out.print("\nYour Output:\n");
        playGame( arena1 );
    }
}
