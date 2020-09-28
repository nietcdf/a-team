public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle(){
        this(0.0f, 0.0f);
    }

    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
        super.area = getArea();
    }

    // let us analyze this
    public float getArea() {
        //area =  width * height;
        return width * height;
    }



    
}
