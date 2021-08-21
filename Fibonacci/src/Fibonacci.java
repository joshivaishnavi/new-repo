

import java.util.Scanner;

public class Fibonacci {
	

	public void fib() {
		
		int first = 0, second = 0, third = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of times :");
		int n = sc.nextInt();
		
		System.out.println("Fibonacci Series :");
		
		
		for(int i=0; i<n; i++) {
			
			first = second;
			second = third;
			third = first + second;
			System.out.println(first + "");
			
		}
		
	}
	
	
	public void stringReverseUsingReverse() {
		
		String str = "";
		StringBuilder str2 = new StringBuilder();
		
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println(str2);
		
	}
	
	
	public void stringReverseWithoutUsingReverse() {

		String str = "";
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		
		char chars[] = str.toCharArray();
		
		for(int i = chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		
		
	}
	
	public void swapWithoutThirdVariable() {
		int x,y;
		System.out.println("Enter x & y :");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("Before Swap :");
		System.out.println("x :: "+x+"\ty :: "+y);
		
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("After Swap :");
		System.out.println("x :: "+x+"\ty :: "+y);	
		
	}
	
	public void numberIsPrimeorNot() {
		
		int num, temp;
		boolean isPrime = true;
		
		System.out.println("Enter num :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i = 2; i<= num/2; i++) {
			
			temp = num%i;
			if(temp == 0) {
				isPrime = false;
				break;
			} 	
		}
		
		if(isPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
	}
	
	public void primeNumbersBetween100() {
		
		int n = 100, counter;
		
		for(n = 1; n <= 100; n++ )
		{
			counter = 0;
			for(int i = 2; i<= n/2; i++) {
			
		
			if(n%i == 0) {
				counter++;
				break;
			} 	
		}
			if(counter == 0 && n != 1) {
				System.out.println(n + " ");
			}
		}
		
	}
	
	public void stringOrNumberPalindromeorNot() {
		String original, reverse = "";
		System.out.println("Enter String or Number :");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i-- ) {
			reverse = reverse + original.charAt(i);
			
		}
		
		System.out.println("Reverse is :" +reverse);
		
		if(original.equals(reverse)) {
			System.out.println("String or Number is Palindrome :");
		} else {
			System.out.println("String or Number is not Palindrome :");
		}
		
		
	}
	
	public void duplicateCharacteresInString() {
		String str = new String("Saakkett");
		
		char chars[] = str.toCharArray();
		int count = 0;
		System.out.println("Duplicate characters are :");
		
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++ )
			{
				if(chars[i] == chars[j]) {
					System.out.println(chars[j]);
					count++;
					break;
				}
			}
		}
		System.out.println("Duplicate characters count is :"+count);
	}
	
	public void Armstrong() {
		
		int num, temp, rem, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		num = sc.nextInt();
		
		temp = num;
		
		while(num>0) {
			
			rem = num % 10;
			num = num/10;
			sum = sum + (rem*rem*rem);
		}
		
		if(temp == sum) {
			System.out.println("Armstrong number!");
			
		} else {
			System.out.println("Not Armstrong number!");
		}
		
	}
	
	public void removeWhiteSpacesUsingReplace() {
		
		String str1 = "Saket is Quality   Analyst";
		
		String str2 = str1.replaceAll("\\s", "");
		System.out.println(str2);
	}
	

	public void removeWhiteSpacesWithoutUsingReplace() {
		
		String str1 = "Saket is Quality   Analyst";
		char chars[] = str1.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < chars.length; i++) {
			if((chars[i] != ' ') && (chars[i] != '\t')) {
				sb.append(chars[i]);
			}
		}
		System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonacci fib = new Fibonacci();
//		fib.fib();
//		fib.stringReverseUsingReverse();
//		fib.stringReverseWithoutUsingReverse();
//		fib.swapWithoutThirdVariable();
//		fib.numberIsPrimeorNot();
//		fib.primeNumbersBetween100();
//		fib.stringOrNumberPalindromeorNot();
//		fib.duplicateCharacteresInString();
//		fib.Armstrong();
//      fib.removeWhiteSpacesUsingReplace();
		fib.removeWhiteSpacesWithoutUsingReplace();
	}

}
