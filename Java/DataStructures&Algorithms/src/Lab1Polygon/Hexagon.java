package Lab1Polygon;


public class Hexagon implements Polygon{

	int a;
	public Hexagon(int side){
		a = side;
	}
	
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 6*a;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return (int) ((3*Math.sqrt(3)/2)*(a^2));
	}

}
