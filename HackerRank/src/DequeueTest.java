/*
 * In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();
You can find more details about Deque here.

In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

Note: Time limit is  second for this problem.

Input Format

The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

Constraints




The numbers in the array will range between .

Output Format

Print the maximum number of unique integers among all possible contiguous subarrays of size .

Sample Input

6 3
5 3 5 2 3 2
Sample Output

3
Explanation

In the sample testcase, there are 4 subarrays of contiguous numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

 - Has  unique numbers.

In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .
 */

/****************************************CODE SOLUTION STARTS HERE ***********************************************************************************/

    import java.util.*;
    public class DequeueTest {
        
        public static int uniqueNumbers(Deque<Integer> d){
            Set<Integer> set = new HashSet<Integer>();
            set.addAll(d);
            return set.size();
        }
        
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<Integer>();
            
            int maxUnique = 1;
            int tempMaxUnique = 1;
            int nextElement = 0 ;
            int removedElement = 0 ;
            
            int n = in.nextInt();
            int m = in.nextInt();
            
            for(int j = 0 ; j < m ; j++) {
            	deque.addLast(in.nextInt());
            }
            
            maxUnique = uniqueNumbers(deque);
            
            int i = 1;
            while(i < (n -m)){
            	if(maxUnique == m )
            		break; 
            	
            	removedElement = deque.removeFirst();
            
            	nextElement = in.nextInt();
            	
            	i++;
            	
            	if(!deque.contains(removedElement)) {
            		deque.addLast(nextElement);
            		continue;
            	}
             			
            	if(deque.contains(nextElement)) {
            		deque.addLast(nextElement);
            		continue;
            	}else {
            		deque.addLast(nextElement);
            	}
            	
            	
            		
            	
            	tempMaxUnique = uniqueNumbers(deque);
            	if(tempMaxUnique > maxUnique )
            		maxUnique = tempMaxUnique;
              
            }
            
            System.out.println(maxUnique);
            
        }
    }


