class AssignmentTask02 {

    public static String hotPotato(String[] players, int k) {
      String [] p = players;
      LinkedListQueue q = new LinkedListQueue();
      for(int i=0;i<p.length;i++) {
        q.enqueue(p[i]);
      }
      int count = p.length;
        while(count>1) {
        for(int i=1;i<=k;i++) {
          Object t = q.dequeue();
          q.enqueue(t);
        }
        System.out.println(q.dequeue() + " eliminated");
        count--;
      }
        return (String)q.dequeue();
    }