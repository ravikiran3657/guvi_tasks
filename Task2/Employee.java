package Task2;

public class Employee extends PersonT2 {
     private int employeeID;
     private double salary;


    public Employee(String name, int age,int employeeID,double salary) {
        super(name, age);
        this.employeeID=employeeID;
        this.salary=salary;

    }
    public void displayEmpInformation(){
        super.displayPersonInformation();
        System.out.println("EmployeeID:" + employeeID+ ",Emp Salary" + salary);
    }
}
