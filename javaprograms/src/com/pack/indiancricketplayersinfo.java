package com.pack;

import java.util.Scanner;

public class indiancricketplayersinfo {

	public static void main(String[] args) {
      System.out.println("players information");
   
      Scanner sc  = new Scanner(System.in);
      
      System.out.println("Enter a player jersey number");
      int jno= sc.nextInt();
       
      switch(jno) {
      case 7:
    	    System.out.println("MSD (Mahendra Singh Dhoni)");
    	    System.out.println("Date of Birth: 7 July 1981");
    	    System.out.println("Role: Wicketkeeper-batter");
    	    System.out.println("Nationality: Indian");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("IPL Team: Chennai Super Kings");
    	    break;

    	case 18:
    	    System.out.println("Full Name: Virat Kohli");
    	    System.out.println("Date of Birth: 5 November 1988");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    System.out.println("IPL Team: Royal Challengers Bengaluru");
    	    break;

    	case 45:
    	    System.out.println("Full Name: Rohit Sharma");
    	    System.out.println("Date of Birth: 30 April 1987");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    System.out.println("IPL Team: Mumbai Indians");
    	    break;

    	case 77:
    	    System.out.println("Full Name: Shubman Gill");
    	    System.out.println("Date of Birth: 8 September 1999");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 93:
    	    System.out.println("Full Name: Jasprit Bumrah");
    	    System.out.println("Date of Birth: 6 December 1993");
    	    System.out.println("Role: Fast Bowler");
    	    System.out.println("Bowling Style: Right-arm fast");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 33:
    	    System.out.println("Full Name: Hardik Pandya");
    	    System.out.println("Date of Birth: 11 October 1993");
    	    System.out.println("Role: All-rounder");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 17:
    	    System.out.println("Full Name: Rishabh Pant");
    	    System.out.println("Date of Birth: 4 October 1997");
    	    System.out.println("Role: Wicketkeeper-batter");
    	    System.out.println("Batting Style: Left-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 8:
    	    System.out.println("Full Name: Ravindra Jadeja");
    	    System.out.println("Date of Birth: 6 December 1988");
    	    System.out.println("Role: All-rounder");
    	    System.out.println("Batting Style: Left-handed");
    	    System.out.println("Bowling Style: Left-arm orthodox spin");
    	    break;

    	case 63:
    	    System.out.println("Full Name: Suryakumar Yadav");
    	    System.out.println("Date of Birth: 14 September 1990");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 1:
    	    System.out.println("Full Name: KL Rahul");
    	    System.out.println("Date of Birth: 18 April 1992");
    	    System.out.println("Role: Wicketkeeper-batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 41:
    	    System.out.println("Full Name: Shreyas Iyer");
    	    System.out.println("Date of Birth: 6 December 1994");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Right-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 64:
    	    System.out.println("Full Name: Yashasvi Jaiswal");
    	    System.out.println("Date of Birth: 28 December 2001");
    	    System.out.println("Role: Batter");
    	    System.out.println("Batting Style: Left-handed");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 13:
    	    System.out.println("Full Name: Mohammed Siraj");
    	    System.out.println("Date of Birth: 13 March 1994");
    	    System.out.println("Role: Fast Bowler");
    	    System.out.println("Bowling Style: Right-arm fast");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 23:
    	    System.out.println("Full Name: Kuldeep Yadav");
    	    System.out.println("Date of Birth: 14 December 1994");
    	    System.out.println("Role: Spin Bowler");
    	    System.out.println("Bowling Style: Left-arm wrist spin");
    	    System.out.println("Nationality: Indian");
    	    break;

    	case 2:
    	    System.out.println("Full Name: Arshdeep Singh");
    	    System.out.println("Date of Birth: 5 February 1999");
    	    System.out.println("Role: Fast Bowler");
    	    System.out.println("Bowling Style: Left-arm fast-medium");
    	    System.out.println("Nationality: Indian");
    	    break;

    	default:
    	    System.out.println("Invalid Jersey Number");
    	    break; 
      }
	}

}

