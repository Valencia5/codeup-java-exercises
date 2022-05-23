package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    //constructor for get string
    public String getString(){
        return scanner.nextLine();
    }
    //Method for get string
    public String getString(String prompt) {
        System.out.println(prompt);
        return this.scanner.nextLine();
    }
    //constructor for yesNo
    public boolean yesNo( ){
        //putting user input into a variable
        String userInput = this.scanner.next();
        //does the variable of UserInput = "y" or does it = "yes"
        return userInput.equalsIgnoreCase("y")|| userInput.equalsIgnoreCase("yes");
    }
    //method for yesNo
    public boolean yesNo(String prompt){//prompt is just a parameter
        System.out.println(prompt); //print out the prompt
        return yesNo();//return weather the variable of UserInput = "y" or does it = "yes"
    }

    //constructor for getInt
    public int getInt(){
        try{
            return Integer.valueOf(getString());
        }catch (Exception e){
            System.out.println("please enter integer");
            return getInt();
        }

    }
    public int getInts(){
        try{
            return Integer.valueOf(getString());
        } catch (Exception e){
            System.out.println("Please enter an integer.");
            return getInt();
        }
    }

    public int getInt(int min, int max){
        int userNumber;
        userNumber = this.scanner.nextInt();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            System.out.println("That is not in the range. Enter a new number between" + min + " and " + max);
            return getInt(min, max);
        }

    }
    public double getDouble(){
        try{
            scanner.nextLine(); //clear out the scanner from last time it used nextInt?
            return Double.valueOf(getString());
        } catch(Exception e){
            System.out.println("Please enter a decimal(double) number.");
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        double userNumber;
        userNumber = this.scanner.nextDouble();
        if(userNumber <= max && userNumber >= min){
            return userNumber;
        } else {
            System.out.println("That is not in the range. Enter a new number between" + min + " and " + max);
            return getDouble(min, max);
        }
    }

}