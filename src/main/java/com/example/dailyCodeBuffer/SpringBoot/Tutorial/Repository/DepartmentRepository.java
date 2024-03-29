package com.example.dailyCodeBuffer.SpringBoot.Tutorial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dailyCodeBuffer.SpringBoot.Tutorial.Entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>
{
	public Department findByDepartmentName(String departmentName);
    
	@Query(value = "", nativeQuery = true)
	public Department findByDepartmentNameIgnoreCase(String departmentName);
	
}
