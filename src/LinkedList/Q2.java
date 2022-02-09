package LinkedList;

import java.util.Scanner;

/*For a given singly linked list of integers, find and return its length. Do it using an iterative method.
        Input format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

        First and the only line of each test case or query contains elements of the singly linked list separated by a single space.
        Remember/Consider :
        While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
        Output format :
        For each test case, print the length of the linked list.

        Output for every test case will be printed in a separate line.
        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^5
        Time Limit: 1 sec
        Sample Input 1 :
        1
        3 4 5 2 6 1 9 -1
        Sample Output 1 :
        7
        Sample Input 2 :
        2
        10 76 39 -3 2 9 -23 9 -1
        -1
        Sample Output 2 :
        8
        0

 */
public class Q2 {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public void add(int data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    public int length() {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of testcases");
        int t = sc.nextInt();
        while (t-- > 0) {
            Q2 obj = new Q2();
            System.out.println("Enter the elements of linked list : ");
            int a=0;
            while(a!=-1) {
                a= sc.nextInt();
                obj.add(a);
            }
            int length = obj.length();
            System.out.println("Length is : " + (length-1));
        }
    }
}