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
    //get user by email and password
    public User getUserByEmailAndPassword(String email,String password){
        User user = null;
        try {
            String q = "select * from user where email=? && password=?";
            PreparedStatement stmt = con.prepareStatement(q);
            stmt.setString(1,email);
            stmt.setString(2,password);
            ResultSet set = stmt.executeQuery();
            if(set.next()){
                user = new User();
                String name = set.getString("name");
                user.setName(name);
                user.setId(set.getInt("id"));
                user.setEmail(set.getString("email"));
                user.setPassword(set.getString("password"));
                user.setGender(set.getString("gender"));
                user.setAbout(set.getString("about"));
                user.setDateTime(set.getTimestamp("rdate"));
                user.setProfile(set.getString("profile"));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        return user;
    }
}
