package studentSystem;

import java.util.Scanner;

public class MyUtil {
	
	private MyUtil() {}
	
	public static int getRandomNumber(int min, int max) {
		return (int)(Math.random()*(max-min)+min);
		
	}
	
	public static int getInputNumber(String msg, Scanner scanner) {
		System.out.println(msg);
		return scanner.nextInt();
		
	}
	
	public static String getInputString(String msg, Scanner scanner) {
		System.out.println(msg);
		return scanner.next();
		
	}

}
