package Assignment_1;


import java.util.Scanner;

public class WizardShop{
	/**
	 * @param args
	 */
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Welcome to Weasleys' Wizard Wheezes!");
			
			System.out.println("Can we help the next witch or wizard? (1 = yes, 2 = no)");
			int Decision = input.nextInt();
			
			//the below is the price:
			if (Decision == 1) {
				System.out.println("Here is our price list: \n Pygmy Puffs (each)			290 Knuts \n Extendable Ears (each)			60 Knuts \n Extendable Ears (bag of three)		160 Knuts \n Trick Wand (regular)			1479 Knuts \n Trick Wand (autographed)		2465 Knuts \n");
				
				System.out.println("\n Do you want these prices or would you prefer to try your skill for a discount?  You may elect to answer a challenge question -- if you answer correctly you will get discounted prices but if you answer incorrectly you must pay a 10% penalty on your overall bill. ");
				System.out.println("Do you accept the challenge? (1 = yes, 2 = no)");
				int Challengedecision = input.nextInt();
				
				if (Challengedecision == 1) {
					System.out.println("You have accepted the challenge!\n Perhaps some day you may compete in the Triwizard Tournament!");
					System.out.println("Please answer the following question: \n What name is listed for Harry's dad on the Marauder's Map? \n 1) Moony \n 2) Wormtail \n 3) Padfoot\n 4) Prongs");
					
					int questiondecision = input.nextInt();
					
					// ans correct:
					if (questiondecision == 4) {
						System.out.println("Well done young wizard! \n You will receive the following discounted prices: \n Pygmy Puffs (each)			261 Knuts \n Extendable Ears (each)			50 Knuts \n Extendable Ears (bag of three)		140 Knuts \n Trick Wand (regular)			1479 Knuts\n Trick Wand (autographed)		1479 Knuts\n");
						int ppo = 0;
						int eeo = 0;
						int eeop = 0 , eeos = 0;
						int two = 0 , twoa = 0;
						int totalorder = 0;
						while(true) {
							System.out.println("Please choose an option: \n 1) Update Pygmy Puffs Order \n 2) Update Extendable Ears Order \n 3) Update Trick Wands Order \n 4) Show price list \n 5) Check Out ");
							int orderdecision = input.nextInt();
							input.nextLine();
							
							if (orderdecision == 1) {
								if (ppo == 0) {
									System.out.println("Here is your current order: \n No Pygmy puffs ordered");
								}
								else {
									System.out.println("ordered " + ppo + " pygmy puffs");	
								}
								System.out.println("How many Pygmy Puffs would you like for 261 Knuts each?");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								ppo = ppo + howmuchdecision;
								totalorder = totalorder + (howmuchdecision * 261);
							}
							
							else if (orderdecision == 2) {
								if (eeo == 0) {
									System.out.println("Here is your current order: \n No Extenable ears ordered");
								}
								else {
									System.out.println("ordered " +eeo + " Extenable ears");	
								}
								System.out.println("How many Extenable ears would you like for: \n 50 Knuts each \n 140 Knuts per bag of three");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								eeo = eeo + howmuchdecision;
								eeos = eeo % 3;
								eeop = eeo / 3;
								totalorder = totalorder + (eeos * 50) + (eeop  * 140);
							}
							
							else if (orderdecision == 3) {
								if (two == 0 && twoa == 0 ) {
									System.out.println("Here is your current order: \n No Trick Wands ordered");
								}
								else {
									System.out.println("ordered "+two + "Trick wands and " + twoa + " Autographed trick wands");	
								}
								System.out.println("How many regular Trick Wands would you like for 1479 Knuts each? \n Note: Since you completed the challenge your cost for a\n"
										+ "	regular or autographed trick wand is the same.  Keep this\n"
										+ "	in mind when ordering.");
								int howmuchdecision1 = input.nextInt();
								if (howmuchdecision1 <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision1 = 0;
								}
								two = two + howmuchdecision1;
								totalorder = totalorder + (two * 1479);
								
								System.out.println("How many autographed Trick Wands would you like for 1479 Knuts each?");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								twoa = twoa + howmuchdecision;
								totalorder = totalorder + (twoa * 1479);
								
						    }
							
							else if (orderdecision == 4) {
								System.out.println("Here is our price list: \n"
										+ "	Pygmy Puffs (each)			261 Knuts\n"
										+ "	Extendable Ears (each)			50 Knuts\n"
										+ "	Extendable Ears (bag of three)		140 Knuts\n"
										+ "	Trick Wand (regular)			1479 Knuts\n"
										+ "	Trick Wand (autographed)		1479 Knuts");
								
							}
							
							else if (orderdecision == 5 ) {
								
								System.out.println("Here is your subtotal:");
								
								if (ppo > 0) {
									System.out.println(ppo + " Pygmy Puffs at 290 Knuts ea.:														 "+ (ppo*261));
									
								}
								if (eeos > 0) {
									System.out.println(eeos + " extentable ears at 50 Knuts ea.:													  "+ (eeos*50));
									
								}
								if (eeop > 0) {
									System.out.println(eeop + " bags of Extendable Ears at 140 Knuts ea.:												  "+ (eeop*140));
									
								}
								if (two > 0) {
									System.out.println(two + " regular Trick Wands at 1479 Knuts ea.:												  "+ (two*1479));
									
								}
								if (twoa > 0) {
									System.out.println(twoa + " autographed Trick Wands at 2465 Knuts ea.:												  "+ (twoa*1479));
									
								}
								else if (ppo == 0 && eeos == 0 && eeop == 0 && two == 0 && twoa == 0 ) {
									System.out.println("No items purchased! \n \n");
									continue;
								}
								
								System.out.println("																	-----------");
								System.out.println(" Total:															    		  " + totalorder);
								System.out.println("																	-----------");
								
								System.out.println("Please enter a payment amount in the following format:\n"
										+ "	<amount><space><currency>\n"
										+ "		Where <amount> = an integer\n"
										+ "		Where <space> = a blank space\n"
										+ "		Where <currency> = {Knuts, Sickles, Galleons}\n"
										+ "	You may enter as many times as you like.  Each entry will be\n"
										+ "	added to your total until sufficient funds have been obtained.\n"
										+ "	Recall the currency exchange:\n"
										+ "		29 Knuts = 1 Sickle\n"
										+ "		493 Knuts = 17 Sickles = 1 Galleons");
								int pricepaidtotal =  0;
								int pricepaid = 0; 
								int totalorderpostpay = 0;
								while(true) {
									System.out.println("payment: ");
									String payment = input.nextLine();
									if (payment.contains(" ") == false) {
										System.out.println("not a valid currency");
										continue;
									}
									int space = payment.indexOf(" ");

									String cost = payment.substring(0, space);
									String payType = payment.substring(space + 1);


									if (payType.equalsIgnoreCase("Galleons") || payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost) * 493;

								  	}
								  	else if (payType.equalsIgnoreCase("Sickles")|| payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost) * 29 ;
									
									}
								
									else if (payType.equalsIgnoreCase("Knuts")|| payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost);
									
									}


									else{
										System.out.println("this is not a valid cuurency!");
										continue;
									}
									
									pricepaidtotal = pricepaidtotal + pricepaid;
									totalorderpostpay = totalorder - pricepaidtotal;
									if (pricepaid == totalorder || pricepaid == totalorderpostpay || pricepaidtotal == totalorder || pricepaidtotal == totalorderpostpay){
										System.out.println("you have paid "+totalorder+"out of "+totalorder+" Knuts");
										System.out.println("thank you for shoppping at WWW! ");
										break;
									}

									else if(pricepaid < totalorder && pricepaid < totalorderpostpay){
										System.out.println("you have added "+pricepaid+" to your total");
										System.out.println("you have paid "+ pricepaidtotal+ " out of "+ totalorder + " Knuts");
										System.out.println("you still owe "+ totalorderpostpay+" Knuts");

									}

									else if(pricepaid > totalorder || pricepaid > totalorderpostpay || pricepaidtotal > totalorderpostpay || pricepaidtotal == totalorderpostpay){
										int change = pricepaidtotal - totalorder;
										System.out.println("Thank you!\n");
										System.out.println("you have overpaid by "+ (change)+ " Knuts");
										if (change > 493){
											System.out.println("Here is your change: ");
											int gallchange = change / 493;
											int Sickchange = (change % 493) / 29;
											int Knutchange = ((change % 493) % 29) ;
											System.out.println(gallchange + " Galleons");
											System.out.println(Sickchange + " Sickles");
											System.out.println(Knutchange + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;

										}
										else if ( change > 29 && change < 493){
											System.out.println("Here is your change: ");
											int Sickchange = change /29;
											int Knutchange = (change % 29);
											System.out.println(Sickchange + " Sickles");
											System.out.println(Knutchange + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;
										}
										else{
											System.out.println("Here is your change: ");
											System.out.println(change + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;
										}
									}
									
								}
							break;
							}

							else {
								continue;
							}
						}
					}
					
					//question wrong:
					else {
						System.out.println("I am sorry but that is not correct!\n"
								+ "Clearly you must focus more on your 'History of Magic' course!\n"
								+ "You will be assessed a 10% surcharge on your purchases.");
						int ppo = 0;
						int eeo = 0;
						int eeop =0 , eeos = 0;
						int two = 0 , twoa = 0;
						int totalorder = 0;
						while(true) {
							System.out.println("Please choose an option: \n 1) Update Pygmy Puffs Order \n 2) Update Extendable Ears Order \n 3) Update Trick Wands Order \n 4) Show price list \n 5) Check Out ");
							int orderdecision = input.nextInt();
							
							if (orderdecision == 1) {
								if (ppo == 0) {
									System.out.println("Here is your current order: \n No Pygmy puffs ordered");
								}
								else {
									System.out.println(ppo + "pygmy puffs");	
								}
								System.out.println("How many Pygmy Puffs would you like for 290 Knuts each?");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								ppo = ppo + howmuchdecision;
								totalorder = totalorder + (howmuchdecision * 290);
							}
							
							else if (orderdecision == 2) {
								if (eeo == 0) {
									System.out.println("Here is your current order: \n No Extenable ears ordered");
								}
								else {
									System.out.println(eeo + "Extenable ears");	
								}
								System.out.println("How many Extenable ears would you like for: \n 60 Knuts each \n 160 Knuts per bag of three");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								eeo = eeo + howmuchdecision;
								eeos = eeo % 3;
								eeop = eeo / 3;
								totalorder = totalorder + (eeos * 60) + (eeop  * 160);
							}
							
							else if (orderdecision == 3) {
								if (two == 0 && twoa == 0 ) {
									System.out.println("Here is your current order: \n No Trick Wands ordered");
								}
								else {
									System.out.println(two + "Trick wands and " + twoa + "Autographed trick wands");	
								}
								System.out.println("How many regular Trick Wands would you like for 1479 Knuts each?");
								int howmuchdecision1 = input.nextInt();
								if (howmuchdecision1 <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision1 = 0;
								}
								two = two + howmuchdecision1;
								totalorder = totalorder + (two * 1479);
								
								System.out.println("How many autographed Trick Wands would you like for 2465 Knuts each?");
								int howmuchdecision = input.nextInt();
								if (howmuchdecision <= -1) {
									System.out.println("Negative number taken as 0");
									howmuchdecision = 0;
								}
								twoa = twoa + howmuchdecision;
								totalorder = totalorder + (twoa * 2465);
						    }
							
							else if (orderdecision == 4) {
								System.out.println("Here is our price list: \n"
										+ "	Pygmy Puffs (each)			290 Knuts\n"
										+ "	Extendable Ears (each)			60 Knuts\n"
										+ "	Extendable Ears (bag of three)		160 Knuts\n"
										+ "	Trick Wand (regular)			1479 Knuts\n"
										+ "	Trick Wand (autographed)		2465 Knuts");
								
							}

							else if (orderdecision == 5 ) {
								
								System.out.println("Here is your subtotal:");
								
								if (ppo > 0) {
									System.out.println(ppo + " Pygmy Puffs at 290 Knuts ea.:													  "+ (ppo*290));
									
								}
								if (eeos > 0) {
									System.out.println(eeos + " extentable ears at 50 Knuts ea.:													  "+ (eeos*60));
									
								}
								if (eeop > 0) {
									System.out.println(eeop + " bags of Extendable Ears at 140 Knuts ea.:												  "+ (eeop*160));
									
								}
								if (two > 0) {
									System.out.println(two + " regular Trick Wands at 1479 Knuts ea.:												  "+ (two*1479));
									
								}
								if (twoa > 0) {
									System.out.println(twoa + " autographed Trick Wands at 2465 Knuts ea.:												  "+ (twoa*2465));
									
								}
								else if (ppo == 0 && eeos == 0 && eeop == 0 && two == 0 && twoa == 0 ) {
									System.out.println("No items purchased! \n \n");
									continue;
								}
								int penalty = (int)(totalorder * (10.0f / 100.0f));
								System.out.println("																	-----------");
								System.out.println(" Total:															    		  " + totalorder);
								System.out.println(" Penalty:															    	   " + (penalty));
								System.out.println("																	-----------");
								totalorder = penalty + totalorder;
								System.out.println(" New total:															    	    " + (totalorder));
								
								System.out.println("Please enter a payment amount in the following format:\n"
										+ "	<amount><space><currency>\n"
										+ "		Where <amount> = an integer\n"
										+ "		Where <space> = a blank space\n"
										+ "		Where <currency> = {Knuts, Sickles, Galleons}\n"
										+ "	You may enter as many times as you like.  Each entry will be\n"
										+ "	added to your total until sufficient funds have been obtained.\n"
										+ "	Recall the currency exchange:\n"
										+ "		29 Knuts = 1 Sickle\n"
										+ "		493 Knuts = 17 Sickles = 1 Galleons");
								int pricepaidtotal =  0;
								int pricepaid = 0; 
								int totalorderpostpay = 0;
								while(true) {
									System.out.println("payment: ");
									String payment = input.nextLine();
									if (payment.contains(" ") == false) {
										//System.out.println("not a valid cuurency");
										continue;
									}
									int space = payment.indexOf(" ");

									String cost = payment.substring(0, space);
									String payType = payment.substring(space + 1);


									if (payType.equalsIgnoreCase("Galleons") || payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost) * 493;

								  	}
								  	else if (payType.equalsIgnoreCase("Sickles")|| payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost) * 29 ;
									
									}
								
									else if (payType.equalsIgnoreCase("Knuts")|| payType.equalsIgnoreCase("Galleon")) {
										pricepaid = Integer.parseInt(cost);
									
									}


									else{
										System.out.println("this is not a valid cuurency!");
										continue;
									}
									
									pricepaidtotal = pricepaidtotal + pricepaid;
									totalorderpostpay = totalorder - pricepaidtotal;
									if (pricepaid == totalorder || pricepaid == totalorderpostpay || pricepaidtotal == totalorder || pricepaidtotal == totalorderpostpay){
										System.out.println("you have paid "+totalorder+"out of "+totalorder+" Knuts");
										System.out.println("thank you for shoppping at WWW! ");
										break;
									}

									else if(pricepaid < totalorder && pricepaid < totalorderpostpay){
										System.out.println("you have added "+pricepaid+" to your total");
										System.out.println("you have paid "+ pricepaidtotal+ " out of "+ totalorder + " Knuts");
										System.out.println("you still owe "+ totalorderpostpay+" Knuts");

									}

									else if(pricepaid > totalorder || pricepaid > totalorderpostpay || pricepaidtotal > totalorderpostpay || pricepaidtotal == totalorderpostpay){
										int change = pricepaidtotal - totalorder;
										System.out.println("Thank you!\n");
										System.out.println("you have overpaid by "+ (change)+ " Knuts");
										if (change > 493){
											System.out.println("Here is your change: ");
											int gallchange = change / 493;
											int Sickchange = (change % 493) / 29;
											int Knutchange = ((change % 493) % 29) ;
											System.out.println(gallchange + " Galleons");
											System.out.println(Sickchange + " Sickles");
											System.out.println(Knutchange + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;

										}
										else if ( change > 29 && change < 493){
											System.out.println("Here is your change: ");
											int Sickchange = change /29;
											int Knutchange = (change % 29);
											System.out.println(Sickchange + " Sickles");
											System.out.println(Knutchange + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;
										}
										else{
											System.out.println("Here is your change: ");
											System.out.println(change + " Knuts");
											System.out.println("Thank you for Shopping at WWW!\n\n");
											break;
										}
									}
									
								}
							break;
							}
							
							
							else {
								continue;
							}
						}
					}
				}
				
				// declines challenge
				else {
					int ppo = 0;
					int eeo = 0;
					int eeop = 0 , eeos =0 ;
					int two = 0 , twoa = 0;
					int totalorder = 0;
					while(true) {
						System.out.println("Please choose an option: \n 1) Update Pygmy Puffs Order \n 2) Update Extendable Ears Order \n 3) Update Trick Wands Order \n 4) Show price list \n 5) Check Out ");
						int orderdecision = input.nextInt();
						
						if (orderdecision == 1) {
							if (ppo == 0) {
								System.out.println("Here is your current order: \n No Pygmy puffs ordered");
							}
							else {
								System.out.println(ppo + "pygmy puffs");	
							}
							System.out.println("How many Pygmy Puffs would you like for 290 Knuts each?");
							int howmuchdecision = input.nextInt();
							if (howmuchdecision <= -1) {
								System.out.println("Negative number taken as 0");
								howmuchdecision = 0;
							}
							ppo = ppo + howmuchdecision;
							totalorder = totalorder + (howmuchdecision * 290);
						}
						
						else if (orderdecision == 2) {
							if (eeo == 0) {
								System.out.println("Here is your current order: \n No Extenable ears ordered");
							}
							else {
								System.out.println(eeo + "Extenable ears");	
							}
							System.out.println("How many Extenable ears would you like for: \n 60 Knuts each \n 160 Knuts per bag of three");
							int howmuchdecision = input.nextInt();
							if (howmuchdecision <= -1) {
								System.out.println("Negative number taken as 0");
								howmuchdecision = 0;
							}
							eeo = eeo + howmuchdecision;
							eeos = eeo % 3;
							eeop = eeo / 3;
							totalorder = totalorder + (eeos * 60) + (eeop  * 160);
						}
						
						else if (orderdecision == 3) {
							if (two == 0 && twoa == 0 ) {
								System.out.println("Here is your current order: \n No Trick Wands ordered");
							}
							else {
								System.out.println(two + "Trick wands and " + twoa + "Autographed trick wands");	
							}
							System.out.println("How many regular Trick Wands would you like for 1479 Knuts each?");
							int howmuchdecision1 = input.nextInt();
							if (howmuchdecision1 <= -1) {
								System.out.println("Negative number taken as 0");
								howmuchdecision1 = 0;
							}
							two = two + howmuchdecision1;
							totalorder = totalorder + (two * 1479);
							
							System.out.println("How many autographed Trick Wands would you like for 2465 Knuts each?");
							int howmuchdecision = input.nextInt();
							if (howmuchdecision <= -1) {
								System.out.println("Negative number taken as 0");
								howmuchdecision = 0;
							}
							twoa = twoa + howmuchdecision;
							totalorder = totalorder + (twoa * 2465);
							
					    }
						
						else if (orderdecision == 4) {
							System.out.println("Here is our price list: \n"
									+ "	Pygmy Puffs (each)			290 Knuts\n"
									+ "	Extendable Ears (each)			60 Knuts\n"
									+ "	Extendable Ears (bag of three)		160 Knuts\n"
									+ "	Trick Wand (regular)			1479 Knuts\n"
									+ "	Trick Wand (autographed)		2465 Knuts");
							
						}
						
						else if (orderdecision == 5 ) {
								
							System.out.println("Here is your subtotal:");
							
							if (ppo > 0) {
								System.out.println(ppo + " Pygmy Puffs at 290 Knuts ea.:														 "+ (ppo*290));
								
							}
							if (eeos > 0) {
								System.out.println(eeos + " extentable ears at 50 Knuts ea.:													  "+ (eeos*60));
								
							}
							if (eeop > 0) {
								System.out.println(eeop + " bags of Extendable Ears at 140 Knuts ea.:												  "+ (eeop*160));
								
							}
							if (two > 0) {
								System.out.println(two + " regular Trick Wands at 1479 Knuts ea.:												  "+ (two*1479));
								
							}
							if (twoa > 0) {
								System.out.println(twoa + " autographed Trick Wands at 2465 Knuts ea.:												  "+ (twoa*2465));
								
							}
							else if (ppo == 0 && eeos == 0 && eeop == 0 && two == 0 && twoa == 0 ) {
								System.out.println("No items purchased! \n \n");
								continue;
							}
							
							System.out.println("																	-----------");
							System.out.println(" Total:															    		  " + totalorder);
							System.out.println("																	-----------");
							
							System.out.println("Please enter a payment amount in the following format:\n"
									+ "	<amount><space><currency>\n"
									+ "		Where <amount> = an integer\n"
									+ "		Where <space> = a blank space\n"
									+ "		Where <currency> = {Knuts, Sickles, Galleons}\n"
									+ "	You may enter as many times as you like.  Each entry will be\n"
									+ "	added to your total until sufficient funds have been obtained.\n"
									+ "	Recall the currency exchange:\n"
									+ "		29 Knuts = 1 Sickle\n"
									+ "		493 Knuts = 17 Sickles = 1 Galleons");
							int pricepaidtotal =  0;
							int pricepaid = 0; 
							int totalorderpostpay = 0;
							while(true) {
								System.out.println("payment: ");
								String payment = input.nextLine();
								if (payment.contains(" ") == false) {
									System.out.println("not a valid currency");
									continue;
								}
								int space = payment.indexOf(" ");

								String cost = payment.substring(0, space);
								String payType = payment.substring(space + 1);


								if (payType.equalsIgnoreCase("Galleons") || payType.equalsIgnoreCase("Galleon")) {
									pricepaid = Integer.parseInt(cost) * 493;

								  }
								  else if (payType.equalsIgnoreCase("Sickles")|| payType.equalsIgnoreCase("Galleon")) {
									pricepaid = Integer.parseInt(cost) * 29 ;
								
								}
							
								else if (payType.equalsIgnoreCase("Knuts")|| payType.equalsIgnoreCase("Galleon")) {
									pricepaid = Integer.parseInt(cost);
								
								}


								else{
									System.out.println("this is not a valid cuurency!");
									continue;
								}
								
								pricepaidtotal = pricepaidtotal + pricepaid;
								totalorderpostpay = totalorder - pricepaidtotal;
								if (pricepaid == totalorder || pricepaid == totalorderpostpay || pricepaidtotal == totalorder || pricepaidtotal == totalorderpostpay){
									System.out.println("you have paid "+totalorder+"out of "+totalorder+" Knuts");
									System.out.println("thank you for shoppping at WWW! ");
									break;
								}

								else if(pricepaid < totalorder && pricepaid < totalorderpostpay){
									System.out.println("you have added "+pricepaid+" to your total");
									System.out.println("you have paid "+ pricepaidtotal+ " out of "+ totalorder + " Knuts");
									System.out.println("you still owe "+ totalorderpostpay+" Knuts");

								}

								else if(pricepaid > totalorder || pricepaid > totalorderpostpay || pricepaidtotal > totalorderpostpay || pricepaidtotal == totalorderpostpay){
									int change = pricepaidtotal - totalorder;
									System.out.println("Thank you!\n");
									System.out.println("you have overpaid by "+ (change)+ " Knuts");
									if (change > 493){
										System.out.println("Here is your change: ");
										int gallchange = change / 493;
										int Sickchange = (change % 493) / 29;
										int Knutchange = ((change % 493) % 29) ;
										System.out.println(gallchange + " Galleons");
										System.out.println(Sickchange + " Sickles");
										System.out.println(Knutchange + " Knuts");
										System.out.println("Thank you for Shopping at WWW!\n\n");
										break;

									}
									else if ( change > 29 && change < 493){
										System.out.println("Here is your change: ");
										int Sickchange = change /29;
										int Knutchange = (change % 29);
										System.out.println(Sickchange + " Sickles");
										System.out.println(Knutchange + " Knuts");
										System.out.println("Thank you for Shopping at WWW!\n\n");
										break;
									}
									else{
										System.out.println("Here is your change: ");
										System.out.println(change + " Knuts");
										System.out.println("Thank you for Shopping at WWW!\n\n");
										break;
									}
								}
								
							}
						break;
						}
						else {
							continue;
						}
						
					}
					
				}
				
			}
			
			
			
			// customer enters 2
			else {
				System.out.println("is there another customer? (1 = yes, 2 = no)");
				int Newcustomer = input.nextInt();
				
				if (Newcustomer == 1) {
					continue;
				}
				else {
					break;
				}
			}
			
		}
		
	}
}
