package day10.exception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * packageName    : day10.exception
 * fileName       : ThrowsExample
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class ThrowsExample {
	public int inputNumber() throws NoSuchElementException, IllegalAccessError {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public int convert(String str) throws NumberFormatException {
		int n = Integer.parseInt(str);
		return n;
	}

}
