package Ukeoppgaver42;

import org.w3c.dom.Node;

import java.util.ArrayDeque;

public class BinaryTree {
    static class BinaryTreeNode{
        char value;
        BinaryTreeNode left_child;
        BinaryTreeNode right_child;

        BinaryTreeNode(char value){
            this.value=value;
            this.left_child=null;
            this.right_child=null;

        }

        BinaryTreeNode add_left_child(char value){
            this.left_child= new BinaryTreeNode(value);
            return this.left_child;
        }

        BinaryTreeNode add_right_child(char value){
            this.right_child= new BinaryTreeNode(value);
            return this.right_child;
        }

        //rekursiv
        static void printPostOrder(BinaryTreeNode node){
            if(node==null){
                return;
            }

            printPostOrder(node.left_child);
            printPostOrder(node.right_child);
            System.out.println(node.value + " ");
        }

        static void printDepthFirstNonRecursive(BinaryTreeNode root){
            ArrayDeque<BinaryTreeNode> stack = new ArrayDeque<BinaryTreeNode>();

            stack.addLast(root);

            while (!stack.isEmpty()) {
                BinaryTreeNode current = stack.removeLast();

                if (current.right_child != null) {
                    stack.addLast(current.right_child);
                }
                if (current.left_child != null) {
                    stack.addLast(current.left_child);

                }

                System.out.println(current.value + " ");
            }
        }

        public static void main(String[] args) {


            BinaryTreeNode root = new BinaryTreeNode('A');

            BinaryTreeNode b = root.add_left_child('B');
            BinaryTreeNode c = root.add_right_child('C');

            BinaryTreeNode d = b.add_left_child('D');
            BinaryTreeNode e = b.add_right_child('E');

            BinaryTreeNode f = c.add_left_child('F');
            BinaryTreeNode g = c.add_right_child('G');

            printPostOrder(root);
            printDepthFirstNonRecursive(root);
        }
    }
}
