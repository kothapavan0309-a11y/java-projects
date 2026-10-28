package com.pack;

public class bankaccount1 {

	int accid;
	String accname;
	String acctype;
	double balance;
	
	bankaccount1 (int acid, String acname , String actype, double acbalance){
		  
	   	this.accid=acid;
		this.accname=acname;
		this.acctype=actype;
		this.balance=acbalance;
		
		
	}
	
	public static void main(String[] args) {

		bankaccount1 b1 = new bankaccount1(102,"ravi", "savings", 10000.0);
		b1.accdetialsinfo();
		 
		bankaccount1 b2 = new bankaccount1(103,"pavan","current",2000.0);
		
	}

	 void accdetialsinfo() {
		System.out.println("your accountid:"+accid);
		System.out.println("your accountname:"+accname);
		System.out.println("your accounttype:"+acctype);
		System.out.println("your accountbalance"+balance);

	}
}
