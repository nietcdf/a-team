public class A extends B{
    private int data;

    public A(int i){
        super(i);
        data = i;
    }

    @Override
    public String toString() {
        return "A.data  ->" + this.data 
            + super.toString() + "\n";
    }
}
    

