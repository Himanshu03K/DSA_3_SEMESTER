package SearchingAndSorting;

import java.util.Scanner;

public class Bubble {

    static void print(int []arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void BSort(int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    arr[j]=arr[j] ^ arr[j+1];
                    arr[j+1]=arr[j] ^ arr[j+1];
                    arr[j]=arr[j] ^ arr[j+1];
                }
            }
        }
        System.out.println("Sort using Bubble Sort ");
        print(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        System.out.println("Enter te value of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BSort(arr);
    }
}
