package Lab1Polygon;

public class Triangle implements Polygon
{
	int sideA, sideB, sideC, height;
	public Triangle(int base, int sideTwo, int sideThree, int newHeight){
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

	public int area() {
		// TODO Auto-generated method stub
		return (int) ((sideA*height)/2);
	}


}
