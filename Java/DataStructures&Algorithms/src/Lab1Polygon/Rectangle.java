package Lab1Polygon;

public class Rectangle implements Polygon {
	int l, w;
	public Rectangle(int length, int width){
		l = length;
		w = width;
	}
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return 2*l+2*w;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return l*w;
	}

}
