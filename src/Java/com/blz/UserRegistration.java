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
	 * @Purpose : Take Password Atleast One Upper Case Character,Numeric,Special
	 * Character & Eight Character And Also Check It Is Getting Matched With
	 * 
	 * @param : Name, Regex, Matches
	 */
	public static void main(String[] args) {

		String mailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
		Pattern regex = Pattern.compile(mailPattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the email ID : ");
		String inputStr = sc.nextLine();
		Matcher emailIDMatcher = regex.matcher(inputStr);
		sc.close();
		if (emailIDMatcher.matches()) {
			System.out.println(inputStr + " is valid mail.");
		} else {
			System.out.println(inputStr + " is invalid mail address.Kindly input the right one.");
		}
	}
}
