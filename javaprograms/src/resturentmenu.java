import java.util.Scanner;

public class resturentmenu {

	private static int total;

	public static void main(String[] args) {
       System.out.println("wellcome to our resturent");
		Scanner sc  = new Scanner(System.in);
			
		System.out.println("select the category like veg or non-veg");
		String catg = sc.nextLine();
		
		switch(catg){
		    
		case "veg" -> {
			
			System.out.println("------starters-----");
			System.out.println("1.paneer tikka");
			System.out.println("2.paneer popcorn");
			System.out.println("3.hara bhara kebab");
			System.out.println("------biryanis-----");
			System.out.println("4.hyd veg biryani");
			System.out.println("5.andhara spl avakay biryani");
			System.out.println("6.kolkata veg biryani");
			System.out.println("--------------------------");
			
			double vegTotalPrice = 0;
			String vyn="";
			String item="";
			do {
				System.out.println("Enter your no");
				int items = sc.nextInt();
				 sc.nextLine();
				switch(items) {
				
				case 1 ->{
					item = "paneer tikka";
					double paneerTikka = 400;
					vegTotalPrice+=paneerTikka;
				}
				
				case 2 ->{
					item = "paneer popcorn";
					double paneerpopcorn = 500;
					vegTotalPrice+=paneerpopcorn;
				}
				case 3 ->{
					item ="hara bhara kebab";
					double harabharakebab = 600;
					vegTotalPrice+=harabharakebab;
				}
				case 4 ->{
					item="hyd veg biryani";
					double hydvegbiryani=700;
					vegTotalPrice+=hydvegbiryani;
					}
				case 5 ->{
					item ="andhara spl avakay biryani";
					double andharasplavakaybiryani =750;
					vegTotalPrice+=andharasplavakaybiryani;
				}
				case 6 ->{
					item="kolkata veg biryani";
					double kolkatavegbiryani =800;
					vegTotalPrice+=kolkatavegbiryani;
				}
				default -> System.out.println("enter items is not available");
				}
				
				System.out.println("do you want select next items click yes for y or click no for n");
				vyn =sc.nextLine();
			}while (vyn.equalsIgnoreCase("y"));
			
			System.out.println("total price :" +vegTotalPrice);
			
			}
		
		case "non-veg"->{
			System.out.println("-----starters----");
			System.out.println("1.chicken chelli");
			System.out.println("2.dragan chicken");
			System.out.println("3.bbq chicken");
			System.out.println("-------biryanis------");
			System.out.println("4.hyd dum biryani");
			System.out.println("5.mugalay biryani");
			System.out.println("6.nattukodi biryani");
			
			double  totalnonvegprice =0;
			 String item="";
            String nonyn ="";
			 
			do {
				System.out.println("enter the no");
				int no =sc.nextInt();
				sc.nextLine();
				switch(no) {
				
				case 1 -> {
					item= "chicken chelli";
					double  chickenchelli = 500;
					totalnonvegprice += chickenchelli;
					
				}
				case 2 -> {
					item= "dragan chicken";
					double  draganchicken = 800;
					totalnonvegprice += draganchicken;
					
				}
				case 3 -> {
					item= "bbq chicken";
					double  bbqchicken = 500;
					totalnonvegprice +=bbqchicken;
					
				}
				case 4 -> {
					item= "hyd dum biryani";
					double  hyddumbiryani = 500;
					totalnonvegprice += hyddumbiryani;
					
				}
				case 5 -> {
					item= "mugalay biryani";
					double  mugalaybiryani = 500;
					totalnonvegprice +=mugalaybiryani;
					
				}
				case 6 -> {
					item= "nattukodi biryani";
					double  nattukodibiryani = 500;
					totalnonvegprice += nattukodibiryani;
					
				}
	            default -> System.out.println("enter item is unaviable");

			}
				System.out.println("Do you want to countinue yes or no");
				nonyn=sc.nextLine();
		}while(nonyn.equalsIgnoreCase("y"));
		
			System.out.println("total price :" +totalnonvegprice);
		}
		
		}
	}
}

	
