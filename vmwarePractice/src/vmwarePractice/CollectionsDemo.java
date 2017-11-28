package vmwarePractice;

import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      Map<String, Integer> m1 = new HashMap<String,Integer>(); 
      m1.put("Zara", new Integer("8"));
      m1.put("Mahnaz", new Integer("31"));
      m1.put("Ayan", new Integer("12"));
      m1.put("Daisy", new Integer("14"));

      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);

      for(Iterator <Map.Entry<String, Integer>> it = m1.entrySet().iterator(); it.hasNext();) {
    	  Map.Entry<String,Integer> me = it.next();
    	  System.out.println("Key :" + me.getKey() + " \t Value : " + me.getValue());
      }

   }
}