package com.rubypaper.persistence.mybatis;

import java.sql.Timestamp;
import java.util.List;

public class EmployeeServiceClient {
	
	public static void main(String[] args) {
		
		EmployeeVO vo = new EmployeeVO();
		vo.setName("Lucy");
		vo.setStartDate(new Timestamp(System.currentTimeMillis()));
		vo.setTitle("Manager");
		vo.setDeptName("ba");
		vo.setSalary(4500.00);
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		employeeDAO.insertEmployee(vo);
				
		List<EmployeeVO> employeeList = employeeDAO.getEmployeeList();
		for (EmployeeVO employee : employeeList) {
			System.out.println("---> " + employee.toString());
		}
	}
}
