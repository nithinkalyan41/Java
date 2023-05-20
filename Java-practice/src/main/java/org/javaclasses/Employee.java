package org.javaclasses;

public class Employee {
    private  int empId;
    private String name;
    private Double salary;
    public Employee(int id,String name,Double salary){
        this.empId=id;
        this.name=name;
        this.salary=salary;
    }

    public int getEmpId() {
        return empId;
    }



    public String getName() {
        return name;
    }



    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
