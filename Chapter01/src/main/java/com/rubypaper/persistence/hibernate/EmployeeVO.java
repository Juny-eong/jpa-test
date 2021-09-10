package com.rubypaper.persistence.hibernate;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "S_EMP")
public class EmployeeVO {
	
	@Id
	private Long id; 				// 직원 아이디
	
	private String name; 			// 직원 이름
	
	@Column(name = "START_DATE")
	private Timestamp startDate; 	// 입사일
	
	private String title; 			// 직급
	
	@Column(name = "DEPT_NAME")
	private String deptName; 		// 부서 이름
	
	private Double salary; 			// 급여
	
	private String email;
	
}
