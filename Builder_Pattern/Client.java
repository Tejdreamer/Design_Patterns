public class Client{
    public static void main(String Args[]){
        StudentDirector MBAdirector = new StudentDirector(new MBABuilder());
        StudentDirector Enggdirector = new StudentDirector(new EngineerBuilder());
        
        Student mbaStudent = MBAdirector.createStudent();
        Student enggStudent = Enggdirector.createStudent();

        System.out.println("MBA Student Details: " + mbaStudent.toString());
        System.out.println("Engineering Student Details: " + enggStudent.toString());

    }
}