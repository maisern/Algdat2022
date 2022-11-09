package Ukeoppgaver42;

import java.util.ArrayDeque;

public class NivaTraversering {
    static class BinaryTreeNode{
        char value;
        BinaryTreeNode left_child;
        BinaryTreeNode right_child;

        BinaryTreeNode(char value){
            this.value = value;
            this.left_child = null;
            this.right_child = null;


        }

        BinaryTreeNode addLeftChild(char value){
            this.left_child = new BinaryTreeNode(value);
            return this.left_child;
        }

        BinaryTreeNode addRightChild(char value){
            this.right_child = new BinaryTreeNode(value);
            return this.right_child;
        }

        public static void main(String[] args) {
            BinaryTreeNode root = new BinaryTreeNode('A');

            BinaryTreeNode b = root.addLeftChild('B');
            BinaryTreeNode c = root.addRightChild('C');

            BinaryTreeNode d = b.addLeftChild('D');
            BinaryTreeNode e = b.addRightChild('E');
            BinaryTreeNode f = e.addLeftChild('F');

            printLevelOrder(root);


        }

        static void printLevelOrder(BinaryTreeNode root){

            ArrayDeque<BinaryTreeNode> queue = new ArrayDeque<BinaryTreeNode>();
            queue.addLast(root);

            while (!queue.isEmpty()){
                BinaryTreeNode current = queue.removeFirst();

                if(current.left_child != null){
                    queue.addLast(current.left_child);
                }
                if(current.right_child != null){
                    queue.addLast(current.right_child);
                }
                System.out.println(current.value + " ");
            }
        }


    }

}
