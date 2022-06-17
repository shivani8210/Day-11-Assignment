package com.shi.q2;

public class Mobile {
	
	static String[] outdatedModel = {"note4","note5","note6","note7"};
	
	void searchOutdatedModel(String company, String ... models) {
		
		System.out.println(company);
		
		for(int x=0; x<outdatedModel.length; x++) {
			
			for(int y=0; y<models.length; y++) {
				
				if(outdatedModel[x].equals(models[y])) {
					
					System.out.println("CompanyName: " + company + " Model: " + models[y] + "_OUTDATED");
					
				}
			}
		}
		
	}

}
