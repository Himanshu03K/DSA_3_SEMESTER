package SearchingAndSorting;

import java.util.Scanner;

public class Selection {
    // Selection Sort
    static void SSort(int []arr) {
        int temp, index = 0, c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (temp > arr[j]) {
                    temp = arr[j];
                    index = j;
                    c = 1;
                }
            }
            if (c == 1) {
                arr[index] = arr[i];
                arr[i] = temp;
                c = 0;
            }
        }
        System.out.println("Sort using Selection Sort ");
        print(arr);
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
        SSort(arr);

    }
}
