
Instruct Abi. A . Aderinto
 * Description: Models a Name
 * Date: 13/11/2017
 * @author Abi.A.Aderinto
 * @version 1.0

package ie.lyit.serialize;

import ie.lyit.serialize.CustomerSerializer;

public class CustomerSerializerTester {

	public static void main(String[] args) {
		CustomerSerializer customerSerializer = new CustomerSerializer();
/*		
		// Add two records to the ArrayList
		customerSerializer.add();
		customerSerializer.add();
				
		// Write the ArrayList to File
		customerSerializer.writeRecordsToFile();
*/
		
		// Read the ArrayList from the File
		cutomerSerializer.readRecordsFromFile();
		
		// List all the customer in the ArrayList
		customerSerializer.list();
       // Create a Menu Object
+		Menu menuObj = new Menu();
+		
+		do {
+			// Call it's display() method
+			menuObj.display();
+			// Call it's readOption() method
+			menuObj.readOption();
+	
+			// switch on the option and call the appropriate method
+			switch(menuObj.getOption()){
+			   case 1:customerkSerializer.add();break;
+			   case 2:customerSerializer.list();break;
+			   case 3:customerSerializer.view();break;
+			   case 4:customererializer.edit();break;
+			   case 5:customerSerializer.delete();break;
+			   case 6:break;				
+			   default:System.out.println("INVALID OPTION...");
+			}
+		}while(menuObj.getOption() != 6);
+		
+		// Write the books ArrayList to File
+		// THIS SERIALIZES THE ARRAYLIST		
+		CustomerSerializer.writeRecordsToFile();
+	}
+}
	}
}