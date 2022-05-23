package util;

public class InputTest {
    public static void main(String [] args){
        Input input= new Input(); //Created a new instance of the input class.

        System.out.println("Enter a string of your choice");
        String userInput = input.getString();
        System.out.println(userInput);

        System.out.println("do you like dogs?");
        boolean conformation = input.yesNo();
        System.out.println(conformation);

        System.out.println("What is your favorite number?");
        int userNum = input.getInt();
        System.out.println("your favorite number is " + userNum);


        System.out.println("Enter a number between 1 and 10");
        int userInt = input.getInt(1, 10);
        System.out.println(userInt);

        System.out.println("Pick a decimal number. ");
        double userDou = input.getDouble();
        System.out.println("the decimal number you picked is: " + userDou);

        System.out.println("Enter a decimal point number between 1 and 20.");
        double userDouble = input.getDouble(1,20);
        System.out.println(userDouble);
//
    }

}
