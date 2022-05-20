import java.util.Scanner;

public class MethodsExercises {

    public static int add (int x, int y){
        return x + y;
    }

    public static int sub (int a, int b){
        return a - b;
    }

    public static int multi(int i, int j){
        return i * j;
    }
    public static int div (int m, int n){
        return m / n;
    }
    public static int mod(int num1, int num2) {
        return num1 % num2;
    }
    public static int getInteger(int min, int max){
        //prompt the user to enter a number
        System.out.print("Enter a number between 1 & 20");
        //initiate scanner, take the input
        Scanner scanner = new Scanner(System.in);
        //save the input into a variable and the nextInt() scans the token and reads it as an integer.
        int userNumber = scanner.nextInt();

        if (userNumber >= min && userNumber <= max){
            System.out.println("This is the user number: " + userNumber + " and it is between 1 & 20.");
            return userNumber;
        }else{
            System.out.printf("Please choose a number between: ", min, max);
            return getInteger(min,max);
        }

        //    Calculate the factorial of a number.
//        public static int factorial() {
//            Scanner scanner = new Scanner(System.in);
//            String toContinue;
//            int userInt;
//            int factorial = 1;
//            String middle = "1";
//
//            do {
//                userInt = getInteger(1, 10);
//
//                for (int i = 1; i <= userInt; i++) {
//                    if (i > 1) {
//                        middle += " x " + i;
//                    }
//                    factorial *= i; // multiply by iterator
//                    System.out.printf("%s! = %-40s = %s%n", i, middle, factorial);
//                    //pos ut space before and neg put space after
//                }
//                System.out.println("Would you like to enter another number to add to factorial? (Yes/No)");
//                toContinue = scanner.nextLine();
//            } while (toContinue.equalsIgnoreCase("Yes"));
//            return factorial;
//        }


//        public static int dice() {
//            Scanner sc = new Scanner(System.in);
//            String toContinue;
//            do {
//                System.out.println("How many sides would you like the dice to have: ");
//                int diceSide = sc.nextInt();
//                System.out.println("Roll the dice.");
//                int roll1= (int) (Math.random() * diceSide + 1);
//                int roll2 = (int) (Math.random() * diceSide + 1);
//                System.out.printf("You just rolled %d and %d!\n", roll1, roll2);
//                System.out.print("Would you like to roll the dice again?(Yes/No) ");
//                toContinue = sc.next();
//            } while (toContinue.equalsIgnoreCase("Yes"));
//            return dice();
//        }
    }


    public static void main(String[] args) {
        System.out.println(add(5,5));
        System.out.println(sub(10, 4));
        System.out.println(multi(10,5));
        System.out.println(div(20, 5));
        System.out.println(mod(10,5));
        System.out.println(getInteger(1, 20));
    }
}
