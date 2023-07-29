package com.example.menu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BlobInsert {
    public static void main(String[] args) throws FileNotFoundException, SQLException, ClassNotFoundException {
        String s = "insert into imm (name,image) values(?,?)";
        File f = new File("src/program-error.png");
        FileInputStream fis = new FileInputStream(f);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blob","root","oracle");
        PreparedStatement pstmt = con.prepareStatement(s);
        pstmt.setString(1,"hello");
        pstmt.setBinaryStream(2,fis);
        pstmt.executeUpdate();
        con.close();
    }
}
