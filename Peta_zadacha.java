import java.util.Scanner;
public class Peta_zadacha {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int n;

				do {
					n = Integer.parseInt(sc.nextLine());
				} while (n < 2 || n > 42);

				int width = 5 * n;
				int leftDashes = 3 * n;
				int middleDashes = 0;
				int rightDashes = width - leftDashes - middleDashes - 2;

				for (int i = 0; i < n; i++) {
					System.out.printf("%s*%s*%s", repeatStr("-", leftDashes), repeatStr("-", middleDashes),
							repeatStr("-", rightDashes));
					System.out.println();
					middleDashes++;
					rightDashes--;
				}
				middleDashes--;
				rightDashes++;

				for (int i = 0; i < n / 2; i++) {
					System.out.printf("%s*%s*%s", repeatStr("*", leftDashes), repeatStr("-", middleDashes),
							repeatStr("-", rightDashes));
					System.out.println();

				}

				for (int i = 0; i < n / 2 - 1; i++) {
					System.out.printf("%s*%s*%S", repeatStr("-", leftDashes), repeatStr("-", middleDashes),
							repeatStr("-", rightDashes));

					System.out.println();

					leftDashes--;
					rightDashes--;
					middleDashes += 2;

				}
				System.out.printf("%s*%s*%S", repeatStr("-", leftDashes), repeatStr("*", middleDashes),
						repeatStr("-", rightDashes));
				System.out.println();

			}

			static String repeatStr(String strToRepeat, int count) {
				String text = "";
				for (int i = 0; i < count; i++) {
					text = text + strToRepeat;
				}
				return text;
			}
		

	}


