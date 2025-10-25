public class Client {
    public static void main(String[] args) {
        // Creating a proxy instance with different user roles
        Context employeeProxy = new Proxy_Class(1, "John Doe", "Engineering", 75000.0, UserRole.EMPLOYEE, UserRole.EMPLOYEE);
        Context managerProxy = new Proxy_Class(2, "Jane Smith", "Marketing", 85000.0, UserRole.MANAGER, UserRole.MANAGER);
        Context adminProxy = new    Proxy_Class(3, "Alice Johnson", "HR", 95000.0, UserRole.ADMIN, UserRole.ADMIN);     

        System.out.println("=== Employee Access ===");
        employeeProxy.getInfo();
        employeeProxy.getSlaray();
        employeeProxy.deleteEmployee(); 
        System.out.println("\n=== Manager Access ===");
        managerProxy.getInfo();
        managerProxy.getSlaray();
        managerProxy.deleteEmployee(); 
        System.out.println("\n=== Admin Access ===");
        adminProxy.getInfo();
        adminProxy.getSlaray();
        adminProxy.deleteEmployee();    
    }
}

// Enum for user roles
enum UserRole {
    EMPLOYEE, MANAGER, ADMIN, HR
}

// Enum for access types
enum AccessType {
    CREATE, DELETE, UPDATE, VIEW_ALL_DETAILS, VIEW_BASIC_INFO
}