package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.Department;
import com.dailycodebuffer.springboot.tutorial.repository.DepartmentRespository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRespository departmentRespository;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder().departmentName("IT")
                        .departmentAddress("HYD")
                        .departmentCode("IT7774")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRespository.findByDepartmentNameIgnoreCase("IT"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("get Data Based on the valid Dname")
    //@Disabled
    public void whenValidDepartmentName_DepartmentShouldFound(){
            String departmentName = "IT";
            Department found = departmentService.fetchDepartmentByName(departmentName);
            assertEquals(departmentName,found.getDepartmentName());
    }
}