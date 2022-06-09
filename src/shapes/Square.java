package shapes;

//public class Square {
//    private int side;
//
//        public Square(int side){
//                super(side);
//                this.side = side;
//
//        }
//        public int getArea(){
//                return side * side;
//        }
//        public int getPerimeter(){
//                return 2 * side + 2 * side;
//        }

//Change your existing Square class to extend Quadrilateral.
//
//Because the length of all sides of a square are the same, the methods for setting the length and the width should
// set both protected properties.

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * width;
    }


    @Override
    public void setLength(int side) {
        this.length = side;
    }

    @Override
    public void setWidth(int side) {
        this.width = side;
    }
}
