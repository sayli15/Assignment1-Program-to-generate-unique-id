/*Create a program to take user name as a input and display the following:
 *  1) Random generated id -> Different every time
 *  2) Name of the user
 *  3) Date & Time of the request
 */

package Avtaar;

import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Assignment1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Username: ");
		// Taking the username as a input from user
		String name = sc.nextLine();

		// Used these classes for current date & time
		DateTimeFormatter datetime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();

		// Used this for random unique id
		UUID id = UUID.randomUUID();

		// Display the Username, Unique id for user & current date-time.
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("Username: " + name);
		System.out.println("Your one-time unique id: " + "'" + id + "'");
		System.out.println(datetime.format(now));
		System.out.println("----------------------------------------------------------------");
	}
}
