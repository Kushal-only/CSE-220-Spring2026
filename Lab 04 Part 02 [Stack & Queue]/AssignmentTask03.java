class AssignmentTask03 {
    public static void dance_pair(Stack stk) {
      int count = 1;
      Queue q = new Queue();
      Queue q1 = new Queue();
      while(!stk.isEmpty()) {
        Dancer d = (Dancer)stk.pop();
        if(d.getGender()=='F') {
          if(q.isEmpty()) {
            q1.enqueue(d);
          }
          else {
            Dancer d1 = (Dancer)q.dequeue();
            System.out.println("#" + count + " " + d1.toString() + " & " + d.toString());
            count++;
          }
        }
       else {
         if(q1.isEmpty()) {
           q.enqueue(d);
         }
         else {
           Dancer d2 = (Dancer)q1.dequeue();
           System.out.println("#" + count + " " + d2.toString() + " & " + d.toString());
           count++;
         }
       }
      }
      if(!q1.isEmpty()) {
        System.out.println("Unpaired Female: ");
        while(!q1.isEmpty()) {
          System.out.println(q1.dequeue());
         }
       }
       else if(!q.isEmpty()) {
         System.out.println("Unpaired Male: ");
         while(!q.isEmpty()) {
           System.out.println(q.dequeue());
         }
       }
   }