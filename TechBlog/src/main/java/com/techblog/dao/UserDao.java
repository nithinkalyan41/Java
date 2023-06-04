package com.techblog.dao;
import com.techblog.entites.User;

import java.sql.*;
public class UserDao {
    private Connection con;

    public UserDao(Connection con) {
        this.con = con;
    }
    //methos to insert to database
    public boolean saveUser(User user) {
        boolean f = false;
        try {

            String q = "insert into user(name,email,password,gender,about) values(?,?,?,?,?)";
            PreparedStatement pstmt = this.con.prepareStatement(q);
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getAbout());
            pstmt.executeUpdate();
            f = true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return f;
    }
}
