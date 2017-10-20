package Lab1Polygon;

public class Pentagon implements Polygon {
	int a;
	public Pentagon(int side){
		a = side;
	}
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 8*a;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) ((1/4)*(Math.sqrt(5*(5+2*Math.sqrt(5))))*(a^2));
	}

}
