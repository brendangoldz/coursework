package Recursion;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] reverse(int[] arr, int start, int last){
		last = arr.length-1;
		if(arr.length<=1){
			return arr;
		}
		else{
			for(int i = start; i<=last;i++){
				if(arr[i]%2!=0){
					int temp = arr[i];
					arr[i] = last;
					last = temp;
					System.out.println(arr.toString());
					return reverse(arr, i, last-1);
				}			
			}
			return reverse(arr, last, last);
		}
	}

}
