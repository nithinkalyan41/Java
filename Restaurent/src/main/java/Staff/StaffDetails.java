package Staff;

import java.sql.Timestamp;

public class StaffDetails {
             private int id;
            private  String name;
            private  String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String gender;
            private String address;
            private String email;
            private String password;
            private String salary;
            private String designation;
            private Timestamp dateofjoining;

    public StaffDetails(String name, String age, String gender, String address, String email, String password, String salary, String designation, Timestamp dateofjoining) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.password = password;
        this.salary = salary;
        this.designation = designation;
        this.dateofjoining = dateofjoining;
    }
    public StaffDetails(){

    }



    public StaffDetails(String name, String age, String gender, String address, String email, String password, String phone, String salary, String designation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.password = password;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Timestamp getDateofjoining() {
        return dateofjoining;
    }

    public void setDateofjoining(Timestamp dateofjoining) {
        this.dateofjoining = dateofjoining;
    }

}
