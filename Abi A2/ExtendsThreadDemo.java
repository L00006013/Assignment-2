public class ExtendsThreadDemo{
   public static void main(String[] args){
      // Create threads
      PrintChar printA = new PrintChar('a', 100);
      PrintChar printB = new PrintChar('b', 100);
      PrintNum print100 = new PrintNum(100);
		
      // Start threads
      printA.start();
      printB.start();
      print100.start();
   }
}

// The thread class for printing a specified 
// character in specified times
class PrintChar extends Thread{
   private char charToPrint; // The character to print
   private int times; // The times to repeat

   // Construct a task with specified character and number of
   //  times to print the character
   public PrintChar(char c, int t){
      charToPrint = c;
      times = t;
   }

   // Override the run() method to tell the system
   // what task to perform
   public void run(){
      for (int i = 0; i < times; i++){
         System.out.print(charToPrint);
      }
   }
}

// The thread class for printing number from 1 to n for a given n
class PrintNum extends Thread{
   private int lastNum;

   // Construct a task for printing 1, 2, ... i
   public PrintNum(int n) {
      lastNum = n;
   }

   // Tell the thread how to run
   public void run(){
      for(int i = 1; i <= lastNum; i++){
         System.out.print(" " + i);
      }
   }
}