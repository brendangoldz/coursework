package ArrayPractice;

import java.util.Scanner;

public class ArrayRunner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		ArrayTest array1 = new ArrayTest();
		System.out.println("What would you like to do?"
				+ "\n1. Add Element" + "\n2. Remove Element"
				+ "\n3. Search Array" + "\n4. Sort Array"
				+ "\n5. Get Element" + "\n6. Get Size of Array"
				+ "\n7. Check if Array is Full");
		int option = s.nextInt();
		switch(option){
		case 1:
			System.out.println("\nEnter an integer to add");
			int element = s.nextInt();
			array1.addTo(element);
			array1.toString();
			break;
		case 2:
			System.out.println("\nEnter an integer to remove");
			int element2 = s.nextInt();
			array1.removeTo(element2);
			array1.toString();
			break;
		case 3:
			System.out.println("\nEnter an integer to search");
			int element3 = s.nextInt();
			array1.search(element3);
			array1.toString();
			break;
		case 4:
			array1.sort();	
			array1.toString();
			break;
		case 5:
			System.out.println("\nEnter a position in the array");
			int element4 = s.nextInt();
			array1.getElement(element4);
			array1.toString();
			break;
		case 6:
			array1.getSize();
			break;
		case 7:
			array1.isFull();
			array1.toString();
			break;
		default:
			break;
		}

	}

}
