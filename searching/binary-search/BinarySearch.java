import java.util.*;
import java.io.*;

public class BinarySearch {
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
    public static void main(String args[]) {
        FastReader sc=new FastReader();
        int t = sc.nextInt();
        int arr[] = new int[t];
        for (int testCase = 0; testCase < t; testCase++) { 
          // start test case from here
          arr[testCase] = sc.nextInt();
        }
        int res = binarySearch(arr, 2);
        System.out.println("res"+ res);
    }

    public static int binarySearch(int arr[], int ele) {
        System.out.println("ele"+ele);
        int low = 0; int high = arr.length-1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == ele) {
                return mid;
            } else if(arr[mid] > ele) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}