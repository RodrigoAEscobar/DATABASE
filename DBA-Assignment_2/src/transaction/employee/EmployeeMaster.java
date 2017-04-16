package transaction.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMaster {

	public static void main(String[] args) throws FileNotFoundException {
		/**
		 * Read file and assign info to variables
		 */

		ArrayList<EmployeeHandler> list = new File("transaction_log.txt");		// Create Object
		Scanner in = new Scanner(new File("supersenior.txt"));
		while (in.hasNext()) {
			// String fullName = in.next();
			String fullName = in.nextLine();
			String[] golfer = fullName.split(",");
			String lastName = String.valueOf(golfer[0]);
			String name = String.valueOf(golfer[1]);
			int tot = Integer.parseInt(in.nextLine()); // Total Number of
														// Tournaments.
			String tmp = in.nextLine().trim();
			int moneyWon = Integer.parseInt(tmp);// int moneyWon = in.nextInt();
													// // total money won in
													// each tournament

			EmployeeHandler player = new EmployeeHandler(tot, moneyWon,
					name, lastName);

	//		list.add(player);
		}
		in.close();

		System.out.printf("%-15s %-15s %-7s %-7s \n", "Last Name", " Name",
				"Total of Tournaments", "Average Money");
		System.out.print(list);
	}
}
