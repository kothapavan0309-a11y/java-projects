package com.pack;

public class countobj {
	
	static int count = 0;
	
	countobj (){
		 count ++ ;
		 
	}

	void main(String[] args) {
	  countobj c1 =new countobj();
	  countobj c2 =new countobj();
	  countobj c3 =new countobj();
	  
System.out.println("count object="+  count);

	}

}
