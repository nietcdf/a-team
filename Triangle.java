
public class Triangle extends Shape {
	// create info about a triangle
	private float base;
	private float height;
	// i want my default triangle to have area equal to 1
	private static float INITIAL_BASE = 1;
	private static float INITIAL_HEIGHT = 2;
	private static float counter = 0;
	private static float bad = 0;

	
	public Triangle() throws MyLengthException{
		this(INITIAL_BASE, INITIAL_HEIGHT);

	}
	
	public Triangle(float base, float height) throws MyLengthException {
		try {
		setBase(base);
		setHeight(height);
		counter++;
		}
		catch (MyLengthException e){
			++bad;
			throw new MyLengthException("wow");
		}
		finally{
			System.out.println("This is always executed, we hope");

		}
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
	public void setBase(float base)  throws MyLengthException{
		// I feel at a loss, I cannot resolve it, let whoever called me
		// deal with it
		if (base < 0.0f) {
			throw new MyLengthException("I say hey, you say throw!!!");
		}
			
		this.base = base;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		try{
			if (height < 0.0f)
				throw new MyLengthException("www");

		this.height = height;
		}
		catch(MyLengthException e){
			System.out.println("It was negative, " + 
				"but I will convert it to positive");
            this.height = -height;
		}
	}
	public float getArea() {
		return base * height * 0.5f;

	}

	
	
}
