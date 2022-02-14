package LinkedList;

/*Q. Enter a string from user and store each character of a string in different nodes of a linked list and print the values

Input :  neeraj

Output :  n -> e -> e -> r -> a -> j

 */

import java.util.Scanner;

public class PrintStringLL {
    Node head;
    static class Node{
        char data;
        Node next;
        Node(char data){
            this.data=data;
        }
    }

    public void addLast(char data){
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void display(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        PrintStringLL obj = new PrintStringLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to print : ");
        String str = sc.next();
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            obj.addLast(a);
        }
        obj.display();
    }
}