package Array;

/*
Q. Mr Raman is having two unsorted arrays with names myarr1 and myarr2. They can be of any size.
They may contain duplicate values also. Raman wants for each element in myarr1[ ] to count elements greater than or equal to it in array myarr2[].

        Example

        Imagine the size of both the arrays are 5

        myarr1[]  values  {3,4,1,2,2}
        myarr2[] values  {1,2,1,3,1}

        Output :
        1,0,5,2,2

 */


import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int[] myarr1 = new int[5];
        int[] myarr2 = new int[5];
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of arr1: ");

        for(int i=0;i<5;i++){
            myarr1[i]= sc.nextInt();
        }
        System.out.println("Enter the elements of arr2: ");
        for(int i=0;i<5;i++){
            myarr2[i]= sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(myarr1[i]<=myarr2[j]){
                    count++;
                }
            }
            System.out.println(count);
            count =0;
        }
    }
}