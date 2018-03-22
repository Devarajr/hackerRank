/*
https://www.hackerrank.com/challenges/java-anagrams/problem
Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
*/

import java.io.*;
import java.util.*;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
    	char a1[] = a.toCharArray();
    	char b1[] = b.toCharArray();
    	
    	Map<String,Integer> mp = new HashMap<String,Integer>();
    	Map<String,Integer> mp2 = new HashMap<String,Integer>();
    	
    	int len1 = a1.length;
    	int len2 = b1.length;
    	
    	if(len1 != len2) {
    		return false;
    	}else {
    		for(int i = 0 ; i < len1 ; i++) {
    			if ( (int)a1[i] >= 97 ) {
    			 a1[i]= (char)( (int) a1[i] - 32 );
    			}
    			if ( (int)b1[i] >= 97 ) {
       			 b1[i]= (char)( (int) b1[i] - 32 );
       			}
    			
    			String x = Character.toString(a1[i]);
    			String y = Character.toString(b1[i]);
    			
    			if(mp.containsKey(x)) {
    				mp.put(x,mp.get(x)+1);
    			}else {
    				mp.put(x,1 );
    			}
    			
    			if(mp2.containsKey(y)) {
    				mp2.put(y,mp2.get(y)+1);
    			}else {
    				mp2.put(y,1 );
    			}
    		}
    		return(mp.equals(mp2));

    	}

    }
    
    public static void main(String args[]) {
    	boolean flag = false;
    	Scanner sc = new Scanner(System.in);
    	flag = isAnagram(sc.nextLine(),sc.nextLine());
		if(flag)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
    	sc.close();
    }
}
