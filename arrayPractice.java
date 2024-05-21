package javaPractice;

import java.util.*;

public class arrayPractice{
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int largest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static int binarySearch(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public static void printPairs(int arr[]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are :- "+  count);
    }
    public static int maxSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            
            for(int j = i; j < arr.length; j++){
                int curSum = 0;
                for(int k = i; k <= j; k++){
                    curSum += arr[k];
                }
                if(curSum>maxSum){
                    maxSum = curSum;
                }
            }
        }
        return maxSum;
    }
    public static void main(String args[]){
        System.out.print("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the Number for "+ (i + 1) + " index");
            arr[i] = sc.nextInt();
        }
        
        printArr(arr);
        reverse(arr);
        printArr(arr);
        System.out.println("The largest number in this array is " + largest(arr));
        System.out.println("Enter the value you want to search");
        int key = sc.nextInt();
        System.out.println("The " + key + " is found at " + binarySearch(arr,key) + " place");
        printPairs(arr);
        System.out.println("Maximum sum is " + maxSum(arr));
    }
}