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
