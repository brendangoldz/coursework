package Lab1Polygon;

public class Quadrilateral implements Polygon {
	int l1, w1, l2, w2;
	public Quadrilateral(int length1, int width1, int length2, int width2){
		l1 = length1;
		w1 = width1;
		l2 = length2;
		w2 = width2;
	}
	
	@Override
	public int perimeter() {
		// TODO Auto-generated method stub
		return l1+w1+l2+w2;
	}

	@Override
	public int area() {
		// TODO Auto-generated method stub
		return l1*w2;
	}

}
