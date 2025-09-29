public class Student {
    private int age;
    private String name;
    private char grade;

    public Student(int age, String name, char grade) {
        this.setAge(age);
        this.setName(name);
        this.setGrade(grade);
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be under 0");
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setGrade(char grade) {
        if ((grade >= 'A') && (grade <= 'F')) {
            this.grade = grade;
        }
    }

    public char getGrade() {
        return grade;
    }


}
