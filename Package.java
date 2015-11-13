import java.util.Scanner;

public class Package {

	static double weight;
	static int input;
	static String method;
	public static double getShippingcost() {
		double ps = 0;
		ps = weight / 10;
		if (method == "A" || method == "a") ps += 0.1;
		else if (method == "T" || method == "t") ps += 0.2;
		else if (method == "M" || method == "m") ps += 0.3;
		if (input == 2) ps += 1;
		return ps;
	}




	public static void main(String args[]) {
		PostalMenu();
	}

	private static void PostalMenu() {
		Scanner ta = new Scanner(System. in );
		System.out.println("CPUT Postal Service");
		System.out.println("1. Un-insured Parcel");
		System.out.println("2. Insured Parcel");
		System.out.println("\n3.Exit");
		System.out.print("\nPlease select an option: ");
		input = ta.nextInt();
		if (input == 3) System.exit(0);
		else if (input == 1) new Package.uninsured();
		else if (input == 2) new Package.insured();
	}

	private static class insured {

		public insured() {
			double price;
			String method;
			Scanner ta = new Scanner(System. in );
			System.out.print("Enter Weight: ");
			weight = ta.nextInt();
			while (weight <= 0) {
				System.out.print("Please enter valid weight greater than 0: ");
				weight = ta.nextInt();
			}
			System.out.print("Enter shipping method, (A,a,T,t,M,m): ");
			method = ta.nextLine();
			while (true) {
				if (method.equals("a") || method.equals("A") || method.equals("T") || method.equals("t") || method.equals("M") || method.equals("m")) break;
				else {
					System.out.print("Please enter valid shipping method, (A,a,T,t,M,m): ");
					method = ta.nextLine();
				}
			}
			price = getShippingcost();
			setShippingcost(price);



		}
		private void setShippingcost(double ta) {
			if (input == 1) System.out.println("\nUninsured Parcel");
			else if (input == 2) System.out.println("\nInsured Parcel");
			System.out.println("--------------\nWeight(oz): " + weight + "\nShipping Method: " + method + "\nCost: $" + ta);
		}

	}

	private static class uninsured {

		public uninsured() {
			double price;
			String method;
			Scanner ta = new Scanner(System. in );
			System.out.print("Enter Weight: ");
			weight = ta.nextInt();
			while (weight <= 0) {
				System.out.print("Please enter valid weight greater than 0: ");
				weight = ta.nextInt();
			}
			System.out.print("Enter shipping method, (A,a,T,t,M,m): ");
			method = ta.nextLine();
			while (true) {
				if (method.equals("a") || method.equals("A") || method.equals("T") || method.equals("t") || method.equals("M") || method.equals("m")) break;
				else {
					System.out.print("Please enter valid shipping method, (A,a,T,t,M,m): ");
					method = ta.nextLine();
				}
			}
			price = getShippingcost();
			setShippingcost(price);

		}
		private void setShippingcost(double ta) {
			if (input == 1) System.out.println("\nUninsured Parcel");
			else if (input == 2) System.out.println("\nInsured Parcel");
			System.out.println("--------------\nWeight(oz): " + weight + "\nShipping Method: " + method + "\nCost: $" + ta);
		}
	}


}
