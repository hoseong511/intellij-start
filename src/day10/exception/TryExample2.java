package day10.exception;

import util.SimpleInput;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * packageName    : day10.exception
 * fileName       : TryExample2
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class TryExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n1 = Integer.parseInt(SimpleInput.input("n1 : "));
			int n2 = Integer.parseInt(SimpleInput.input("n2 : "));
			int n3 = sc.nextInt();
			int result = n1 / n2;
			System.out.println(result);
		} catch (InputMismatchException | ArithmeticException | NumberFormatException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

	}
}
