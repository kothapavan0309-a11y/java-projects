
package com.pack;

public class Test {
	
		 static int count=0;
		 static  Test t1=new Test();
		 
		 
		 {
			 System.out.println("instance block  ");
			 count++;
		 }
		 
		 
			public static void main(String[] args) {
				Test t2=new Test();
				Test t3=new Test();
				Test t4=new Test();
				
				 System.out.println("main method ");
				 System.out.println("count object : "+count);
				
				  
			  
		      
			}

}





