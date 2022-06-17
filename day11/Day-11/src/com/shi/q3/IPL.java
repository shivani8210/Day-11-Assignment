package com.shi.q3;

import java.util.Scanner;

public class IPL {
	
	void homeTeamStadium(Stadium stadium) {
		
		if(stadium==Stadium.EDEN_GARDENS_STADIUM) {
			
            System.out.println("KKR");
            
        }
		
		else if(stadium==Stadium.WANKHEDE_STADIUM) {
			
            System.out.println("Mumbai Indians");
            
        }
		
		else if(stadium==Stadium.CHIDAMBARAM_STADIUM) {
			
            System.out.println("CSK");
            
		}
		
		else if(stadium==Stadium.M_CHINNASWAMY_STADIUM) {
			
            System.out.println("RCB");
            
        }
		
		else if(stadium ==null) {
			
            System.out.println("Enter the valid city");
            
        }
		
	}
	
	public static void main(String[] args) {
		
        IPL ipl = new IPL();

        try {
        	
        	Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter stadium name");
            
            String str = sc.next();
            
            Stadium s = Stadium.valueOf(str);
            
            ipl.homeTeamStadium(s);
            
            }

            catch (Exception e) {
            	
                System.out.println("Pleas Enter the valid city");
            }

    }

}


