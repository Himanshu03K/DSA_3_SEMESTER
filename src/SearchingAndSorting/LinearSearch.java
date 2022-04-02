package SearchingAndSorting;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc =null;
    static void LSearch(int []arr){

        System.out.println("Enter the element to be search");
        int x= sc.nextInt();
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                System.out.println(x +"found at index:- "+i);
                c=1;
                break;
            }
        }
        if(c==0){
            System.out.println("Element does not exits in given array");
        }
    }

    static void print(int []arr){

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        System.out.println("Enter te value of array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        LSearch(arr);
    }
}
