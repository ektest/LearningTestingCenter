package generic;

import java.util.ArrayList;
import java.util.List;

public class MainCollection {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<Customer>();

		Customer customer1 = new Customer(1, "Simon Brown", "10 East Street");
		Customer customer2 = new Customer(1, "Jean White", "16 North Road");
		Customer customer3 = new Customer(1, "Alison Green", "9 South Gardens");

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);

		customers.forEach(customer -> {
			System.out.println(customer);
		});
	}
}
