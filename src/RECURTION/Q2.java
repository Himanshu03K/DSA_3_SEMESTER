package RECURTION;

import java.util.Scanner;

/*
Q2. Write a program to print numbers from 1 to n in increasing order recursively.

Sample Input 1 :
 6
Sample Output 1 :
1 2 3 4 5 6
 */
class Number{

    public void printNumber(int x){
        if(x==1) {
            System.out.print(x+" ");
            return;
        }
        printNumber(x-1);
        System.out.print(x+" ");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number obj = new Number();
        obj.printNumber(n);
    }
}
