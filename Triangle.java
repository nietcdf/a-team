
public class Triangle extends Shape {
	// create info about a triangle
	private float base;
	private float height;
	// i want my default triangle to have area equal to 1
	private static float INITIAL_BASE = 1;
	private static float INITIAL_HEIGHT = 2;
	private static float counter = 0;

	
	public Triangle() {
		this(INITIAL_BASE, INITIAL_HEIGHT);

	}
	
	public Triangle(float base, float height) {
		this.base = base;
		this.height = height;
		counter++;
	}
	
	public static float getCounter() {
		return counter;
	}



	@Override
	public String toString() {
		return "Triangle [base=" 
				+ base 
				+ ", height=" 
				+ height 
				+ ", area = " 
				+ this.getArea() 
				+ Triangle.getCounter() + "]";
	}

	public float getBase() {
		return base;
	}
	public void setBase(float base) {
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getArea() {
		return base * height * 0.5f;

	}

	
	
}
