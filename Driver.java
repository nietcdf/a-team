
public class Driver {
	public static void triangle(int base, int height, int area) {
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);
	}

	public static void main(String[] args) {
		int x = 5;
		System.out.println("Fixin' to go to the PL");

		// create info about a triangle
		int base = 1;
		int height = 2;
		int area = base * height / 2;
		
		triangle(base, height, area);
		
		// This here is:
		// default no-args constructor
		Triangle t = new Triangle();
		t.setBase(base);
		t.setHeight(height);
		int myArea = t.getArea();
		triangle(base, height, myArea);
		t.setHeight(4);
		triangle(base, height, myArea);

		

	}

}
