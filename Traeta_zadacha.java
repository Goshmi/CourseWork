import java.util.Scanner;
public class Traeta_zadacha {

	public static void main(String[] args) {
		
		         Scanner sc = new Scanner (System.in);

		        double budget; 
		        String category; 
		        int peoplesInGroup; 
		        double leftBudget; 
		        double percentage; 

		        do { 
		            budget = Double.parseDouble(sc.nextLine());
		            category = sc.nextLine();
		            peoplesInGroup = Integer.parseInt(sc.nextLine());
		        }while ((budget < 1000 && budget > 1000000) || ((!category.equals("VIP")) && (!category.equals("Normal")))
		                || (peoplesInGroup < 1 && peoplesInGroup > 200));

		        if (peoplesInGroup <= 4) {
		            percentage = 0.25;
		        } else if (peoplesInGroup >= 5 && peoplesInGroup <= 9) {
		            percentage = 0.4;
		        } else if (peoplesInGroup >= 10 && peoplesInGroup <= 24) {
		            percentage = 0.5;
		        } else if (peoplesInGroup >= 25 && peoplesInGroup <= 49) {
		            percentage = 0.6;
		        } else {
		            percentage = 0.75;
		        }
		        leftBudget = budget * percentage; 
		        if (category.equals("VIP")) { 
		            if (leftBudget >= 499.99 * peoplesInGroup) { 
		                leftBudget -= 499.99;
		                System.out.printf("Yes! You have %.2f leva left.", leftBudget);
		            } else {
		                leftBudget=(499.99*peoplesInGroup)-leftBudget;
		                System.out.printf("Not enough money! You need %.2f leva.", leftBudget);
		            }
		        } else {
		            if (leftBudget >= 249.99 * peoplesInGroup) { 
		                leftBudget -= 249.99; 
		                System.out.printf("Yes! You have %.2f leva left.", leftBudget);
		            } else { 
		                leftBudget=(249.99*peoplesInGroup)-leftBudget;
		                System.out.printf("Not enough money! You need %.2f leva.", leftBudget);
		            }
		        }

		    }
		

	}


