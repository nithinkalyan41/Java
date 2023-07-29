package com.dailycodebuffer.springboot.tutorial.repository;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRespositoryTest {
    @Autowired
    private DepartmentRespository departmentRespository;
    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department deparment = Department.builder()
                .departmentName("Civil Engineering")
                .departmentCode("CE7774")
                .departmentAddress("Delhi")
                .build();
        entityManager.persist(deparment);
    }
    @Test
    public void whenFindById_thenReturnDepartment(){
        Department department = departmentRespository.findById(1L).get();
       assertEquals(department.getDepartmentName(),"Civil Engineering");
    }
}