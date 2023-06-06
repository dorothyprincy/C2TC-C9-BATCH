package day14.synchronization;

public class Account implements Bank{
	private int accNo;
	private String name;
	private double balance;
	

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	

	public Account() {
		super();
	}

	public Account(int accNo, String name, double balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public void deposit(int amt) throws DepositLimitExceedException {
		if(amt > 25000) {
			throw new DepositLimitExceedException("daily limit exceeds");
		}else {
			balance += amt;
			System.out.println("amount deposited"+amt);
		}
		
	}

	@Override
	public void withdraw(int amt) throws InsufficientBalanceException {
		if(balance - amt < MINBAL) {
			throw new InsufficientBalanceException();
		}else {
			balance -= amt;
			System.out.println("After withdrawing Rs."+amt+"current balance:"+balance);
		}
		
	}

}
