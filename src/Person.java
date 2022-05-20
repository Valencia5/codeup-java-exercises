//create class of person
public class Person {
        //create an instance variable of Name
        public String name;
    //create a constructor for the person class.
    public Person (String personsName){
        name = personsName;
    }
//this is an example of a GETTER!!!
    public String getName(){
        return this.name;
    }
//This is an example of a SETTER!!!
public void setName(String newName){
this.name= newName;
}
public void sayHello(){
    System.out.println("Hello, " + this.name);
    }


}
