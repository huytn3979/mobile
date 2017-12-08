package baitap1;

public class Mainbaitap {

	public static void main(String[] args) {
		Programer huy=new Programer("Thai Ngoc Huy");
		Programer phuoc= new Programer("Nguyen Tan Phuoc");
		SoftwareHouse vnpt=new SoftwareHouse("VNPT");
		vnpt.recruited(huy,123);
		vnpt.recruited(phuoc,1234);
		vnpt.displayStaff();		
	}

}
