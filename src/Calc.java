import java.util.*;

public class Calc {
	private static double x;
	private static double y;

	public double add(double xx, double yy) {
		return xx + yy;
	}

	public double sub(double xx, double yy) {
		return xx - yy;
	}

	public double mult(double xx, double yy) {
		return xx * yy;
	}

	public double divd(double xx, double yy) {
		return xx / yy;
	}

	public double power(double xx, double yy) {
		double temp = xx;
		if (yy > 0) {
			for (double i = yy; i > 1; i--) {
				xx *= temp;
			}
		} else if (yy < 0) {
			for (double i = -yy; i > 1; i--) {
				xx *= temp;
			}
			xx = 1 / xx;
		} else {
			xx = 1;
		}

		return xx;
	}

	public double root(double xx, double yy) {
		return Math.pow(xx, 1 / yy);

	}

	public static void main(String[] args) {
		Calc calc = new Calc();
		Scanner scan = new Scanner(System.in);
		String aaa;
		boolean start = true;
		boolean userIsCalculating = false;
		boolean userIsDoneCalculating = false;
		while (start == true) {
			System.out.println("Would you like to do some math? (Yes or No)");
			aaa = scan.nextLine();
			if (aaa.equalsIgnoreCase("yes")) {
				userIsCalculating = true;
			} else if (aaa.equalsIgnoreCase("no")) {
				System.out.println("Calculator Ended");
				start = false;
			} else {
				System.out.println("Please say yes or no");
			}
			while (userIsCalculating == true) {
				System.out.println("Would you like to (A)dd, (S)ubtract, (M)ultiply, (D)ivide, (P)ower, (R)oot");
				aaa = scan.next();
				if (aaa.equalsIgnoreCase("a")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.add(x, y));
				} else if (aaa.equalsIgnoreCase("s")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.sub(x, y));
				} else if (aaa.equalsIgnoreCase("m")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.mult(x, y));
				} else if (aaa.equalsIgnoreCase("d")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.divd(x, y));
				} else if (aaa.equalsIgnoreCase("p")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.power(x, y));
				} else if (aaa.equalsIgnoreCase("r")) {
					System.out.println("first number");
					x = scan.nextDouble();
					System.out.println("second number");
					y = scan.nextDouble();
					System.out.println(calc.root(x, y));
				} else if (!(aaa.equalsIgnoreCase("a || m || s || d || r"))) {
					System.out.println("Please enter a valid function");
				}
				userIsDoneCalculating = true;
				userIsCalculating = false;
				while (userIsDoneCalculating == true) {
					System.out.println("Would you like to perform another math operation? (Y)es, (N)o");
					aaa = scan.next();
					if (aaa.equalsIgnoreCase("y")) {
						userIsCalculating = true;
						userIsDoneCalculating = false;
					} else if (aaa.equalsIgnoreCase("n")) {
						System.out.println("Ok, see you next time!");
						userIsDoneCalculating = false;
						userIsCalculating = false;
						start = false;
					} else {
						System.out.println("Please say 'y' or 'n'");
					}
				}
			}
		}
	}
}