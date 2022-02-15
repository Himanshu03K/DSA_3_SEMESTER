package Array;
/*
Q. Write a program to remove consecutive duplicate elements in an array.

        Input values

        10 10 30 30 40 50 50 50 9 45

        Output

        10 30 40 50 9 45
 */

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after removal of duplicate elements are: ");
        for (int i = 0; i < size-1; i++) {
            if (arr[i] != arr[i+1]) {
                System.out.println(arr[i]);
            }
        }
        System.out.println(arr[size-1]);
    }
}
