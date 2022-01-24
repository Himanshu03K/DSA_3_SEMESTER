package RECURTION;

/*
Q3. Write a program to find out and return the number of digits present in a number recursively.

Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
 */

import java.util.Scanner;

class DigitsPresent{
    public int count(int n,int c){
        if(n==0)
            return 1;
        return c+count(n/10,1);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x= sc.nextInt();
        DigitsPresent obj = new DigitsPresent();
        System.out.println(obj.count(x,0));
    }
}
