/*@Purpose :As a User need to follow pre defined Password Rules
 *Rule4 � Has Special Character -All rules must be passed
 *@File : User Registration Using Regex
 *@Author : Kumudini Khairnar.
 */

package Java.com.blz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	/*
	 * @Purpose : Take Password Atleast One Upper Case Character,Numeric,Special
	 * Character & Eight Character And Also Check It Is Getting Matched With
	 * 
	 * @param : Name, Regex, Matches
	 */
	public boolean passwrdRule(String inputStr) {
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if (passwordMatcher.matches()) {
			System.out.println(inputStr + " succesfully loggedin and passed 4th rule.");
		} else {
			System.out.println(inputStr + " is invalid password.Kindly input minimum 8 character.");
		}
		return false;
	}

	public static void main(String[] args) {
		UserRegistration psswrd = new UserRegistration();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please login using 8 character password having one upper case and one numeric number.");
		System.out.print("Enter the password : ");
		String inputStr = sc.nextLine();
		sc.close();
		psswrd.passwrdRule(inputStr);
	}
}
