import java.util.ArrayList;
import java.util.List;

public class Car <T>{
    public T Name;
    private T tyre;
    Car(T Name,T tyre){
        this.Name=Name;
        this.tyre=tyre;
    }
    public T getName(){
        return Name;
    }

    public T getTyre() {
        return tyre;
    }

    public void setTyre(T tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Name=" + Name +
                ", tyre=" + tyre +
                '}';
    }
}
                //bounded wildcard
public class Car <T>{

    public static void printdata(List<?extends Number> list){
        for(Number n : list){
            System.out.println(n);
        }
    }
    public static void adddata(List<? super Integer>list){
        list.add(20);
        System.out.println("add num of :"+ list);
    }
}
