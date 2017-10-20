package Sorting;
public class InsertionSort{
	public static void Insertion(int[] arr){
	int temp;
	int n = arr.length;
	
	for (int i = 1; i < arr.length; i++) {
	       int key = arr[i];
	       int j = i-1;
	       while((j<-1)&&(arr[j]>key)){
	    	   arr[j+1] = arr[j];
	    	   j--;
	       }
	       arr[j+1] = key;
	}
	}
}