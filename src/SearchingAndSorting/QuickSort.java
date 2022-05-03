package SearchingAndSorting;

import java.util.Scanner;

public class QuickSort {

    static int arr[];

//    public static void insert(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the size of Array ");
//        int n= sc.nextInt();
//        arr=new int[n];
//        System.out.println("Enter the element of Array ");
//        for (int i=0;i<n;i++)
//            arr[i]= sc.nextInt();
//    }

    public static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int Partition(int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;

        while(i<j){
            while (arr[i] <= pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if(i < j)
                swap(i,j);
        }
        swap(j,l);
        return j;
    }

    public static void QuickS(int l,int h){
        if(l < h){
            int pivot = Partition(l,h);
            QuickS(l,pivot-1);
            QuickS(pivot+1 , h);
        }
    }

    public static void print(){
        for (int i:arr)
            System.out.print(i+ " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //insert();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array ");
        int n= sc.nextInt();
        arr=new int[n];
        System.out.println("Enter the element of Array ");
        for (int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        QuickS(0 , n-1);
        print();
    }
}
