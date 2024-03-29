package Staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffOperations {
    private Connection conn;
    public StaffOperations(Connection conn){
        this.conn=conn;
    }
    //Insert Into the Database
    public boolean SaveStaff(StaffDetails staff)  {
        boolean b = false;
        try {
            String q = "insert into staff(name,age,gender,address,email,password,salary,designation) values(?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = this.conn.prepareStatement(q);
            pstmt.setString(1, staff.getName());
            pstmt.setString(2, staff.getAge());
            pstmt.setString(3, staff.getGender());
            pstmt.setString(4, staff.getAddress());
            pstmt.setString(5, staff.getEmail());
            pstmt.setString(6, staff.getPassword());
            pstmt.setString(7, staff.getSalary());
            pstmt.setString(8, staff.getDesignation());
            pstmt.executeUpdate();
            b = true;
            return b;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public StaffDetails getStaffDetailsByEmailAndPassword(String email,String password) throws SQLException {
        String q = "select * from staff where email=? && password=?";
        StaffDetails staff = null;
        PreparedStatement pstmt = conn.prepareStatement(q);
        pstmt.setString(1,email);
        pstmt.setString(2,password);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
            staff = new StaffDetails();
            staff.setId(rs.getInt("id"));
            staff.setName(rs.getString("name"));
            staff.setAge(rs.getString("age"));
            staff.setGender(rs.getString("gender"));
            staff.setAddress(rs.getString("address"));
            staff.setEmail(rs.getString("email"));
            staff.setPassword(rs.getString("password"));
            staff.setSalary(rs.getString("salary"));
            staff.setDesignation(rs.getString("designation"));
        }
        return staff;
    }
}
