package Lab1Polygon;

public class IsoscelesTriangle implements Polygon{

	int sideA, sideB, sideC, height;
	public IsoscelesTriangle(int base, int sideTwo, int sideThree, int newHeight){
		sideA = base;
		sideB = sideTwo;
		sideC = sideThree;
		height = newHeight;
	}
	
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return sideA + sideB + sideC;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) ((sideA*height)/2);
	}

}
