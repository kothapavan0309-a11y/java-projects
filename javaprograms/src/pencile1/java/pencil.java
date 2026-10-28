package pencile1.java;

public class pencil {

	public static void main(String[] args) {
	 int money = 100;
	 int pencilprice =  7;
	 
	 int pencil = money /pencilprice;   
	System.out.println("total pencil:" +pencil);
	
	int balance = money-pencilprice*pencil;
	System.out.println("remaing balance:" + balance);

	}

}
