public abstract class Shape {
    private float area;
    public Shape(){
        area = 0.0f;

    }

    public abstract float getArea();

    @Override
    public String toString() {
        return "Area is " + area;
    }
    
}
