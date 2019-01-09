import java.util.Scanner;
public class Purva_zadacha {

	public static void main(String[] args) {
		

	
				Scanner sc = new Scanner (System.in);

				int N = Integer.parseInt(sc.nextLine());

				double W = Double.parseDouble(sc.nextLine());

				double L = Double.parseDouble(sc.nextLine());

				int M = Integer.parseInt(sc.nextLine());

				int O = Integer.parseInt(sc.nextLine());

				int ploshtadka = N * N;

				int peika = M * O;

				int ploshtzaremont = ploshtadka - peika;

				double ploshtplochki = W * L;

				double plochki = ploshtzaremont / ploshtplochki;

				double vreme = plochki * 0.2;

				System.out.println(plochki);

				System.out.println(vreme);
			}
		


	}


