import java.util.*;

public class Driver {
	
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
		
		// This here is:
		// default no-args constructor
		System.out.println("Initial: " + Triangle.getCounter());
		Triangle t = new Triangle(2,3);
		System.out.println(t);
		
		float height = 4.0f;
		t.setHeight(height);
		System.out.println(t);
		System.out.println("number of triangles:" + t.getCounter()); 
		System.out.println("Final: " + Triangle.getCounter());
		
		Triangle[] trs = new Triangle[2];
		trs[0] = new Triangle(2,3);
		trs[1] = new Triangle(3,2);
		System.out.println("Final: " 
				+ Triangle.getCounter());
		Triangle[] y = new Triangle[5];
		int l = trs.length - 1;
		for (int index = 0; index <= l; ++ index)
			y[index] = trs[index];

	ArrayList<Rectangle> recs = new ArrayList<>();
	for (int i = 0; i < 5; ++i){
		Rectangle r = new Rectangle(i+1.0f, 4.0f);
		recs.add(r);
	}

	// lambda expression
	recs.forEach(p -> System.out.println(p.toString()));

	//Shape x = new Shape();
	ArrayList<Object> shapes = new ArrayList<>();
	Triangle tt = new Triangle(2.0f, 3.0f);
	Rectangle rr = new Rectangle(2.0f, 3.0f);
	A a = new A(1);
	shapes.add(tt);
	shapes.add(rr);
	shapes.add(a);
	// we have to make sure that we only call methods that come
	// with Object class
	shapes.forEach(s -> System.out.println(s));

	Triangle bermuda = new Triangle(-1.0f, 2.0f);
	System.out.println(bermuda.getArea());
}

}
