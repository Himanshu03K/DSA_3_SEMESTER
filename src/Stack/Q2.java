package Stack;
/*Reverse Stack

You have been given two stacks that can store integers as the data. Out of the two given stacks, one is populated and the other one is empty. You are required to write a function that reverses the populated stack using the one which is empty.
For Example:
Alt txt

Input Format :
The first line of input contains an integer N, denoting the total number of elements in the stack.

The second line of input contains N integers separated by a single space, representing the order in which the elements are pushed into the stack.
Output Format:
The only line of output prints the order in which the stack elements are popped, all of them separated by a single space.
Note:
You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input stack itself.
Constraints:
1 <= N <= 10^3
-2^31 <= data <= 2^31 - 1

Time Limit: 1sec
Sample Input 1:
6
1 2 3 4 5 10
Note:
Here, 10 is at the top of the stack.
Sample Output 1:
1 2 3 4 5 10
Note:
Here, 1 is at the top of the stack.
Sample Input 2:
5
2 8 15 1 10
Sample Output 2:
2 8 15 1 10

 */
import java.util.Scanner;
import java.util.Stack;

public class Q2 {

    public static void addBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        addBottom(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverse(s);
        addBottom(s,top);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        System.out.println("Enter the number of Elements in a Stack");
        int num = sc.nextInt();
        System.out.println("Enter the elements of the Stack :- ");
        for(int i=0;i<num;i++){
            int a=sc.nextInt();
            s.push(a);
        }
        reverse(s);
        System.out.println("Reversed Stack :- ");
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
}