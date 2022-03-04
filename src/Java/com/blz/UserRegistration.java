/*@Purpose :As a User need to follow pre defined Password Rules
 *Should clear all Email samples provided separately
 *@File : User Registration Using Regex
 *@Author : Kumudini Khairnar.
 */

package Java.com.blz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {

		/*
		 * @Purpose : Take emailID And Check It Is Getting Matched With Regex/Regular
		 * Expression Or Not
		 * 
		 * @param : Name, Regex, Matches
		 */

		String contactNumPattern = "^[0-9]{2}\\s{1}[0-9]{10}$";
		Pattern regex = Pattern.compile(contactNumPattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the contact number : ");
		String inputStr = sc.nextLine();
		Matcher contactNumMatcher = regex.matcher(inputStr);
		sc.close();
		if (contactNumMatcher.matches()) {
			System.out.println(inputStr + " is valid contact number.");
		} else {
			System.out.println(inputStr + " is invalid contact number.Kindly input the right one.");
		}
	}
}
