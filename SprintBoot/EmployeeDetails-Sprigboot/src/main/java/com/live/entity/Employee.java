package com.live.entity;

public class Employee {

	private long EmpId;
	private String EmpName;
	private String EmpTitle;
	private String CompanyName;
	private String ProjectName;
	public long getEmpId() {
		return EmpId;
	}
	public void setEmpId(long empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long empId, String empName, String empTitle, String companyName, String projectName) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpTitle = empTitle;
		CompanyName = companyName;
		ProjectName = projectName;
	}
	@Override
	public String toString() {
		return "Product [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpTitle=" + EmpTitle + ", CompanyName="
				+ CompanyName + ", ProjectName=" + ProjectName + "]";
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpTitle() {
		return EmpTitle;
	}
	public void setEmpTitle(String empTitle) {
		EmpTitle = empTitle;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	
}
