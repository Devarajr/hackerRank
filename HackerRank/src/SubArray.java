/*
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 * We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array . 
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation

There are nine negative subarrays of :

Thus, we print  on a new line.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    int[] arr = new int[length];

    int first = sc.nextInt();
    arr[0] = first;
    int count = first < 0 ? 1 : 0;

    for (int i = 1; i < length; i++){
        int num = sc.nextInt();
        arr[i] = arr[i - 1] + num;

        if (arr[i] < 0){
            count++;
        }

        for (int j = 0; j < i; j++){
            int sub_result = arr[i] - arr[j];
            if (sub_result < 0){
                count++;
            }
        }
    }

    System.out.print(count);
    }
}
