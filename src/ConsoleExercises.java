
import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        double pi = 3.14159;
        System.out.println(pi);
        System.out.format("The value of pi is approximately %.2f", pi);
        //Above, we can use format to make  string with %s and a second argument.
        //We can cut the amount of decimal places with 2f in the pi variable to two decimal places

//        Scanner scanner = new Scanner(System.in);
//        //this is how we create the scanner and give it a name
//        System.out.println("\nPlease enter the integer here.");
//        //\n will allow us to create a new line the JAVA readout.
//        int userInput = scanner.nextInt();
//        //we are assigning want user input into the specific scanner that we want to use.

//        Scanner scannerOne = new Scanner(System.in);
//        System.out.println("\n please enter first word");
//        String inputNumberOne = scannerOne.next();
//
//
//        Scanner scannerTwo = new Scanner(System.in);
//        System.out.println("\n please enter second word");
//        String inputNumberTwo = scannerTwo.next();
//
//        Scanner scannerThree = new Scanner(System.in);
//        System.out.println("\n please enter third word");
//        String inputNumberThree = scannerThree.next();
//        System.out.printf("\nThe three user input words are %s, %s, %s.", inputNumberOne, inputNumberTwo, inputNumberThree);

        Scanner saveInVariable = new Scanner(System.in);
        System.out.println("\nPlease enter the information");
//        String userInformation = saveInVariable.next();
        String userInformation= saveInVariable.nextLine();
        System.out.println(userInformation);

        Scanner length = new Scanner (System.in);
        String howLong = length.nextLine();
        Integer result1  = Integer.parseInt(howLong);
        //how we turn a string input from the user to an Int

        Scanner width = new Scanner (System.in);
        String howWide = length.nextLine();
        Integer result2  = Integer.parseInt(howWide);

        System.out.println("the perimeter is " + result1 + result2);







        Scanner Width = new Scanner (System.in);





    }

}
