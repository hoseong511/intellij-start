package day10.exception;

/**
 * packageName    : day10.exception
 * fileName       : InvalidLoginInputException
 * author         : hoho
 * date           : 4/22/24
 * description    :
 */
public class InvalidLoginInputException extends Exception{
	public InvalidLoginInputException() {
	}

	public InvalidLoginInputException(String message) {
		super(message);
	}
}
