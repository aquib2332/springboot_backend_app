//package com.example.dailyCodeBuffer.SpringBoot.Tutorial.Repository;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import com.example.dailyCodeBuffer.SpringBoot.Tutorial.Entity.Department;
//
//public class DepartmentRepositoryTest 
//{
//	 	@Autowired
//	    private DepartmentRepository departmentRepository;
//
//	    @Autowired
//	    private TestEntityManager entityManager;
//
//	    @BeforeEach
//	    void setUp() {
//	    	Department department =
//	                Department.builder()
//	                .departmentName("Mechanical Engineering")
//	                .departmentCode("ME - 011")
//	                .departmentAddress("Delhi")
//	                .build();
//
//	        entityManager.persist(department);
//	    	
//	    }
//	    
//	    @Test
//	    public void whenFindById_thenReturnDepartment() {
//	        Department department = departmentRepository.findById(1L).get();
//	        assertEquals(department.getDepartmentName(), "Mechanical Engineering");
//	    }
//
//}
