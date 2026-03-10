

abstract class FulltimeEmployee{//define base identity

    String Name;

    abstract void emplyname();

    FulltimeEmployee(String Name){
        this.Name=Name;
    }
}
interface salary{//define behavior
    void calculatesalary();
}

public class Employee1 extends FulltimeEmployee implements salary{
    double totalsalray;
    Employee1(double totalsalray,String Name){
        super(Name);
        this.totalsalray=totalsalray;
    }
    @Override
    public void calculatesalary() {

        double salary=totalsalray+500;
    }
    public void emplyname(){
        System.out.println("Ali is a software engineer--");
    }                                           //overloading
    public void emplyname(String name){
        System.out.println("Mechanical engineer..." + name);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "totalsalray=" + totalsalray +
                '}';
    }
}