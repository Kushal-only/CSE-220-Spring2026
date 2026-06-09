class AssignmentTask02 { 
private int hashFunction( String key ){
        int sum = 0;
      if(key.length()%2!=0) {
        key += 'N';
      }
        for(int i=0;i<key.length();i+=2) {
          int n1 = (int)key.charAt(i);
          int n2 = (int)key.charAt(i+1);
          String fChar = Integer.toString(n1);
          String sChar = Integer.toString(n2);
          String con = fChar+sChar;
          int sum1 = Integer.parseInt(con);
          sum += sum1;
        }
        return sum%key.length();
    }
 public String searchHashtable( Object[] keyValuePair ){
      String key = (String)keyValuePair[0];
      int idx = hashFunction(key);
      if(idx>=0 && idx<ht.length) {
        if(ht[idx]!=null) {
          PairNode cur = ht[idx];
          while(cur!=null) {
            if(cur.key==key) {
              System.out.println("(" + cur.key + "," + cur.value + ")" + " already Inserted. Cannot reinsert.");
              return "found";
            }
            cur = cur.next;
          }
        }
      }
        return "not found";
    }
}