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
public class HeapSort {
  
    public void sort(int arr[]) {
      int n = arr.length;
  
      // Build max heap
      for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
      }
  
      // Heap sort
      for (int i = n - 1; i >= 0; i--) {
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;
  
        // Heapify root element
        heapify(arr, i, 0);
      }
    }
  
    void heapify(int arr[], int n, int i) {
      // Find largest among root, left child and right child
      int largest = i;
      int l = 2 * i + 1;
      int r = 2 * i + 2;
  
      if (l < n && arr[l] > arr[largest])
        largest = l;
  
      if (r < n && arr[r] > arr[largest])
        largest = r;
  
      // Swap and continue heapifying if root is not largest
      if (largest != i) {
        int swap = arr[i];
        arr[i] = arr[largest];
        arr[largest] = swap;
  
        heapify(arr, n, largest);
      }
    }
  
    // Function to print an array
    static void printArray(int arr[]) {
      int n = arr.length;
      for (int i = 0; i < n; ++i)
        System.out.print(arr[i] + " ");
      System.out.println();
    }
  
    // Driver code
    public static void main(String args[]) {
      int arr[] = { 1, 12, 9, 5, 6, 10 };
