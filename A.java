public class A extends B{
    private int data;

    public A(int i){
        super(i);
        data = i;
    }

    public float getArea() {
        return (0.0f);
    }

    @Override
    public String toString() {
        return "A.data  ->" + this.data 
            + super.toString() + "\n";
    }
}
    

