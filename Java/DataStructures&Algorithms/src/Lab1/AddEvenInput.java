package Lab1;
import java.util.*;

public class AddEvenInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Please enter an even number to add: ");
		int scan = s.nextInt();
		
		while(scan!=0){
			if((scan)%2==0){
				total += scan;
				System.out.println("Please enter an even number to add: ");
				scan = s.nextInt();
			}
			else {
				System.out.println("Please enter an even number to add: ");
				scan = s.nextInt();
			}
		}
		System.out.println("Total sum of even numbers: " + total);
	}

}
