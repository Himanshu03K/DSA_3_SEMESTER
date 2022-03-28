package BinaryTree.Traversals;

import BinaryTree.BinaryNode;
import BinaryTree.BinaryTree;

public class Preorder {
    public static void preorder(BinaryNode root){
        if(root == null) return;


        System.out.print(root.data+",");
        preorder(root.left);
        preorder(root.right);
    }



    public static void main(String[] args) {

        BinaryNode<Integer> T1= BinaryTree.insert();
        preorder(T1);
    }
}
