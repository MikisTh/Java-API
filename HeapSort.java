public static void heapSort(int[] array) {
    if (array.length == 0) {
        return;
    }
    
    int length = array.length;
  
    for (int i = length / 2 - 1; i >= 0; i--) {
        heapify(array, length, i);
    }
    
    for (int i = length - 1; i >= 0; i--) {
        int tmp = array[0];
        array[0] = array[i];
        array[i] = tmp;
        heapify(array, i, 0);
    }
}
