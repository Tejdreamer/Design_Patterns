import java.util.List;


public abstract class Builder{
     String name;
     int age;
     String major;
     double gpa;
     List<String> subjects;

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }

    public Builder setMajor(String major){
        this.major = major;
        return this;
    }

    public Builder setGpa(double gpa){
        this.gpa = gpa;
        return this;
    }

     public Student build(){
        return new Student(this);
      }

      abstract public Builder setSubjects();
}