package RECURTION;

/*Q5. Create an array of 5 elements with values {1,2,4,2,6}.search value 2 in the given array and print the first occurrence(index) of search value. Do it recursively
        The prototype of the method is as follows
public static int find(int arr[ ], int currentIndex, int search_value)
        {
        // set of statements;
        }

 */

import java.util.Scanner;

public class Q5 {
    public static int find(int arr[ ], int currentIndex, int search_value)
    {

        if(arr[currentIndex]==search_value ){
            return currentIndex;
        }
        int x=find(arr,currentIndex+1,search_value);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements of Array :");
        for(int i=0;i<5;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the value to find : ");
        int n= sc.nextInt();
        System.out.println("Index at which "+n+" is present : "+find(arr,0,n));

    }
}
