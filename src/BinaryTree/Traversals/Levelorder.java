package BinaryTree.Traversals;

import BinaryTree.BinaryNode;
import BinaryTree.BinaryTree;
import BinaryTree.HeightBT;

public class Levelorder {
    public static void PrintcurrentLevel(BinaryNode root,int level){
        if(root == null)
            return;

        if (level == 1)
            System.out.print(root.data+" ");

        else if (level > 1){
            PrintcurrentLevel(root.left,level-1);
            PrintcurrentLevel(root.right,level-1);
        }
    }

    public static void levelorder(BinaryNode root){
        int n= HeightBT.hight(root);
        for (int i = 1; i <= n; i++) {
            PrintcurrentLevel(root,i);
        }
    }

    public static void main(String[] args) {
        BinaryNode<Integer> T1= BinaryTree.insert();
        levelorder(T1);
    }
}
