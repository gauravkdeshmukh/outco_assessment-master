/**
 *
 * Problem: nth Fibonacci number
 *
 * Write two functions that return the nth Fibonacci number
 * using dynamic programming
 *
 * In your first implementation, implement a top-down 
 * approach using memoization. In your secon implementation, 
 * implement a bottom-up approach using tabulation
 *
 * Your functions should be able to handle finding the 1000th
 * Fibonacci number
 * 
 */

public class fibonacci {
  public static void main(String args[]) {
    TopDown prob1 = new TopDown();
    prob1.fib(1000);

    Bottomup prob2 = new Bottomup();
    prob2.fib(1000);
  }
}

class TopDown {
  public fib(n){
    // your work here
	return (n==1)? 1 : fib(n-1) + fib(n-2);
	
  }
}

class BottomUp {
  public fib(n){
    // your work here
  }
}





