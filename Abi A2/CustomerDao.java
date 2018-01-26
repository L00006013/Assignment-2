


import java.unti

//Dao is Data Access ObjectInterface
   public class Customer Dao{
   private Sting name;
   private String isbnNumber;
   
   // INHERITANCE - CustomerDao IS-A Person
	// Customer has name, address, & phoneNumber from Person
	   private String emailAddress;    // AND emailAddress
	   private int number;			    // AND number
      private static int nextNumber=1;// static for unique number - starts off at 1

   
         //Default Constructor -set Instance Variables to null
             private static int nextNumber=1;// static for unique number - starts off at 1
	
	   // Default Constructor
	  // Called when object is created like this ==> 
	  //   CustomerDao cObj = new CustomerDao();	
   	public CustomerDao(){
		super();			// NOTE:Don't need to call super() explicitly.
		emailAddress=null;
		// Set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}
	
	// Initialization Constructor
	// Called when object is created like this ==>
	// CustomerDao cObj = new CustomerDao("Mr","Joe","Doe","12 Hi Rd,Letterkenny",
	//                              "0871234567","joe@hotmail.com");
	public CustomerDao(String t, String fN, String sn, String address, 
			        String pNo, String email){
		// Call super class constructor - Passing parameters required by Person ONLY!
		super(t, fN, sn, address, pNo);
		// And then initialise Customers own instance variables
		emailAddress=email;
		// And finally set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}
