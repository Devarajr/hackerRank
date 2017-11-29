/*
 * This problem is a programming version of Problem 2 from projecteuler.net

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
Constraints

Output Format

Print the required answer for each test case.

Sample Input 0

2
10
100
Sample Output 0

10
44
Explanation 0

For , we have , sum is .
For , we have , sum is .
 */

import java.util.*;

public class Euler2 {

	public Euler2() {
		// TODO Auto-generated constructor stub
	}

	public static long fibEven(long n) {
		long sum = 0, fib = 0,i = 0;

		while(fib <= n) {
			 fib = fib(++i); 
			 if(fib%2 ==0) sum += fib;
		}

		return sum;
	}
	
	public static long fib(long n) {
		long fib = 0;
		if(n==1) {
			fib = 1;
		}else if(n==2) {
			fib = 2;
		}else {
			fib = fib(n-1) + fib(n-2);
		}
		return fib;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
        	int n = in.nextInt();
            System.out.println(fibEven(n));
            
        }
    }
	
}