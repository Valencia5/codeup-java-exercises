package shapes;

//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle(){};
//
//    public Rectangle(int length){
//        this.length = length;
//
//    }
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return length * width;
//
//    }
//    public int getPerimeter() {
//        return 2 * length + 2 * width;
//
//    }
//}

//Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable.
//IntelliJ can automatically create the skeleton of all the methods that need to be implemented.
public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int shapeLength, int shapeWidth) {
        super(shapeLength, shapeWidth);
    }

    @Override
    public double getPerimeter() {
        return ((length * 2) + (width * 2));
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}