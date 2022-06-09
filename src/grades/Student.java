package grades;
//Create a Student class
//Create a class named Student. It should have private properties for the student's name, and grades. The grades
// property should be an ArrayList of integers. The student class should have a constructor that sets name property,
// and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer>  grades = new ArrayList<>();

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;

    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        double total = 0;
        for(double grade: grades) {
            total += grade;
        }
        return total/grades.size();
    }


    public static void main(String[] args) {
        Student student1 = new Student("Bill");
        Student student2 = new Student("Ted");

        student1.addGrade(75);
        student1.addGrade(75);
        student1.addGrade(80);
        student1.addGrade(100);

        student2.addGrade(90);
        student2.addGrade(90);
        student2.addGrade(100);
        student2.addGrade(100);

        System.out.println(student1.name + "'s Grade average is: " + student1.getGradeAverage());
        System.out.println(student2.name + "'s Grade average is: " + student2.getGradeAverage());

    }

}
