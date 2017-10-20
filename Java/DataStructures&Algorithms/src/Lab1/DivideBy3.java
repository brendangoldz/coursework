package Lab1;

public class DivideBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1; i<501; i++){
			if(i%3==0){
				System.out.println(i + " is divisible by 3");
				count++;
			}
			else{
				System.out.println("-");
			}
		}
		System.out.println("\nThere are " + count + " elements, from 1-500, divisible by 3");

	}

}
