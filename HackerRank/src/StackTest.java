/*
https://www.hackerrank.com/challenges/java-stack/problem
In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a collection of elements, with two principal operations: push, which adds an element to the collection, and pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]
Sample Output

true
true
false
true
*/
import java.util.*;
class StackTest{
   
   public static void main(String []args)
   {
      Scanner sc = new Scanner(System.in);
      boolean flag = true;

      while (sc.hasNext()) {
         String input=sc.next();
         List<String> ls = new ArrayList<String>();
         Stack<String> st = new Stack<String>();
         
         ls.addAll(Arrays.asList(input.split("")));
      
	      for(String s : ls) {
	    	  if(s.equals("(") || s.equals("{") || s.equals("[") ) {
	    		  st.push(s);
	    	  }else if(s.equals(")") || s.equals("}") || s.equals("]")){
	    		  if( (!st.empty()) && 
	    			    ((st.peek().equals("(") && s.equals(")")) || 
	    				 (st.peek().equals("{") && s.equals("}")) || 
	    				 (st.peek().equals("[") && s.equals("]"))
	    				 ) 
	    			){ 
	    			  st.pop();
	    		  }
	    		  else {
	    			  flag = false;
	    		  }
	    	  }
	      }
	      if(flag)
	    	  System.out.println(st.empty());
	      else {
	    	  System.out.println(flag);
	    	  flag = true ; // reset the flag for next set
	      }
	      
      }
      sc.close();
   }
}

