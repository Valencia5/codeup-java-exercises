package grades;

//Create a map for students and GitHub usernames
//Create a class named GradesApplication with a main method. Inside the main method, create a HashMap named students.
//It should have keys that are strings that represent github usernames, and values that are Student objects. Create at
//least 4 Student objects with at least 3 grades each, and add them to the map.
//Be creative! Make up GitHub usernames and grades for your student objects.
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Input input = new Input();

        Student bart = new Student("Bart");
        bart.addGrade(50);
        bart.addGrade(40);
        bart.addGrade(30);


        Student homer = new Student("Homer");
        homer.addGrade(67);
        homer.addGrade(66);
        homer.addGrade(54);

        Student lisa = new Student("Lisa");
        lisa.addGrade(100);
        lisa.addGrade(99);
        lisa.addGrade(100);

        Student marge = new Student("Marge");
        marge.addGrade(90);
        marge.addGrade(93);
        marge.addGrade(90);


        students.put("bsimpson", bart);
        students.put("hsimpson", homer);
        students.put("lsimpson", lisa);
        students.put("msimpson", marge);


        System.out.println("Welcome!\n");
        System.out.println("These are the github names for the users:");
        for (String username: students.keySet()){
            System.out.print("|" + username + "| ");
        }

        do {
            System.out.println();
            System.out.println("\n who is the student that you want more information on?");
            String keyTyped = input.getString();

            if (students.containsKey(keyTyped)){
                System.out.printf("Name: %s - GitHub Username: %s \n" + "Current Average: %s \n", students.get(keyTyped).getName(), keyTyped, students.get(keyTyped).getGradeAverage());
            } else {
                System.out.println("Sorry, this is not an active student username " + keyTyped);
            }
        }while (input.yesNo("Is there another student you would like to view?"));

        System.out.println("Goodbye, have an outstanding day!");

    }

}