class ExponentOfNum {

  public static long power(int num, int pow) {
      if(pow == 0) {
          return 1;
      }
      return num * power(num, pow-1);
  }

  // driver method  
  public static void main(String args[]) {
    long result = power(6,2);
    System.out.println("power is " + result);
  }
}