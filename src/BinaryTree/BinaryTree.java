package BinaryTree;

import java.util.Scanner;

public class BinaryTree{
    static Scanner sc = new Scanner(System.in);
    public static void Print(BinaryNode root){
        if(root == null)
            return;
        System.out.println(root.data);
        System.out.println("|");
        Print(root.left);
        Print(root.right);
    }

    public static BinaryNode insert(){
//        System.out.println("Enter the choice \t enter 1 to insert element in left \t Enter 2 to insert element in Right\t");
//        int c=sc.nextInt();
//        switch (c){
//            case '1':{
//                System.out.println("Enter the element ");
//                BinaryNode<Integer> s= new BinaryNode<>(sc.nextInt());
//                t.left=s;
//            }
//            case '2':{
//                System.out.println("Enter the element");
//                BinaryNode<Integer> s= new BinaryNode<>(sc.nextInt());
//                t.right=s;
//            }
//            default:{
//
//            }
//        }
        BinaryNode root=null;
        System.out.println("Enter the element: ");
        int ele = sc.nextInt();

        if(ele == -1) return null;

        root=new BinaryNode(ele);
        System.out.println("Enter left element for "+ele);
        root.left=insert();

        System.out.println("Enter right element for "+ele);
        root.right=insert();

        return root;
    }

    public static void main(String[] args) {
//        BinaryNode<Integer> root= new BinaryNode<>(15);
//        BinaryNode<Integer> Rleft= new BinaryNode<>(16);
//        BinaryNode<Integer> Rright = new BinaryNode<>(18);
//        root.left=Rleft;
//        root.right=Rright;
        BinaryNode<Integer> root=insert();
        Print(root);
    }
}
