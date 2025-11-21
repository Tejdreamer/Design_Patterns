import java.util.List;

public class Student{
     String name;
     int age;
     String major;
     double gpa;
     List<String> subjects;

    public Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.major = builder.major;
        this.gpa = builder.gpa;
        this.subjects = builder.subjects;
    }


   public String toString(){
       return "Name: " + name + ", Age: " + age + ", Major: " + major + ", GPA: " + gpa + ", Subjects: " + subjects;
   }
}