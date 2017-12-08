package baitap1;

public class Employee {
	private int No;
	private Programer programer;
	private SoftwareHouse softhouse;
	public Employee(SoftwareHouse softwarehouse, Programer programer, int no){
		this.setNo(no);
		this.setProgramer(programer);
		this.setSofthouse(softwarehouse);
		this.softhouse.towork(this);
		
	}
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public Programer getProgramer() {
		return programer;
	}
	public void setProgramer(Programer programer) {
		this.programer = programer;
	}
	public SoftwareHouse getSofthouse() {
		return softhouse;
	}
	public void setSofthouse(SoftwareHouse softhouse) {
		this.softhouse = softhouse;
	}
	public void display(){
		System.out.println("Nhan vien ten: " + this.programer.getName() + " - ma nhan vien: "+this.getNo());	
	}
	
}
