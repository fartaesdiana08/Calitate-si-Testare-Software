package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Profitable;

public class Main {

	public static void main(String[] args) {
		//nu pot instantia o clasa abstracta
		//Account a=new Account();
		
		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount account2=new CurrentAccount(200,"IBAN2");
		
		SavingsAccount account3=new SavingsAccount(300,"IBAN3");
		
		System.out.println("suma disponibila este: "+c.getBalance());
		System.out.println("Creditul maxim pentru cont curent este " + CurrentAccount.MAX_CREDIT);
		c.deposit(200);
		System.out.println("suma disponibila este: "+c.getBalance());
		
		try {
			c.withdraw(200);
			c.setNotificationService(new EmailNotificationService());
			c.withdraw(200);
			c.setNotificationService(new NotificationService() {

				@Override
				public void sendNotification(String message) {
					System.out.println("Sent PUSH notification with message "+message);
					
				}
				
			});
			c.transfer(100, c);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("suma disponibila este: "+c.getBalance());
		System.out.println("suma in contul2 este: " + account2.getBalance());
	
		((Profitable) account3).addInterest(10);
		System.out.println("suma in contul3 este: " + account3.getBalance());
		
		Bank banca = new Bank();
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT);
				
	}

}