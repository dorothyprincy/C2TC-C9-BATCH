package day12.exception;

public class InvalidAgeException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public InvalidAgeException()
	{
		super("Invalid Age");
	}
	InvalidAgeException(String message){
		super("U cant vote");
	}
}
