package com.pack;

public class HelloJava {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
     System.out.println("main mathod started");
     System.out.println("welcome to java world");
      
     Class.forName("java.lang.String");
     Class.forName("java.lang.System");
     Class.forName("com.pack.HelloJava");
     
     Class.forName("com.mysql.cj.jdbc.Driver");
     System.out.println("welcome");

	}
}
