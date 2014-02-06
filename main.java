/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Mandy
 */
public class main {

    public static void display(ArrayList<LinkedList<Node>> node) {
        for (Iterator<LinkedList<Node>> it = node.iterator(); it.hasNext();) {
            System.out.println("");
            LinkedList<Node> l = it.next();
            {

                for (Node n : l) {
                    System.out.print(n.getData() + " ");
                }
            }
            //tree.displayInorder(tree.getRoot());
        }



    }

    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.insert(244);
        tree.insert(1012);
        tree.insert(32);
        tree.insert(22);
        tree.insert(9);
        tree.insert(10);
        System.out.println("Normal Tree using Layered Link List");

        ArrayList<LinkedList<Node>> node = tree.getLinkList();
        display(node);
      /*  System.out.println("Tree after Mirror image:");
       Node current=new Node();
       current=tree.root; 
        tree.mirror(current);

         tree.print(tree.root);
         tree.mirror(current);
         tree.print(tree.root);
        ArrayList<LinkedList<Node>> node1 = tree.getLinkList();
        display(node1);*/

       /* boolean b = tree.isPath(tree.root, 33);
        if (b) {
            System.out.println("Path Exists:");
        } else {
            System.out.println("No Path Exists");
        }
        int bArray[] = new int[1000];*/
        // prints out all of its root-to-leaf paths, one per line
        System.out.println("No Path Exists");
        tree.delete(22);
        display(node);
       /* tree.printPath(bArray, tree.root, 0);

        Tree tree2 = new Tree();
        tree2.insert(5);
        tree2.insert(3);
        tree2.insert(10);
        tree2.insert(2);
        tree2.insert(1);
        tree2.insert(7);
        tree2.insert(12);

        tree2.printPath(bArray, tree2.root, 0);

        System.out.println("Original Tree:");
        tree.print(tree.getRoot());
        System.out.println("New Tree:");
        tree2.print(tree.getRoot());
        boolean bol = tree.checksameTrees(tree.getRoot(), tree2.getRoot());
        if (bol) {
            System.out.println("Two trees are same");
        } else {
            System.out.println("Two trees are not same: ");
        }
        System.out.println();
        System.out.println("Preorder");
        tree.displayPreOrder(tree.getRoot());
        System.out.println();
        System.out.println("Postorder");
        tree.displayPostOrder(tree.getRoot());
        // tree.delete(9);
        System.out.println("After deleting Inorder");
        tree.displayInorder(tree.getRoot());
        System.out.println();
        System.out.println("Preorder");
        tree.displayPreOrder(tree.getRoot());
        System.out.println();
        System.out.println("Postorder");
        tree.displayPostOrder(tree.getRoot());
        //Height
        System.out.println("\n Height of tree is :" + tree.claculateHeight(tree.getRoot()));
        //Balanced tree
        if (tree.isBalanced(tree.getRoot())) {
            System.out.println("\nTree is balanced");
        }
        System.out.println("\nTree is unbalanced");
        int a[] = {10, 20, 30, 50, 200};
        Node tre = Tree.createBTree(a, 0, 4);
        Tree t = new Tree();
        t.setRoot(tre);
        t.displayInorder(tre);

        //Checking for Is Binary search Tree.

        boolean isBST = tree.isOptimalBinarySearchTree(tree.getRoot(), 0, 1000);
        if (isBST) {
            System.out.println("Is a Binary Search Tree");
        } else {
            System.out.println("Is Not a Binary Search Tree");
        }
        //Method 2:


        boolean isIBST = tree.isInorderBST(tree.getRoot(), Integer.MIN_VALUE);
        if (isIBST) {
            System.out.println("Is a Binary Search Tree");
        } else {
            System.out.println("Is Not a Binary Search Tree");
        }

        int number = tree.combinations(4);
        System.out.println("Number of combinations=" + number);
    }*/
}
}
