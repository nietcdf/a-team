
public class Triangle {
	// create info about a triangle
	private int base;
	private int height;
	// i want my default triangle to have area equal to 1
	private static int INITIAL_BASE = 1;
	private static int INITIAL_HEIGHT = 2;

	
	public Triangle() {
		this(INITIAL_BASE, INITIAL_HEIGHT);
	}
	
	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Triangle [base=" 
				+ base 
				+ ", height=" 
				+ height 
				+ ", area = " 
				+ this.getArea() + "]";
	}

	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getArea() {
		return base * height / 2;

	}

	
	
}
