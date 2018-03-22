package Badge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fraction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int positive = 0 , negative = 0 , zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] == 0) {
            	zero++;
            }else if(arr[arr_i] >0) {
            	positive++;
            }else
            	negative++;
        }
        System.out.println((float)positive/n);
        System.out.println((float)negative/n);
        System.out.println((float)zero/n);
        
    }
}
