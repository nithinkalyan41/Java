package com.DaliyCodeBuffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
       Scanner sc = new Scanner(System.in);
        List<Student> s = new ArrayList<>();
        while(true) {
            String r = sc.next();
            if (r.equals("add")) {
                System.out.println("Enter the student details");
                String name = sc.next();
                long id = sc.nextLong();
                String email = sc.next();
                float gpa = sc.nextFloat();
                s.add(new Student(name, id, email, gpa));
                System.out.println("added");
            }
            System.out.println(s);
        }
    }
}