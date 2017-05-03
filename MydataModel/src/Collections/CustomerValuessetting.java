package Collections;

public class CustomerValuessetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer sekhar = new Customer();
		sekhar.setFirstName("Chandra");
		sekhar.setLastName("Godula");
			/*	sekhar.setPhonenumber("3142241566");
		sekhar.setEmailid("chandra");
		sekhar.setAddress(new Address());
		sekhar.getAddress().setLine1("12369 Spanis Trace Dr:");
		sekhar.getAddress().setCity("Maryland Heights");  */
		
		Customer mahesh = new Customer();
		mahesh.setFirstName("Chandra");
		mahesh.setLastName("Godula");
		
		Customer sreram = new Customer();
		sreram.setFirstName("Chandra");
		sreram.setLastName("Godula");
		
		
		System.out.println(sekhar.toString());
		if(sekhar.equals(mahesh)){
			System.out.println("Sekhar is Mahesh");
			
		}
	}

	
}
