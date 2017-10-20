package Lab1Polygon;

public class Square implements Polygon {
	int a;
	public Square(int side){
		a = side;
	}
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 4*a;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return a^2;
	}

}
