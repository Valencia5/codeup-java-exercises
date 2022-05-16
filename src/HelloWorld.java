public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello");
        System.out.println("World!");

        int myFavoriteNumber = 55;
        System.out.println(myFavoriteNumber);

        double myString = 3.14159;
        System.out.println(myString);
        //in order to change data types of the variable, we must also change the
        //assined type of data (Double).
//
//        long myNumber;
        //nothing happens until the variable is assigned a value
//
//        myNumber = 3.14;
        //cannot make a whole number data type (long) into a decimal.
//
//        myNumber = 123L;
//        System.out.println(myNumber);
        //when we have a letter mixed with numbers in a variable with a number
        // data type assigned, then only the numbers get passed.

//        myNumber= 123;
//        System.out.println(myNumber);

        float myNub = 3.14f;
        System.out.println(myNub);
        //in order to assign a float variable, we have to add f on the end or turn it into a double.

////        int x = 5;
//        System.out.println(x++); // this line will cause a +1 after in gets ran
//        System.out.println(x); // we can see that on thi this line that it will be 6 and not 5.

//        int x = 5;
//        System.out.println(++x); // this will add the iteration before the variable is called.
//        System.out.println(x);

//        String Class= "testing";
//        System.out.println(Class);
        //it let me create a variable using a restricted word but threw error.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //will not allow me to run i believe that it is attempting to assign the
        //data type of a integer to a non-integer.

//        int x = 4;
//        System.out.println(x+=5);

//        int x = 3;
//        int y = 4;
//        x *= y;
//        System.out.println(x *= y);

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;

//        y-=x;
//        System.out.println(x/=y);
        System.out.println(x-=y);
        //after each equasion, the value of x is changed.

//        int bigNumber = 99999999999;
//        System.out.println( bigNumber); // return: java: integer number too large

        byte littleNum = 125;
        System.out.println(++littleNum);
        System.out.println(++littleNum);
        System.out.println(++littleNum); //went from 127 to -128
        //when the iteration is going to go [ast the rage of values the type can hold, it jumps to the other end of the range.












    }
}

