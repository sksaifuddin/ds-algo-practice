class Fibonacci {
  
  public static int fibonacciSeries(int n) {
      if(n <= 1) {
          return n;
      }
      return (fibonacciSeries(n-1) + fibonacciSeries(n-2));
  }

  public static void main(String args[]) {
    int n = 5;
    int i=0;
    while(i < n) {
        System.out.println(fibonacciSeries(i));
        i++;
    }
  }
}