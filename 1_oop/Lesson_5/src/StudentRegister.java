import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentRegister {
    private int numberofStudents;
    private Student[] students;
    private Student student;

    public StudentRegister(int numberofStudents) {
        this.numberofStudents = numberofStudents;
    }

    public void addStudent(Student student) {
        numberofStudents++;
        students[numberofStudents] = student;
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < numberofStudents; i++) {
            if (students[i].getName().equals(student.getName())) {
                moveStudents(i);
            }
        }
    }
    private void moveStudents(int i) {
            if ((i+1) < numberofStudents) {
                students[i] = students[i+1];
                moveStudents(i+1);
            }
        }

    public Student[] getStudents() {
        while (students)
        return students;
    }

}
