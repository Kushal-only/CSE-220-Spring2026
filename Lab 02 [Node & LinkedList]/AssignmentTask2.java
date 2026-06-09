// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2{
    
    // MUST SUBMIT this method
    public static Node organizeBooks(Node head, Integer[] popularity) {
      Node current = head;
      Integer [] p = popularity;
      Node temp = head;
      int ncount = 0;
      while(current!=null) {
        ncount++;
        current = current.next;
      }
      String [] b = new String [ncount];
      for(int i=0;i<b.length;i++) {
        b[i] = (String)temp.elem;
        temp = temp.next;
      }
      for(int i=0;i<b.length-1;i++) {
        for(int j=0;j<p.length-1-i;j++) {
          if(p[j] < p[j+1]) {
            int t = p[j];
            String n = b[j];
            p[j] = p[j+1];
            b[j] = b[j+1];
            p[j+1] = t;
            b[j+1] = n;
          }
        }
      }
      Node n = null;
      Node cur = null;
      for(int i=0;i<b.length;i++) {
        Node newNode = new Node (b[i]);
        if(n==null) {
          n = newNode;
          cur = n;
        }
        else {
          cur.next = newNode;
          cur = newNode;
        }
      }     
        return n; 
    }
    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twlight"});
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
