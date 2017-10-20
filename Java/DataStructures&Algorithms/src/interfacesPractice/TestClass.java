package interfacesPractice;

public class TestClass {

	public static void main(String[] args) {
		Triangle oneTri = new Triangle(10,12,10);
		Triangle twoTri = new Triangle(10,15);
		System.out.println("AREA OF oneTri 3D: " + oneTri.area() 
				+ "\nVOLUME OF oneTri 3D: " + oneTri.volume());
		System.out.println("AREA OF oneTri 2D: " + twoTri.area() 
				+ "\nVOLUME OF oneTri 2D: " + twoTri.volume());
	}

}
