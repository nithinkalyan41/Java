import java.util.*;
public class themet {
    public static void main(String[] args) {
            List <Employee> e = new ArrayList<Employee>();
            e.add(new Employee(100,"nithin",21,40000));
            e.add(new Employee(101,"kalyan",21,30000));
            e.add(new Employee(102,"khaja",23,80000));
            e.add(new Employee(103,"hari",25,50000));
        Scanner sc = new Scanner(System.in);

            //e.add(new Employee(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextLong()));


        System.out.println(e);
    }
    
}
//class MYSort implements Comparator<Employee>{
//    public int compare(Employee o1,Employee o2){
//        return (int) (o2.getSalary()-o1.getSalary());
//    }
//}
