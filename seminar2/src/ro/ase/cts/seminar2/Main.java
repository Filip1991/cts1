package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class Main {

	public static void main(String[] args) {
		CurrentAccount c = new CurrentAccount(300, "IBAN1");
		CurrentAccount c2= new CurrentAccount(200, "IBAN2");
		System.out.println("suma disponibila este: " + c.getBalance());
		System.out.println("Creditul maxim pentru cont curent este: "+ CurrentAccount.MAX_CREDIT);
		c.deposit(200);
		System.out.println("suma disponibila este: " + c.getBalance());
		try {
			c.withdraw(200);
			c.transfer(100, c2);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			System.err.println(e.getMessage());
		} 
		System.out.println("suma disponibila este: " + c.getBalance());
		System.out.println("suma in contul 2 este: " + c2.getBalance());

		
	}

}
