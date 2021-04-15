package ro.ase.cts.seminar8.main;

import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		OrderFacade facade = new OrderFacade();
		facade.order();

	}

}
