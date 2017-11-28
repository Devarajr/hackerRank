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
	
    public static int sum(int x){
        
        int i = 1, result = 0;

        for ( i = 1 ; i < x ; i++)
            if((i%3 == 0) || ( i%5 ==0))
               result += i; 

        return result;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++)
            System.out.println(sum(in.nextInt()));
        in.close();
        
    }



}
