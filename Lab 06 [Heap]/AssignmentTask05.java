public static void task05(int [] arr, int k) {
    MaxHeap h = new MaxHeap(arr.length+1);
    for(int i=0;i<arr.length;i++) {
      h.insert(arr[i]);
    }
    int [] arr2 = new int[k];
    for(int i=0;i<k;i++) {
      arr2[i] = h.extractMax();
    }
    for(int i=0;i<arr2.length;i++) {
      System.out.println(arr2[i] + " ");
    }
  }