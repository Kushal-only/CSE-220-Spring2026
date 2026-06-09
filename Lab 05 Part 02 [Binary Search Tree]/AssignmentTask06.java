//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
      return isbst(root,null,null);
    }
    private static boolean isbst(BSTNode root, Integer a, Integer b) {
    if(root==null) {
      return true;
    }
    if(a!=null && a>=root.elem) {
      return false;
    }
    if(b!=null && b<=root.elem) {
      return false;
    }
    return isbst(root.left,a,root.elem) && isbst(root.right,root.elem,b);
  }
    //===============================================================


}
