package baitap1;

import java.util.*;

public class SoftwareHouse {
	private String name;
	private List<Employee> employees;
	public SoftwareHouse(String name){
		this.setName(name);
		this.employees=new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void towork(Employee employee){
		employees.add(employee);
	}
	public List<Employee> getEmployee() {
		return this.employees;
	}
	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}
	public void recruited(Programer programer,int no){
		new Employee(this,programer,no);
	}
	public void displayStaff(){
		System.out.println(this.getName() + " co nhan vien:");
		List<Employee> staff =this.getEmployee();
		for(int i=0; i< staff.size();i++){
			staff.get(i).display();
		}
	}
}
