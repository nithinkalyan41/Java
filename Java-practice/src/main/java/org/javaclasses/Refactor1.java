package org.javaclasses;

public class Refactor1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(max(a,b));
        System.out.println(max1(a,b));
        Employee employee = new Employee(1,"nithin",300000.00);
        Employee employee1 = new Employee(2,"krishna",400000.00);
        Employee employee2 =  new Employee(3,"shaik",500000.00);
        Employee employee3 = new Employee(4,"chosen",600000.00);


        System.out.println(getMonthlySalary(employee));

    }
    static boolean max(int a,int b){
        return a>b;
    }
    static boolean max1(int a,int b){
        if(a>b){
            return true;
        }
        else if(a==b){
            return false;
        }
        else{
            return false;
        }
    }
    static  double getMonthlySalary(Employee emp){
        return  emp.getSalary()/12;
    }

}
