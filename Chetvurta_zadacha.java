import java.util.Scanner;
public class Chetvurta_zadacha {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner (System.in);
		        double nasledstvo = Double.parseDouble(scanner.nextLine());
		        int yearToLive = Integer.parseInt(scanner.nextLine());
		        int age = 18;
		        for (int currentYear = 1800; currentYear <= yearToLive; currentYear++) {
		            if (currentYear % 2 == 0) {
		                nasledstvo -= 12000;
		            } else {
		                nasledstvo -= (12000 + 50 * age);
		            }
		            age++;
		        }
		        if (nasledstvo >= 0) {
		            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", nasledstvo);
		        } else {
		            System.out.printf("He will need %.2f dollars to survive.",Math.abs(nasledstvo));
		        }
		    }
		


	

}
