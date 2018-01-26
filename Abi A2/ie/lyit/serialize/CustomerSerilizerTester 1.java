
Instruct Abi. A . Aderinto
 * Description: Models a Name
 * Date: 13/11/2017
 * @author Abi.A.Aderinto
 * @version 1.0
package ie.lyit.serialize;

import java.util.ArrayList;
import ie.lyit.customer.Customer;
import java.io.*;

public class CustomerSerializer {
	private ArrayList<Customer> customer;
	
	private final String FILENAME = "customer.ser";	
	
	// Default Constructor
	public CustomerSerializer(){
		// Construct customerList ArrayList
	customers = new ArrayList<Customer>();
	}	

	public void add(){
		// Create a Customer object
		Customer customer = new Customer();
		// Read its details
		customer.read();	
		// And add it to the books ArrayList
		customers.add(customer);
	}

	public void list(){
		// for every Customers object in customers
        forCustomer new // Create a Menu Object
+		 // Create a Menu Object
+		Menu menuObj = new Menu();
+		
+		do {
+			// Call it's display() method
+			menuObj.display();
+			// Call it's readOption() method
+			menuObj.readOption();
+	      Menu menuObj = new Menu();
+		
+		do {menuObj.display();

+			// Call it's display() method
+			+			// Call it's readOption() method
+			menuObj.readOption();
+	 // Create a Menu Object
+		Menu menuObj = new Menu();
+		
+		do {
+			// Call it's display() method
+			menuObj.display();
+			// Call it's readOption() method
+			menuObj.readOption();
+	       Customer:customers)
			// display it
			System.out.println(newCustomer);
	}
	
	// This method will serialize the customers ArrayList when called, 
	// i.e. it will write it to a file called customers.ser
	public void writeRecordsToFile(){
		ObjectOutputStream os=null;
		try {
			// Serialize the ArrayList...
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
		
			os = new ObjectOutputStream(fileStream);
				
			os.writeObject(customers);
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		finally {
			try {
				os.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}

	// This method will deserialize the customers ArrayList when called, 
	// i.e. it will restore the ArrayList from the file customer.ser
	public void readRecordsFromFile(){
		ObjectInputStream is=null;
		
		try {
			// Deserialize the ArrayList...
			FileInputStream fileStream = new FileInputStream(FILENAME);
		
			is = new ObjectInputStream(fileStream);
				
			customers = (ArrayList<customers>)is.readObject();	
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			try {
				is.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}
}