public class Rectangle extends Shape{
    private float width;
    private float height;

    public Rectangle(){
        this(0.0f, 0.0f);
    }

    // to do this? YES
    public Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }


    public float getArea() {
        area =  width * height;
        return area;
    }



    
}
