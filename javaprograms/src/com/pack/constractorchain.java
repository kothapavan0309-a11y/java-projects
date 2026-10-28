package com.pack;

public class constractorchain {
	 String brand;
	 String model;
	 double price;
	 String colour;
	 int year;

	 constractorchain(){
		 brand = "unknown";
		 model = "unknown";
		 price = 7000000;
		 colour = "unknown";
		 year = 2020;
	 }
	 //one-arg constractor
	 constractorchain(String brand){
		 this.brand=brand;
	 }
	 
	 constractorchain(String brand, String model){
		 this.brand=brand;
		 this.model=model;
	 }
	 
	 constractorchain(String brand, String model, double price){
		 this.brand=brand;
		 this.model=model;
		 this.price=price;
	 }
	 
	 constractorchain(String brand, String model, double price, String colour){
		 this.brand=brand;
		 this.model=model;
		 this.price=price;
		 this.colour= colour;
	 }
	 
	 constractorchain(String brand, String model, double price, String colour,int year){
		 this.brand=brand;
		 this.model=model;
		 this.price=price;
		 this.colour= colour;
		 this.year=year;
	 }

	 

	 
	   
	public static void main(String[] args) {
        
		System.out.println("wellcom to my progaram");
	constractorchain c1  = new constractorchain();
	  c1.carinfo();
	
	  constractorchain c2 = new constractorchain("tata");
		c2.carinfo();
		
		constractorchain c3 = new constractorchain("tata", "altroz");
		c3.carinfo();
		
		constractorchain c4 = new constractorchain("tata", "altroz" ,700000);
		c4.carinfo();
		
		constractorchain c5= new constractorchain("tata", "altroz" ,700000,"white");
		c5.carinfo();
		
		constractorchain c6= new constractorchain("tata", "altroz" ,700000,"white" , 2020);
		c6.carinfo();
	}
	
	
	void carinfo() {
		System.out.println("brand of the car :"+ brand);
		System.out.println("model of the car :"+ model);
		System.out.println("price of th car :" + price);
		System.out.println("colour of the car :" + colour);
		System.out.println("year of the car :" + year);
	}

}
