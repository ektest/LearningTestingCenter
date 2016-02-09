package generic.wildcards;

import java.util.ArrayList;
import java.util.List;

import generic.wildcards.customer.Company;
import generic.wildcards.customer.CustomerInterface;
import generic.wildcards.customer.Person;

public class TestInterfaces {

	public static void main(String[] args) {
		//Example of inheritance
		List<CustomerInterface> customers = new ArrayList<CustomerInterface>();
		Company c1 = new Company(1,"William Wolf","17 Yellow Street","Acme Industries");
		Person p1 = new Person(2,"Frederick Fox", "54 Orange Road",31);

		customers.add(c1);
		customers.add(p1);
		
		for (CustomerInterface customer : customers) {
			System.out.println(customer.getName());
		}
	}

}
