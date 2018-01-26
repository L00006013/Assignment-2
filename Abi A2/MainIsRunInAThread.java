




 public class MainIsRunInAThread{
 public static void main(String[] args){
 // main() is run in a single thread
 
 Thread t = Thread.currentThread();
 System.out.println(t);
 for (int i=0; i<1000; i++) {
 System.out.println("i == " + i);
 }
 
 }
 
}
 