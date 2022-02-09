package LinkedList;
/*
Q. In a sorted linked list (elements are sorted in ascending order), eliminate duplicates from the given linked list, such that output linked list contains only unique elements.

 */
import java.util.Scanner;

public class Q3 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public void addElement(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void removeDuplicate(){
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }

            curr.next = temp;
            curr = curr.next;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->"+" ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Q3 obj = new Q3();
        System.out.println("Enter the size of linked list : ");
        int n =sc.nextInt();
        for(int i=0;i<n;i++){
            int a =sc.nextInt();
            obj.addElement(a);
        }
        System.out.println("List before removing duplicates : ");
        obj.display();
        obj.removeDuplicate();
        System.out.println("list after removing duplicates : ");
        obj.display();
    }

}