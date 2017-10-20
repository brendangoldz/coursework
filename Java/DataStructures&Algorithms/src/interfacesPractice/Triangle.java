package interfacesPractice;

public class Triangle implements Shape {
	int base, height, length;
	public Triangle(int bbase, int hheight){
		base = bbase;
		height = hheight;
		
	}
	public Triangle(int bbase, int hheight, int llength){
		base = bbase;
		height = hheight;
		length = llength;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return ((base*height)/2);
	}

	@Override
	public double volume() {
		if(length==0){
			return 0;	
		}
		else{
			return ((base*height*length)/2);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
