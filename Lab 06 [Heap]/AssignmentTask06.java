class Max_heap {
  String name;
  int priority;
  public Max_heap(String name,int priority) {
    this.name = name;
    this.priority = priority;
  }
}
public static String [] task06(String [] n,int [] p) {
    MaxHeap h = new MaxHeap(p.length+1);
    String [] r2 = new String [n.length];
    for(int i=0;i<p.length;i++) {
      Max_heap m = new Max_heap(n[i],p[i]);
      h.insert(m);
    }
    for(int i=0;i<p.length;i++) {
      Max_heap nn = h.extractMax();
      r2[i] = nn.name;
    }
    return r2;
  }