package day14.synchronization;

public class DepositLimitExceedException extends Exception{
	
	public DepositLimitExceedException() {
		super ("daily limit of deposit is exceed...");
	}
	public DepositLimitExceedException(String msg) {
		super();
	}
}
