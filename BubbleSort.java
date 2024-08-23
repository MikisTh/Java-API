#BubbleSort
public static void main(String args[]){
	int[] vet = {8, 9, 3, 5, 1};
	int aux = 0;
	int i = 0;

	System.out.println("Vetor desordenado: ");
	for(i = 0; i<5; i++){
		System.out.println(" "+vet[i]);
	}
	System.out.println(" ");

	for(i = 0; i<5; i++){
		for(int j = 0; j<4; j++){
			if(vet[j] > vet[j + 1]){
				aux = vet[j];
				vet[j] = vet[j+1];
				vet[j+1] = aux;
			}
		}
	}
	System.out.println("Vetor organizado:");
	for(i = 0; i<5; i++){
		System.out.println(" "+vet[i]);
	}
}

// BubbleSort in java
public class BubbleSort {
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Method to print the array
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Main method to test the sorting algorithm
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
