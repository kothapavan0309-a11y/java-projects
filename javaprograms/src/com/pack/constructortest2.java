package com.pack;

public class constructortest2 {
     
	int sid;
	String name;
	
	constructortest2(){
	 System.out.println("hello");
	 
	    sid =1008;
	    name= "sushh";
	 
	}
	
	public static void main(String[] args) {
		
		constructortest2 c1 = new constructortest2();
		c1.sid= 7687;
		c1.name= "pavan";
		c1.coninfo();
		
		constructortest2 c2 = new constructortest2();
          c2.coninfo();
	}
          void coninfo() {
        	  System.out.println("your studentid:"+sid);
        	  System.out.println("your student name:"+name );

          }
}
