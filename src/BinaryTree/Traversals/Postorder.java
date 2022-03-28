package BinaryTree.Traversals;

import BinaryTree.BinaryNode;
import BinaryTree.BinaryTree;

public class Postorder {
    public static void postorder(BinaryNode root){
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+",");

    }



    public static void main(String[] args) {

        BinaryNode<Integer> T1= BinaryTree.insert();
        postorder(T1);
    }
}
