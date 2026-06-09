public static void task04(int [] arr, int m) {
    MinHeap h = new MinHeap(m+1);
    for(int i=0;i<m;i++) {
      h.insert(0);
    }
    for(int i = 0;i<arr.length;i++) {
      int s = h.extractMin();
      h.insert(s+arr[i]);
    }
    while(!h.isEmpty()) {
      System.out.println(h.extractMin());
    }
  }  