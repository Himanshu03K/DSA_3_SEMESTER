package RECURTION;

/*Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.

Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7


 */

import java.util.Scanner;

public class Q4 {
    public static int sumofArray(int arr[],int n,int sum,int i){
        if(n==0){
            System.out.println("Sum of elements is : ");
            return sum ;
        }
        int y=sum+arr[i];
        int x=sumofArray(arr,n-1,y,i+1);
        return x;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumofArray(arr,n,0,0));
    }
}
