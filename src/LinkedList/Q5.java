package LinkedList;

/*Q. Palindrome LinkedList

You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true
Sample Input 2 :
2
0 2 3 2 5 -1

 */

import java.util.Scanner;

public class Q5 {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
        }
    }

    public void addElement(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    public boolean checkPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node midstart = reverse(mid.next);

        Node start = head;
        while (midstart != null) {
            if (start.data != midstart.data) {
                return false;
            }
            start = start.next;
            midstart = midstart.next;
        }
        return true;
    }

    public Node findMid(Node head) {
        Node rabbit = head;
        Node turtle = head;
        while (rabbit.next != null && rabbit.next.next != null) {
            rabbit = rabbit.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public Node reverse(Node head) {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node next = temp.next;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5 obj = new Q5();
        int t = sc.nextInt();
        while (t-- > 0) {
            System.out.println("Enter the size of linked list :");
            int n = sc.nextInt();
            System.out.println("Enter the linked list you want to check : ");
            while (n-->0) {
                int a = sc.nextInt();
                obj.addElement(a);
            }
            System.out.println(obj.checkPalindrome(obj.head));
        }
    }
}
