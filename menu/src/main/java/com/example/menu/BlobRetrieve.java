package com.example.menu;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobRetrieve {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        String selectQuery = "SELECT image FROM imm WHERE id = ?";
        int imageId = 1; // Replace with the appropriate ID

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blob", "root", "oracle");
        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
        preparedStatement.setInt(1, imageId);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            InputStream inputStream = resultSet.getBinaryStream("image");
            System.out.println(inputStream);
            // Example: Save the image to a file
            Path outputPath = Path.of("output.png"); // Specify the output file path
            Files.copy(inputStream, outputPath, StandardCopyOption.REPLACE_EXISTING);

            // Example: Process the image data as needed
            // Your code for image processing goes here

            inputStream.close();
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}

