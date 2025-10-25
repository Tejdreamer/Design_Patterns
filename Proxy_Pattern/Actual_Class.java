
public class  Actual_Class implements Context{
    
    int id;
  String name;
 String department;
  Double salary;
 UserRole role;
    
     Actual_Class(int id, String name, String department, Double salary, UserRole role){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.role = role;
    }

    @Override
    public void getInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Department: " + department);  }

    @Override
    public void getSlaray() {
        System.out.println("Employee Salary: " + salary);   }

    @Override
    public void deleteEmployee() {
        System.out.println("Employee " + name + " deleted from the system.");   
    }

}



