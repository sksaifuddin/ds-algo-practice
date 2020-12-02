// Finding a collection of elements in a sorted array
// Previously we applied a binary search to find one element in a sorted array. In some cases, however, you might need to perform not only one but several such search queries. Here, you need to implement an extended version of binary search that will allow you to search not only for one element but also for a collection of elements in a sorted array.

// Your task is to write a program that performs a search for a collection of numbers in a sorted array.

// Input: the first line contains one integer n such that 1≤n≤105. The second line contains an array of n natural numbers, each not exceeding 109. The array is sorted in ascending order. The third line contains one integer k such that 1≤k≤105. The fourth line contains an array of k natural numbers, each not exceeding 109.

// Output: for each number from the second array, output the index of this number in the first array. If some number is not presented in the first array, output −1.

// In this problem, the array indexing is assumed to be started from 1.


// Sample Input:
// 5
// 1 5 8 12 13
// 5
// 8 1 23 1 11

// Sample Output:
// 3 1 -1 1 -1

import java.util.*;
import java.io.*;

public class BinarySearchCollection {
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
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i =0 ; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
         
        int[] arr2 = new int[size2];
        for(int i =0 ; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = new int[size2];
        for(int i =0 ; i < arr2.length; i++) {
            int index = binarySearch(arr1, arr2[i]);
            if(index != -1) {
                res[i] = ++index;
            } else {
                res[i] = index;
            }
        }

        for(int i =0 ; i < arr2.length; i++) {
            System.out.print(res[i]+ " ");
        }
        
    }

    public static int binarySearch(int arr[], int ele) {
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