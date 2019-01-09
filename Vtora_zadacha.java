
		import java.util.Scanner;

		public class Vtora_zadacha {

		    public static void main (String [] args) {
		        Scanner scanner = new Scanner (System.in);
		        int n = Integer.parseInt(scanner.nextLine());
		        String dayOrNight = scanner.nextLine();
		        double price, priceMin;
		        double taxiPrice = 0.7;
		        double trainPrice = 0.06;
		        double busPrice = 0.09;
		        if (dayOrNight.equals("day")) {
		            taxiPrice += 0.79 * n;
		        } else if (dayOrNight.equals("night")) {
		            taxiPrice += 0.9 * n;
		        }
		        if (n >= 100) {
		            trainPrice *= n;
		        }
		        if (n >= 20) {
		            busPrice *= n;
		        }
		        if (trainPrice > 0.06) {
		            priceMin = Math.min(taxiPrice, trainPrice);
		            System.out.println(priceMin);
		        } else if (busPrice > 0.09) {
		            priceMin = Math.min(taxiPrice, busPrice);
		            System.out.println(priceMin);
		        } else  {
		            System.out.println(taxiPrice);
		        }

	}

}
