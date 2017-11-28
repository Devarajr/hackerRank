/*
 * Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

US: formattedPayment
India: formattedPayment
China: formattedPayment
France: formattedPayment
where  is  formatted according to the appropriate Locale's currency.

Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).

Input Format

A single double-precision number denoting .

Constraints

Output Format

On the first line, print US: u where  is  formatted for US currency. 
On the second line, print India: i where  is  formatted for Indian currency. 
On the third line, print China: c where  is  formatted for Chinese currency. 
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
Explanation

Each line contains the value of  formatted according to the four countries' respective currencies.
 */

/****************************************CODE SOLUTION STARTS HERE ***********************************************************************************/

/**
 * 
 */
import java.util.*;
import java.text.*;
/**
 * @author drajago
 *
 */
public class CurrencyFormatter {

	/**
	 * 
	 */
	public CurrencyFormatter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();

	        // Write your code here.

			Locale US = new Locale("en", "US");
			Locale France = new Locale("fr", "FR");
			Locale China = new Locale("zh","CN");
			Locale India = new Locale("en","IN");
			
			NumberFormat USFormat = NumberFormat.getCurrencyInstance(US);
			NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(India);
			NumberFormat ChinaFormat = NumberFormat.getCurrencyInstance(China);
			NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(France);

	        
	        System.out.println("US: " + USFormat.format(payment));
	        System.out.println("India: " + IndiaFormat.format(payment));
	        System.out.println("China: " + ChinaFormat.format(payment));
	        System.out.println("France: " + FranceFormat.format(payment));

	}

}
