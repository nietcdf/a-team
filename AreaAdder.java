
public class AreaAdder {
	public static int addArea(Triangle t1, Triangle t2) {
		return t1.getArea() + t2.getArea();
	}
	
	// example of bad overloading, add 3 triangles
	public static int addArea(Triangle t1, Triangle t2, Triangle t3) {
		int a1 = addArea(t1, t2);
		return a1 + t1.getArea() + t2.getArea();
	}
}
