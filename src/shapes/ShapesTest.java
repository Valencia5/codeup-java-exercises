package shapes;
//Modify your ShapesTest class, use it to:
//
//declare a variable of the type Measurable named myShape.
//Test your code by creating instances of both Square and Rectangle and assigning them to myShape
// so you can display the shape's area and perimeter.

//public class ShapesTest {
//    public class shapesTest {
//        public void main(String[] args) {
//            Measurable myShape = new Square(9);
//            Measurable myShape2 = new Rectangle(2, 5);
//
//            //Square:
//            System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
//            System.out.println("myShape.getArea() = " + myShape.getArea());
//
//            //Rectangle:
//            System.out.println("myShape2.getPerimeter() = " + myShape2.getPerimeter());
//            System.out.println("myShape2.getArea() = " + myShape2.getArea());
//
//
//        }
public class ShapesTest {


    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 8);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

    }


}


