 * Date: 13/11/2017
 * @author Abi.A.Aderinto
 * @version 1.0

//  * Description: Models a Name
//  * Date: 25/11/2017
//  * @author Abi.A.Aderinto
//  * @version 1.0

package ie.lyit.serialize;

import ie.lyit.serialize.CustomerSerializer;

public class CustomerDao {

	public static void main(String[] args) {
   //create new interface called CustomerDAO that contains all customerSerializer class methods
   // MUST !!!) implement the  new inteface
   //This class must delete or comment CustomerDAO object
    //It must be the interface object. Example if interface is called
    //CustomerDAOinterface, the new object here must be the same type like the interace name
    //Example: CustomerDAOIntefrace custDao=new CustomerDAOInterface();
    //Implement new method to customerDAOInterface
    // CustomerDAOInterface.readRecordsFromFile());
    
		CustomerDao customerDao = new CustomerDAOInterface();

		// Add two records to the ArrayList
		  customerDao.add();
		  customerDao.add();
				
		// Write the ArrayList to File
		  customerDAoInterface.writeRecordsToFile();

		
		// List all the customer in the ArrayList
	   	customerDAOInterface.list();
       // Create a Menu Object
	   	Menu menuObj = new Menu();
		
		do {
			// Call it's display() method

			menuObj.display();
			// Call it's readOption() method
			menuObj.readOption();
	
			// switch on the option and call the appropriate     method
			switch(menuObj.getOption();
    

 		{      case 1:customerDAOInterface.add();break;
			   case 2:customerDAOInterface.list();break;
			   case 3:customerDAOInterface.view();break;
			   case 4:customerDAOInterface.edit();break;
			   case 5:customerDAOIterface.delete();break;
			   case 6:break;				
			   default:System.out.println("INVALID OPTION...");
			}
		}while(menuObj.getOption() != 6);
		
		// Write the ccustomer ArrayList to File
		// THIS DAOInterface THE ARRAYLIST		
		CustomerDAOInface.writeRecordsToFile();
	}

	}
}