package Sorting;

public class MergeSort {
	public static void mergeSort(int[] arr, int low, int high){
		if(low<high){
			int middle = low + (high - low) / 2;
			mergeSort(arr,low,middle);
			mergeSort(arr,middle+1, high);
			merge(arr,low,middle,high);
		}
	}
	public static void merge(int[] arr, int low, int middle, int high){
		int i, j, k;
		int n1 = middle - low + 1;
		int n2 = high - middle;
		int[] Low = new int[n1];
		int[] High = new int[n2];
		
		for(i= 0; i < n1; i++){
			Low[i] = arr[low+1];
		}
		for(i = 0; i < n2;i++){
			High[i] = arr[middle+1+i];
		}
		i = 0;
		j = 0;
		k = low;
		
		while((i<n1) && (j<n2)){
			if(Low[i]<= High[j]){
				arr[k] = Low[i];
				i++;
			}
			else {
				arr[k] = High[j];
				j++;
			}
			k++;
		}
		
		while(i<n1){
			arr[k] = Low[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k] = High[j];
			j++;
			k++;
		}
		
	}
}
