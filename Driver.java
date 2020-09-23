
public class Driver {
	private int RJ;
	Triangle boo;
	public static void triangle(int base, int height, int area) {
		System.out.println("Base: " + base);
		System.out.println("Height: " + height);
		System.out.println("Area: " + area);
	}
	
	public static int getNumberOfElements(Triangle[] a) {
		int n = 0;
		int lastIndex = a.length - 1;
		for(int i = 0; i < lastIndex; ++i) {
			if (a[i] != null )
				++n;
		}
		return n;
	}
	
	

	public static void main(String[] args) {


		Driver d = new Driver();

		
		
		// This here is:
		// default no-args constructor
		System.out.println("Initial: " + Triangle.getCounter());
		Triangle t = new Triangle(2,3);
		System.out.println(t);
		
		int height = 4;
		t.setHeight(height);
		System.out.println(t);
		System.out.println("number of triangles:" + t.getCounter()); 
		System.out.println("Final: " + Triangle.getCounter());
		int rj = 0 ; 
		int NUM_ELEMENTS = 5;
		int[] xs = new int[NUM_ELEMENTS];
		int i = 0;
		int j = ++i;
		int k = i++;
		for (int ii = 0; ii < NUM_ELEMENTS-2; ii++) {
			xs[ii] = Math.PI;
		}
		
		
		
		Triangle[] trs = new Triangle[2];
		trs[0] = new Triangle(2,3);
		trs[1] = new Triangle(3,2);
		System.out.println("Final: " 
				+ Triangle.getCounter());
		Triangle[] y = new Triangle[5];
		int l = trs.length - 1;
		for (int index = 0; index <= l; ++ index)
			y[index] = trs[index];


		int numElements = d.getNumberOfElements(y);
		System.out.println(numElements);

		d.getNumberOfElements(trs);

	}

}
