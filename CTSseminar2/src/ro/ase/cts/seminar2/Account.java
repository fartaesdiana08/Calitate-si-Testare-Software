package ro.ase.cts.seminar2;

public abstract class Account {
	//clasa nu va putea fi instantiata
	//este folosita ca sablon
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(double amount, Account destination);
	public abstract double getBalance();

}
