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
  public static void main (String[] args){
//      Person person1 = new Person("John");
//      Person person2 = new Person("John");
//      System.out.println(person1.getName().equals(person2.getName()));//true
//      System.out.println(person1 == person2);//false

//      Person person1 = new Person("John");
//      Person person2 = person1;
//      System.out.println(person1 == person2);// because person1 = person2 above.

//      Person person1 = new Person("John");
//      Person person2 = person1;
//      System.out.println(person1.getName());
//      System.out.println(person2.getName());
//      person2.setName("Jane");//here person2 is no longer = to person1
//      System.out.println(person1.getName());
//      System.out.println(person2.getName());

  }

}
