package vmwarePractice;



import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Enumerator {

   public static void main(String args[]) {
      Enumeration<String> days;
      Iterator<String> it ;
      Vector<String> dayNames = new Vector<String>();
      
      dayNames.add("Sunday");
      dayNames.add("Monday");
      dayNames.add("Tuesday");
      dayNames.add("Wednesday");
      dayNames.add("Thursday");
      dayNames.add("Friday");
      dayNames.add("Saturday");
      days = dayNames.elements();
      it = dayNames.iterator();
      
      System.out.println("Testing the Enumerator interface");
      
      while (days.hasMoreElements()) {
         System.out.println(days.nextElement()); 
      }
      
      System.out.println("Testing the Iterator interface");
      
      while(it.hasNext()) {
    	  System.out.println(it.next());
      }
      
   }
}