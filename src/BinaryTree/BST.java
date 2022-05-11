package BinaryTree;

import java.util.Scanner;
// Check Binary Search Tree
public class BST {
    public static BinaryNode<Integer> root;
    static Scanner sc =null;
    public static void Insert(){

       //new Scanner(System.in);
        System.out.println("Enter the element of BST");
        int t= sc.nextInt();
        if(t==-1)
            return;
        BinaryNode<Integer> node= new BinaryNode<Integer>(t);
        if(root == null)
        {
            root= node;
            return;
        }
        else {
            BinaryNode<Integer> cur=root;
            BinaryNode<Integer> Parent=null;

            while(true){
                Parent=cur;
                if(node.data < cur.data){
                    cur=cur.left;
                    if(cur==null){
                        Parent.left=node;
                        return;
                    }
                }

                else {
                    cur=cur.right;
                    if(cur == null){
                        Parent.right=node;
                        return;
                    }
                }
            }
        }
    }

    public static void inoreder(BinaryNode root){
        if(root == null) return;

        inoreder(root.left);
        System.out.print(root.data+",");
        inoreder(root.right);
    }

    public static void SmallestinLeft(BinaryNode node){
        if(root == null)
        {
            return;
        }
        if(root.left== null && root.right==null) {
            System.out.println(root.data);
            return;
        }
        if(root.left!=null)
        SmallestinLeft(root.left);
        if (root.right!=null)
        SmallestinLeft(root.right);
        //System.out.println(root.data);
    }
    public static boolean checkBST(BinaryNode<Integer> node){
        if(node == null)
            return false;
        if(node.data > node.left.data && node.data< node.right.data)
            return true;

        checkBST(node);
        checkBST(node.right);
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements in BST");
        sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            Insert();
        }
        inoreder(root);
        //System.out.println("Smallest in left subtree");
        //SmallestinLeft(root.left);
        if(checkBST(root))
            System.out.println("Tree is BST");
        else
            System.out.println("Tree is not Not BST");
    }
}
