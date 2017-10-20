package Lab1Polygon;

public class Octagon implements Polygon {
	int a;
	public Octagon(int side){
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
		return (int) (2*(1+Math.sqrt(2))*(a^2));
	}

}
