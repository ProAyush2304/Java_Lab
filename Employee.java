interface Gross {
    double hrap = 0.15;
    double dap = 0.10;
    void calcGrossSal();
}
class Employee{
    String ename;
    int eID;
    String designation;
    Employee(String n, int id, String des){
        this.ename=n;
        this.eID=id;
        this.designation=des;
    }
    void displayEmpInfo(){
            System.out.println("Employee ID: " + eID);
            System.out.println("Employee Name: " + ename);
            System.out.println("Employee Designation: " + designation);
    }
}

class Salary extends Employee implements Gross{
    double basicSal;
    Salary(String n, int id, String des, int bsal){
        super(n,id,des);
        this.basicSal=bsal;
    }
    public void calcGrossSal(){
        double hra = basicSal*hrap;
        double da = basicSal*dap;
        double gross = basicSal+hra+da;
        System.out.println("----------SALARY BREAKDOWN----------");
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + gross);
        System.out.println("------------------------------------");

    }
}
class demoEmp{
    public static void main(String[] args){
        Salary e1 = new Salary("Bhumika Sasmal",101,"Project Manager",80000);
        e1.displayEmpInfo();
        e1.calcGrossSal();
    }
}
