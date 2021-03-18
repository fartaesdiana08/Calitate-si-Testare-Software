package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public abstract class Account {
	//clasa nu va putea fi instantiata
	//este folosita ca sablon
	//public abstract void deposit(double amount);
	//public abstract void withdraw(double amount) throws InsufficientFundsException;
	//public abstract void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException;
	public abstract double getBalance();

}
