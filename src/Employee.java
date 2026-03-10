/*variabales->container store data
java static->type of every variable must be declared
operators perfom opertaion on variable andv value,Expression return type of value
 */
public class Employee {
    public String Name;
    public String Department;
    private String Salary;//encapsulation
    public String Mobilenum;
    protected String DOB;

    public Employee(String Name, String Department, String Salary, String Mobilenum, String DOB) {
        this.Name = Name;
        this.Department = Department;
        this.Salary = Salary;
        this.Mobilenum = Mobilenum;
        this.DOB = DOB;
    }

    public String getSalary() {//read data
        return Salary;
    }

    public void setSalary(String salary) {
        this.Salary = salary;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String Dob) {
        this.DOB = Dob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", Salary='" + Salary + '\'' +
                ", Mobilenum='" + Mobilenum + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }
}

