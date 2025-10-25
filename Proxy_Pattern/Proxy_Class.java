public class  Proxy_Class implements Context {
    
    private Actual_Class actualClass;
    private UserRole userRole;

    public Proxy_Class(int id, String name, String department, Double salary, UserRole role, UserRole userRole){
        this.actualClass = new Actual_Class(id, name, department, salary, role);
        this.userRole = userRole;
    }       

    @Override
    public void getInfo() {
        if(userRole == UserRole.MANAGER || userRole == UserRole.ADMIN || userRole == UserRole.HR){
            actualClass.getInfo();
        } else {
            System.out.println("Access Denied: You do not have permission to view employee information.");
        }   
    }

    @Override
    public void getSlaray() {
        if(userRole == UserRole.ADMIN || userRole == UserRole.HR){
            actualClass.getSlaray();
        } else {
            System.out.println("Access Denied: You do not have permission to view employee salary.");       
        }

    }

    @Override
    public void deleteEmployee() {
        if(userRole == UserRole.ADMIN){
            actualClass.deleteEmployee();
        } else {
            System.out.println("Access Denied: You do not have permission to delete employee records.");       
        }
    }
}
