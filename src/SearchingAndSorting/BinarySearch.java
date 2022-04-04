package SearchingAndSorting;

import java.util.Scanner;

public class BinarySearch {
    public static void BinSearch(int arr[]){
        int n= arr.length;;
        int beg=0,end= n-1;
        if(beg<=end)
        {
            int mid=(beg+end)/2;
            if(n==arr[mid])
            {
                System.out.println(arr[mid]+"  -->  Found at index  -->  "+mid);
                System.exit(0);
            }
            if(n>arr[mid])
                beg=mid+1;
            if(n<arr[mid])
                end=mid-1;
            BinSearch(arr);
        }
        else
            System.out.println("Element not found");
    }
    static void print(int []arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        BinSearch(arr);
    }

}
