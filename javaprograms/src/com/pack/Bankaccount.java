package com.pack;

public class Bankaccount {

	static long accountnumbergenerator = 93985328;
	long accno;
	String holdername;
	double balance;

	{
		accountnumbergenerator++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount Ba1 = new Bankaccount();

		Ba1.accno = accountnumbergenerator;
		Ba1.holdername = "Pavan";
		Ba1.balance = 50582.0;

		Bankaccount Ba2 = new Bankaccount();

		Ba2.accno = accountnumbergenerator;
		Ba2.holdername = "ravi";
		Ba2.balance = 65382.0;

		System.out.println("accountno:" + Ba1.accno);
		System.out.println("holdername;" + Ba1.holdername);
		System.out.println("available balance" + Ba1.balance);

		System.out.println(Ba2.accno);
		System.out.println(Ba2.holdername);
		System.out.println(Ba2.balance);

	}

}
