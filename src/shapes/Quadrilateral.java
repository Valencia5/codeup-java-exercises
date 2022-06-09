package shapes;
//Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable.
// This class should have:
//protected properties for length and width.
// a constructor that accepts two numbers for the length and width and sets those properties.
// methods for getting the length and width.
//abstract methods for setting the length and width.
//public abstract class Quadrilateral extends Shape implements Measurable {
//    protected double length;
//    protected double width;
//
//
//    // this is thr constructor
//    public Quadrilateral(double length, double width){
//        this.length = length;
//        this.width = width;
//
//    }
//
//    // these are the getters
//    public double getLength(){
//        return this.length;
//    }
//    public double getWidth(){
//        return this.width;
//    }
//
//    //and these are the setters
//    public abstract void setLength(double length);
//
//    public abstract void setWidth(double width);

//    public abstract void setLength(double length);
//
//    public abstract void setWidth(double width);
//
abstract class Quadrilateral extends Shape implements Measurable {

    protected int length;
    protected int width;


    public Quadrilateral(int shapeLength, int shapeWidth) {
        this.length = shapeLength;
        this.width = shapeWidth;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);

    public abstract void setWidth(int width);
}