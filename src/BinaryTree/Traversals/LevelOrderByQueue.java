//package BinaryTree.Traversals;
//
//import BinaryTree.BinaryNode;
//import BinaryTree.BinaryTree;
//import Queue.PriorityQueuewithLinkedList.Node;
//
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class LevelOrderByQueue {
//    public static void PrintLevelOrder(BinaryNode root){
//        QueueByLLGeneric<> q= new QueueByLLGeneric<>();
//        q.add(root);
//
//        while (!q.isEmpty()){
//            BinaryNode cur = q.poll();
//            System.out.print(cur.data+" ");
//
//            if (cur.left != null)
//                q.add(cur.left);
//            if(cur.right != null)
//                q.add(cur.right);
//        }
//    }
//
//    public static void main(String[] args) {
//        BinaryNode<Integer> T1= BinaryTree.insert();
//        PrintLevelOrder(T1);
//    }
//}

