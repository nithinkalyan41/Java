package Dao;

import com.example.modules.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private Connection con;
    private String q;
    private PreparedStatement pstmt;
    private ResultSet rs;
    public UserDao(Connection con){
        this.con = con;
    }
    public User userlogin(String email, String password) throws SQLException {
        User user = null;
        q = "select * from users where email=? and password=?";
        pstmt = this.con.prepareStatement(q);
        pstmt.setString(1,email);
        pstmt.setString(2,password);
        rs = pstmt.executeQuery();
        if(rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setEmail(rs.getString("email"));
        }
        return user;
    }
}
