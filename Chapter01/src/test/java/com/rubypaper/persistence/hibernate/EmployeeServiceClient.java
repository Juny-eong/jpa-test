package com.rubypaper.persistence.hibernate;

import java.sql.Timestamp;
import java.util.List;

public class EmployeeServiceClient {
	
	public static void main(String[] args) {
		
		EmployeeVO vo = new EmployeeVO();
		vo.setId(4L);
		vo.setName("karl");
		vo.setStartDate(new Timestamp(System.currentTimeMillis()));
		vo.setTitle("Manager");
		vo.setDeptName("None");
		vo.setSalary(6000.00);
		vo.setEmail("guest@tax.org");
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.insertEmployee(vo);
				
		List<EmployeeVO> employeeList = employeeDAO.getEmployeeList();
		for (EmployeeVO employee : employeeList) {
			System.out.println("---> " + employee.toString());
		}
	}
}
