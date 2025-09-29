import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    System.out.println("Hello and welcome!");

    Car myCar = new Car(2916, "Volvo", "C70" );
    myCar.brand = "Yellow";
    myCar.year = 2024;

    String studentName = "Sara";
    int studentAge = 19;
    char studentGrade = 'B';

    Student student = new Student(studentAge, studentName, studentGrade);
    StudentRegister students = new StudentRegister(10);
    students.addStudent(student);
    System.out.println(students.getStudents().toString());

    }





}