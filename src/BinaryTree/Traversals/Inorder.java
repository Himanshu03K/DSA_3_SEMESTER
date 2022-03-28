package BinaryTree.Traversals;

import BinaryTree.BinaryNode;
import BinaryTree.BinaryTree;

public class Inorder {
    static void inoreder(BinaryNode root){
        if(root == null) return;

        inoreder(root.left);
        System.out.print(root.data+",");
        inoreder(root.right);
    }

    public static void main(String[] args) {

        BinaryNode<Integer> T1=BinaryTree.insert();
        inoreder(T1);
    }
}
