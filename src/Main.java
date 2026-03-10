import javax.xml.transform.Source;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("Sana","IT","345","03456788","12-12-2001");
        System.out.println(emp);
        Employee1 emp1=new Employee1(345.00,"Ahmad");
        System.out.println(emp1);
        emp.setSalary("4564");
        System.out.println("Update salary :" +  emp.getSalary());
        emp1.calculatesalary();
        emp1.emplyname();
        emp1.emplyname("Raza");
        emp.getDOB();
        emp.setDOB("345");
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob=null;
        boolean vlid=false;
        while (!vlid){
            System.out.println("Enter your date of birth in formate of-" + "year-Month-Day");
            String Db=sc.nextLine();
            try{
                    dob=LocalDate.parse(Db,formt);
                if(dob.isAfter(LocalDate.now())) {
                    System.out.println("Error: DOB cannot be in the future.");
                } else {
                    vlid = true;  // correct input
                }
        } catch(DateTimeParseException e){
                System.out.println("Invalid format");
            }
        }

    }
        /*Employee emp = new Employee(
                "Zimal",                  // name
                "zimal@example.com",      // email
                "Software",               // department
                "2000-01-01",             // dob (yyyy-mm-dd)
                "50000"                   // fee as String
        );
        EmployeeDAO dao = new EmployeeDAO();
        dao.addEmployee(emp);
    }*/
}

    /*int a=10;
    int b=5;
    int sum= a+b;
    System.out.println("sum of a+b ="+ sum);//Arithmetic Operators
    System.out.println(" a > b:=" + (a>b));//Relation Operators(compare 2values)
    boolean c = true;
    boolean d = false;  //logical operation(used with boolean values0
    System.out.println("c && d = "+ (c&&d));
    boolean female= false;
    int age = 25;
    if(age > 18 || female)
    {
        System.out.println(" eligible for driving");
    }
    else{
        System.out.println("Not eligible for driving");
    }
    String dob= "02-12-2002"; //Regular expression(define pattern,manipulate text)
    String regex ="^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-((19|20)\\d{2})$";
    Pattern pat=Pattern.compile(regex);
    Matcher match= pat.matcher(dob);
    if(match.matches()){
        System.out.println("Exact format");
    }
    else{
        System.out.println("Wrong format");
    }*/



