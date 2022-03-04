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
		 * @Purpose : Take Last Name And Check It Is Getting Matched With Regex/Regular
		 * Expression Or Not
		 * 
		 * @param : Name, Regex, Matches
		 */

		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Last name : ");
		String inputStr = sc.nextLine();
		Matcher firstNameMatcher = regex.matcher(inputStr);
		sc.close();
		if (firstNameMatcher.matches()) {
			System.out.println(inputStr + " is valid name.");
		} else {
			System.out.println(inputStr + " is invalid name.Kindly input the right one.");
		}
	}
}
