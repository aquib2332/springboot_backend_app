package com.example.dailyCodeBuffer.SpringBoot.Tutorial.Service;

import java.util.List;

import com.example.dailyCodeBuffer.SpringBoot.Tutorial.Entity.Department;
import com.example.dailyCodeBuffer.SpringBoot.Tutorial.Error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

	

}
