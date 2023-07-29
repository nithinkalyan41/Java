package com.sp;

import com.Collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collecttest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Emp emp = (Emp) context.getBean(" Emp");
        System.out.println(emp);
    }
}
