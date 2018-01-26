
// Instructor Abi. A . Aderinto
//  * Description: Models a Name
//  * Date: 27/11/2017
//  * @author Abi.A.Aderinto
//  * @version 1.0
//create new InterfaceCalled DAOInterface which contains all customerSerializermethods
//The customerSerializer class must implement the new interface of DAO.

package ie.lyit.Serialier;

import ie.lyit.Serializer.CustomerDaoInterface;

public class CustomerDaoInterface {

	public static void main(String[] args) {
   
   //In customerDAOInterface this class must be able to delete or comment CustomerSerializer object
    //and create new object. It must be the interface object. Example if your your interface is called
    //CustomerDAOinterface, the new object here must be the same type like the interace name
    //Example: CustomerDAOIntefrace custDao=new CustomerSerializer();
    //in every place where deteted customerSerializer object implement any method change to
    //new object instance(i.e. custDao.readRecordsFromFile());
    
		CustomerSerializer customerSerializer = new CustomerSerializer();
		
		// Add two records to the ArrayList
		//customerDaoINface.add();
		//customerDaoInterface.add();
				
		// Write the ArrayList to File
		//customerDaoInterface.writeRecordsToFile();

		
		// Read the ArrayList from the File
		cutomerDaOInterface.readRecordsFromFile();
		
		// List all the customer in the ArrayList
		customerDao.list();
       // Create a Menu Object
		   Menu menuObj = new Menu();
		
		do {
			// Call it's display() method
			menuObj.display();
			// Call it's readOption() method
			menuObj.readOption();
	
			// switch on the option and call the appropriate method
			switch(menuObj.getOption()){

			   case 1:customerDao.add();break;
			   case 2:customerDao.list();break;
			   case 3:customerDao.view();break;
			   case 4:customeDao.edit();break;
			   case 5:customerDao.delete();break;
			   case 6:break;				
			   default:System.out.println("INVALID OPTION...");
			}
		}while(menuObj.getOption() != 6);
		
		// Write the ccustomer ArrayList to File
		// THIS SERIALIZES THE ARRAYLIST		
		CustomerDAO.writeRecordsToFile();
	}

	}
}