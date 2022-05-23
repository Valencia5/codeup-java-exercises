import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ArraysExercises {
    //create the main to write ur code in.
    public static void main (String [] args){
        //person in the elements inside the array
        //people is the name of the array
        Person[] people = new Person[3]; //Creates an array that can hold three elements
        System.out.println(people);//test the array
        //addin a new person to the people array.
        people[0] = new Person("Moses");//add new instances of it for each name
        people[1] = new Person("Matt");
        people[2] = new Person("Mike");
        //create a for loop to go through all the names
        for (int i = 0; i < people.length; i++){
            System.out.println("The " + i + " name is " + people[i].getName());

            addPerson();
        }


    }
    public static void addPerson(Person [] people){
        for(Person person: people){
            System.out.println(person.getName());
        }
    }


}
