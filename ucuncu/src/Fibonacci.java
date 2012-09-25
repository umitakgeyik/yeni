import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
    	System.out.print("enter a number : ");
    	int N = input.nextInt();
    	
        for (int i = 1; i <= N; i++)
            System.out.print(fib(i)+" ");
    }
    
    public static int fib(int n) {
        if (n <= 1) 
        	return n;
        else 
        	return fib(n-1) + fib(n-2);
    }

}


