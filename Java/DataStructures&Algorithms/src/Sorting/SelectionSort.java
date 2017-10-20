package Sorting;

public class SelectionSort {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++){
			int index = i;
			for(int j = i + 1; j<n; j++){
				if(arr[j]<arr[index]){
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
	}

}
