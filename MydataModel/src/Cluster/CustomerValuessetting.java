package Cluster;

public class CustomerValuessetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer sekhar = new Customer();
		sekhar.setFirstname("Chandra");
		sekhar.setLastname("Godula");
	/*	sekhar.setPhonenumber("3142241566");
		sekhar.setEmailid("chandra");
		sekhar.setAddress(new Address());
		sekhar.getAddress().setLine1("12369 Spanis Trace Dr:");
		sekhar.getAddress().setCity("Maryland Heights");  */
		
		Customer mahesh = new Customer();
		mahesh.setFirstname("Chandra");
		mahesh.setLastname("Godula");
		
		Customer sreram = new Customer();
		sreram.setFirstname("Chandra");
		sreram.setLastname("Godula");
		
		
		System.out.println(sekhar.toString());
		if(sekhar.equals(mahesh)){
			System.out.println("Sekhar is Mahesh");
			
		}
	}

	
}
