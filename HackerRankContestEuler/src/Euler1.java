/*
 * This problem is a programming version of Problem 1 from projecteuler.net

If we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .

Find the sum of all the multiples of  or  below .

Input Format

First line contains  that denotes the number of test cases. This is followed by  lines, each containing an integer, .

Constraints

Output Format

For each test case, print an integer that denotes the sum of all the multiples of  or  below .

Sample Input 0

2
10
100
Sample Output 0

23
2318
Explanation 0

For , if we list all the natural numbers below  that are multiples of  or , we get  and . The sum of these multiples is .

Similarly for , we get .
 */

import java.util.*;


public class Euler1 {

	public Euler1() {
		// TODO Auto-generated constructor stub
	}
	
    public static long sumOfN(long n){
        return n*(n+1)/2;
    }
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
        	long t = in.nextInt() - 1;
        	 // no need to use floor it is implicit in java
            System.out.println( (3 * sumOfN(t/3)) +  (5 * sumOfN(t/5)) - (15 * sumOfN(t/15)) );
        }
        in.close();
        
    }



}
