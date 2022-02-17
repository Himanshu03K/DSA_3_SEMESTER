package Array;

/*Q. Write a program to input the elements of a two- dimensional array. Then from this array, make two arrays one that stores all odd elements of the two-dimensional array and the other that stores all even elements of the array. 
        Note:-  Resulting arrays will be of ArrayList type

*/
import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows and columns in array: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ArrayList<Integer> even = new ArrayList<>();
        System.out.println("even elements are : ");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]%2 ==0){

                    even.add(arr[i][j]);
                }
            }
        }
        System.out.println(even);
        ArrayList<Integer> odd = new ArrayList<>();
        System.out.println("Odd elements are :");
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]%2 !=0){
                    odd.add(arr[i][j]);
                }
            }
        }
        System.out.println(odd);
    }
}
