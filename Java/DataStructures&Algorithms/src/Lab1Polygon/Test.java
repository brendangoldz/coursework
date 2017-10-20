package Lab1Polygon;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		do{
			int input = menu();
		switch(input){
		case 1:
			System.out.println("*TRIANGLE*" + "\nPlease enter your base length:");
			int base = s.nextInt();
			System.out.println("Please enter length of next side: ");
			int sideB = s.nextInt();
			System.out.println("Please enter length of last side: ");
			int sideC = s.nextInt();
			System.out.println("Please enter a height: ");
			int height = s.nextInt();
			Polygon tri = new Triangle(base, sideB, sideC, height);
			System.out.println("Your triangle's area: " + tri.area());
			System.out.println("Your triangle's perimeter: " + tri.perimeter());
			break;
		case 2:
			System.out.println("*EQUILATERAL TRIANGLE*" + "\nPlease enter the length of a side:");
			int side = s.nextInt();
			Polygon eqTri = new EquilateralTriangle(side);
			System.out.println("Your triangle's area: " + eqTri.area());
			System.out.println("Your triangle's perimeter: " + eqTri.perimeter());
			break;
		case 3:
			System.out.println("*ISOSCELES TRIANGLE*" + "\nPlease enter your base length:");
			int isBase = s.nextInt();
			System.out.println("Please enter length of next side: ");
			int isSideB = s.nextInt();
			System.out.println("Please enter length of last side: ");
			int isSideC = s.nextInt();
			System.out.println("Please enter a height: ");
			int isHeight = s.nextInt();
			Polygon isTri = new IsoscelesTriangle(isBase, isSideB, isSideC, isHeight);
			System.out.println("Your triangle's area: " + isTri.area());
			System.out.println("Your triangle's perimeter: " + isTri.perimeter());
			break;
		case 4:
			System.out.println("*SQUARE*" + "\nPlease enter the length of a side:");
			int sqSide = s.nextInt();
			Polygon square = new Square(sqSide);
			System.out.println("Your triangle's area: " + square.area());
			System.out.println("Your triangle's perimeter: " + square.perimeter());
			break;
		case 5:
			System.out.println("*RECTANGLE*" + "\nPlease enter the length of a side:");
			int rectL = s.nextInt();
			System.out.println("Please enter width of rectangle: ");
			int rectW = s.nextInt();
			Polygon rectangle = new Rectangle(rectL, rectW);
			System.out.println("Your triangle's area: " + rectangle.area());
			System.out.println("Your triangle's perimeter: " + rectangle.perimeter());
			break;
		case 6:
			System.out.println("*QUADRILATERAL*" + "\nPlease enter first length:");
			int l1 = s.nextInt();
			System.out.println("Please enter length of next side: ");
			int l2 = s.nextInt();
			System.out.println("Please enter first width: ");
			int w1= s.nextInt();
			System.out.println("Please enter second width: ");
			int w2 = s.nextInt();
			Polygon quad = new Quadrilateral(l1, l2, w1, w2);
			System.out.println("Your triangle's area: " + quad.area());
			System.out.println("Your triangle's perimeter: " + quad.perimeter());
			break;
		case 7:
			System.out.println("*PENTAGON*" + "\nPlease enter the length of a side:");
			int a = s.nextInt();
			Polygon pentagon = new Pentagon(a);
			System.out.println("Your triangle's area: " + pentagon.area());
			System.out.println("Your triangle's perimeter: " + pentagon.perimeter());
			break;
		case 8:
			System.out.println("*HEXAGON*" + "\nPlease enter the length of a side:");
			int hex = s.nextInt();
			Polygon hexagon = new Hexagon(hex);
			System.out.println("Your triangle's area: " + hexagon.area());
			System.out.println("Your triangle's perimeter: " + hexagon.perimeter());
			break;
		case 9:
			System.out.println("*OCTAGON*" + "\nPlease enter the length of a side:");
			int oct = s.nextInt();
			Polygon octagon = new Square(oct);
			System.out.println("Your triangle's area: " + octagon.area());
			System.out.println("Your triangle's perimeter: " + octagon.perimeter());
			break;
		default:
			break;
		}
		}while(menu()!=0);
	}
	public static int menu(){
		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease select an option below:" 
				+ "\n1. Triangle \n2. Equilateral Triangle \n3. Isosceles Triangle "
				+ "\n4. Square \n5. Rectangle \n6. Quarilateral \n7. Pentagon" 
				+ "\n8. Hexagon \n9. Octagon \n 0. EXIT");
		int input = sc.nextInt();
		return input;
	}
}
