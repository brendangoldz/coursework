package Lab1Polygon;

public class EquilateralTriangle implements Polygon{
	int a;
	public EquilateralTriangle(int side){
		a = side;
	}
	
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 3*a;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		 return (int) ((Math.sqrt(3)/4)*(a^2));
	}
	

}
