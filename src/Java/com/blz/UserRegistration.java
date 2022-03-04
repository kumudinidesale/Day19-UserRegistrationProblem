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
	/*
	 * @Purpose : Take Password Atleast 8 Character And Check It Is Getting Matched
	 * With Regex/Regular Expression Or Not
	 * 
	 * @param : Name, Regex, Matches
	 */
	public boolean passwrdRule(String inputStr) {
		String passwordPattern = "^[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + " succesfully loggedin and passed first rule.");
		} else {
			System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration psswrd = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please log in using 8 character password.");
		System.out.print("Enter the Password : ");
		String inputStr = sc.nextLine();
		sc.close();
		psswrd.passwrdRule(inputStr);
	}
}
