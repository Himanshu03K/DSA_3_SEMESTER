package BinaryTree;

public class HeightBT {
    public static int hight(BinaryNode root){
        if(root == null)
            return 0;

        return Math.max(hight(root.left),hight(root.right))+1;
    }

    public static void main(String[] args) {
        BinaryNode<Integer> T1=BinaryTree.insert();
        System.out.println(hight(T1));
    }
}
