public class Employee {
    private int empid;
    private String name;
    private int age;
    private long salary;
    public  Employee(int empid,String name,int age,long salary){

        this.empid=empid;
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ']';
    }
}
