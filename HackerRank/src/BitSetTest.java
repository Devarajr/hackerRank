

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitSetTest {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	 Scanner in = new Scanner(System.in);
    	 int n = in.nextInt();
    	 BitSet B1 = new BitSet(n);
    	 BitSet B2 = new BitSet(n);
    	 
    	 int t = in.nextInt();
    	 int i = 0 ;
    	 
    	 String op = "";
    	 int op1 = 0;
    	 int op2 = 0;
    	 
    	 for( i = 0 ; i < t ; i++) {
    		 op = in.next();
    		 op1 = in.nextInt();
    		 op2 = in.nextInt();
    		 switch (op) {
    		 	case "AND":{
    		 		if(op1 == 1 ) {
    		 			B1.and(B2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}else {
    		 			B2.and(B1);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}
    		 		break;
    		 	}
    		 	case "OR":{
    		 		if(op1 == 1 ) {
    		 			B1.or(B2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}else {
    		 			B2.or(B1);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}
    		 		break;
    		 	}
    		 	case "XOR":{
    		 		if(op1 == 1 ) {
    		 			B1.xor(B2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}else {
    		 			B2.xor(B1);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}
    		 		break;
    		 	}
    		 	case "FLIP":{
    		 		if(op1 == 1 ) {
    		 			B1.flip(op2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}else {
    		 			B2.flip(op2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}
    		 		break;
    		 	}
    		 	case "SET" :{
    		 		if(op1 == 1 ) {
    		 			B1.set(op2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}else {
    		 			B2.set(op2);
    		 			System.out.println(B1.cardinality() + " " + B2.cardinality());
    		 		}
    		 		break;
    		 	}
    		 	default :{
    		 		System.out.println("No matching case");
    		 		break;
    		 	}
    		 	
    		 }
    	 }
    	 in.close();
    }
}
