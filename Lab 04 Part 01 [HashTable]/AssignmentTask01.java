class AssignmentTask01 {
  private int hashFunction( Integer key ){
       if(key==null) {
        return -1;
      }
      return (key+3)%ht.length;
    }
  public void remove( Integer key ){
      int idx = hashFunction(key);
      if(idx==-1) {
        return;
      }
      if(ht[idx]==null) {
        return;
      }     
        PairNode cur = ht[idx];
        PairNode prev = null;
        while(cur!=null) {
          if(cur.key==key) {
            if(prev==null) {
              ht[idx] = cur.next;
            }
            else {
            prev.next = cur.next;
            }
          }
          prev = cur;
          cur = cur.next;
        }
    }
 
}