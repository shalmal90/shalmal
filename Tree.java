/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Mandy
 */
public class Tree {

    Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    //Finding a Node based on a key
    public Node find(int key) {
        Node current = root;
        while (current.getData() != key) {
            if (key < current.getData()) {
                current = current.getLchild();
            } else {
                current = current.getRchild();
            }
            if (current == null) {
                return null;
            }
        }
        return current;
    }
//Inserting an element without recursion

    public void insert(int key) {
        Node newNode = new Node();
        newNode.setData(key);
        Node parent, current;
        if (root == null) {
            root = newNode;
        } else {
            current = root;
            while (true) {
                parent = current;
                if (key < current.getData()) {
                    current = current.getLchild();
                    if (current == null) {
                        parent.setLchild(newNode);
                        return;
                    }
                } else {
                    current = current.getRchild();
                    if (current == null) {
                        parent.setRchild(newNode);
                        return;
                    }
                }

            }//while

        }//else

    }//

    //Inserting an element with recursion
    public Node recursiveInsert(Node root, int key) {
        Node newNode = new Node();
        newNode.setData(key);
        if (root == null) {
            root = newNode;
        } else {
            if (key <= root.getData()) {
                root.setLchild(recursiveInsert(root.getLchild(), key));
            } else {
                root.setRchild(recursiveInsert(root.getRchild(), key));
            }

        }

        return root;
    }

    //Creating a Balanced Binary Tree using array 
    public static Node createBTree(int a[], int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        Node base = new Node();
        base.setData(a[mid]);
        base.setLchild(createBTree(a, start, mid - 1));
        base.setRchild(createBTree(a, mid + 1, end));

        return base;
    }

 /*   //Display in Inorder
    public void displayInorder(Node localRoot) {
        //System.out.println("InOrder");
        if (localRoot != null) {
            displayInorder(localRoot.getLchild());
            System.out.print(localRoot.getData() + " ");
            displayInorder(localRoot.getRchild());
        }
    }

    //Display in Postorder
    public void displayPreOrder(Node localRoot) {
        //System.out.println("PreOrder");
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            displayInorder(localRoot.getLchild());
            displayInorder(localRoot.getRchild());
        }
    }

    //Display in Preorder
    public void displayPostOrder(Node localRoot) {
        // System.out.println("PostOder");
        if (localRoot != null) {
            displayInorder(localRoot.getLchild());
            displayInorder(localRoot.getRchild());
            System.out.print(localRoot.getData() + " ");
        }
    }*/

    //Find Minimum Node
    /*public Node minimum() // returns node with minimum key
    {
        Node current, last = null;
        current = root; // start at root
        while (current != null) // until the bottom,
        {
            last = current; // remember node
            current = current.getLchild(); // go to left child
        }
        return last;
    }
//Find Maximum Node

    public Node maximum() // returns node with minimum key
    {
        Node current, last = null;
        current = root; // start at root
        while (current != null) // until the bottom,
        {
            last = current; // remember node
            current = current.getRchild(); // go to left child
        }
        return last;
    }
*/
    //To Delete a Node
    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        while (current.getData() != key) {
            parent = current;
            if (key < current.getData()) {
                current = current.getLchild();
                isLeftChild = true;
            } else {
                current = current.getRchild();
                isLeftChild = false;
            }
            if (current == null) {
                return false;//not found in the tree
            }
        }//while
        if (current.getLchild() == null && current.getRchild() == null) {//both the nodes are null i.e it is leaf node
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.setLchild(null);
            } else {
                parent.setRchild(null);
            }

        } else if (current.getRchild() == null)//if it has only 1 node i.e left node has a subtree and right is null
        {
            if (current == root) {
                root = current.getLchild();
            } else if (isLeftChild) {
                parent.setLchild(current.getLchild());
            } else {
                parent.setRchild(current.getLchild());
            }

        } else if (current.getLchild() == null)//if it has only 1 node i.e right node has a subtree and left is null
        {
            if (current == root) {
                root = current.getRchild();
            } else if (isLeftChild)//parents left child
            {
                parent.setLchild(current.getRchild());
            } else {
                parent.setRchild(current.getRchild());
            }
        } else {
            //current is the node to be deleted
            Node successor = getSucessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLchild(successor);
            } else {
                parent.setRchild(successor);
                successor.setLchild(current.getLchild());
            }
        }

        return true;
    }//delete */
/*
//Get the Lowest Common Ancestor for 2 nodes or 2 numbers
    public Node getLowestCommonAncestor(Node root, int p, int q) {
        if (root == null) {
            return null;
        }
        if (p < root.getData() && q < root.getData()) {
            return getLowestCommonAncestor(root.getLchild(), p, q);
        } else if (p > root.getData() && q > root.getData()) {
            return getLowestCommonAncestor(root.getRchild(), p, q);
        } else {
            return root;
        }

    }*/

    //Get the successor for the given Node
    private Node getSucessor(Node delNode) {
        Node succParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRchild();

        while (current != null) {
            succParent = successor;
            successor = current;
            current = current.getLchild();
        }

        if (successor != delNode.getRchild()) {
            succParent.setLchild(successor.getRchild());
            successor.setRchild(delNode.getRchild());
        }
        return successor;

    }
/*
//Calculate height and Unbalanced and Balanced Trees:
    public int claculateHeight(Node root) {
        if (root == null) {
            return 0;
        }

        return (1 + Math.max(claculateHeight(root.getLchild()), claculateHeight(root.getRchild())));
    }

//Calculate Minimum Height
    public int calculateMinHeight(Node root) {
        if (root == null) {
            return 0;
        }

        return (1 + Math.min(claculateHeight(root.getLchild()), claculateHeight(root.getRchild())));
    }

//Calculate If tree is balanced or not    
    public boolean isBalanced(Node root) {
        return ((claculateHeight(root) - calculateMinHeight(root)) <= 1);

    }

    //Printing level wise using array list and Link list
   */ public ArrayList<LinkedList<Node>> getLinkList() {
        int level = 0;
        ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> list = new LinkedList<>();
        list.add(root);
        result.add(level, list);
        while (true) {
            list = new LinkedList<Node>();
            for (int i = 0; i < result.get(level).size(); i++) {
                Node n = result.get(level).get(i);
                if (n != null) {
                    if (n.getLchild() != null) {
                        list.add(n.getLchild());
                    }
                    if (n.getRchild() != null) {
                        list.add(n.getRchild());
                    }
                }
            }
            if (list.size() > 0) {
                result.add(level + 1, list);
            } else {
                break;
            }

            level++;
        }
        return result;
    }
//Tree1 is asubstring of T2

  /*  boolean containsTree(Node t1, Node t2) {
        if (t2 == null) {
            return true;
        } else {
            return subTree(t1, t2);
        }
    }

    boolean subTree(Node r1, Node r2) {
        if (r2 == null) {
            return false;
        }
        if (r1.getData() == r2.getData()) {
            if (matchTree(r1, r2)) {
                return true;
            }
        }
        return (subTree(r1.getLchild(), r2) || subTree(r1.getRchild(), r2));
    }

    boolean matchTree(Node r1, Node r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }
        if (r1.getData() != r2.getData()) {
            return false;
        }
        return matchTree(r1.getLchild(), r2.getLchild()) && matchTree(r1.getRchild(), r2.getRchild());
    }

    //Mirror Image for a BST  
    public void mirror(Node mainNode) {
Node current=mainNode;
        if (current == null) {
            return;
        } else {
            Node temp = current.getLchild();
            current.setLchild(current.getRchild());
            current.setRchild(temp);
            mirror(current.getLchild());
            mirror(current.getRchild());
        }
    }
//Has Path for A BST

    public boolean isPath(Node root, int sum) {
        if (root == null) {
            return (sum == 0);
        } else {
            int subSum = sum - root.getData();
            return (isPath(root.getLchild(), subSum) || isPath(root.getRchild(), subSum));
        }

    }
// prints out all of its root-to-leaf paths, one per line

    public void printPath(int a[], Node root, int length) {
        if (root == null) {
            return;
        } else {
            a[length] = root.getData();
        }
        length++;

        if (root.getLchild() == null && root.getRchild() == null) {
            printArray(a, length);
        } else {
            printPath(a, root.getLchild(), length);
            printPath(a, root.getRchild(), length);
        }
        }

    void printArray(int a[], int length) {
        System.out.print("\n");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");

        }
    }

    //Check if 2 trees are same.
    public boolean checksameTrees(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 != null && root2 != null) {
            return (root1.getData() == root2.getData()
                    && checksameTrees(root1.getLchild(), root2.getLchild())
                    && checksameTrees(root1.getRchild(), root2.getRchild()));
        } else {
            return false;
        }

    }

    public void print(Node node) {
        LinkedList<Node> list = new LinkedList();
        Node tmp;
        list.add(node);
        list.add(null);

        while (list.size() > 0) {

            tmp = list.remove();
            if (tmp == null && list.size() == 0) {
                break;
            }

            if (tmp == null) {
                System.out.println("");
                list.add(null);
            } else {
                System.out.print(" " + tmp.getData());
            }

            // If tmp not equal to null is not checked then temp.left will throw an errorS
            if (tmp != null) {
                if (tmp.getLchild() != null) {
                    list.add(tmp.getLchild());
                }
                if (tmp.getRchild() != null) {
                    list.add(tmp.getRchild());
                }
            }

        }
    }
//To check Is BST there are 3 methods
    //1:Optimal BST

    public boolean isOptimalBinarySearchTree(Node root, int min, int max) {
        if (root == null) {
            return true;
        } else if (root.getData() <= max && root.getData() >= min) {
            return (isOptimalBinarySearchTree(root.getLchild(), min, root.getData())
                    && isOptimalBinarySearchTree(root.getRchild(), root.getData(), max));
        } else {
            return false;
        }
    }

    //Method 2 Using Inorder BST
    public boolean isInorderBST(Node root, int prev) {
        prev = Integer.MIN_VALUE;
        if (root == null) {
            return true;
        } else if (isInorderBST(root.getLchild(), prev)) {
            System.out.print(root.getData()+ " " + prev);
            System.out.println(" ");
            
            if (root.getData() > prev) {
                prev = root.getData();
                   return isInorderBST(root.getRchild(), prev);

            } else {
                return false;
            }
        }
        else
            return false;
   }

 //Given the number of nodes find all possible combniations of trees that can be formed by the numbers
    
    
    public int combinations(int n)
    {
        int sum=0;
    if(n==0||n==1)
        return 1;
    else
        sum=0;
        for(int j=1;j<=n;j++)
        {
        sum+=combinations(j-1)*combinations(n-j);
        }
    return sum;
    }*/
//Toevaluate an Expression Tree
 /*   
    public int evaluate(Node root)
    {
        int result=0;
    if(root.getLchild()==null &&root.getRchild()==null)
        return root.getData();
    if(root.getOperator()!=null)
    {
       switch(root.getOperator()) 
       {
           case '*':
               result+ =evaluate(root.getLchild())*evaluate(root.getRchild());
           case '+':
               result+=evaluate(root.getLchild())+evaluate(root.getRchild());
           case '/':
               result+=evaluate(root.getLchild())/evaluate(root.getRchild());
           case '-':
               result+=evaluate(root.getLchild())-evaluate(root.getRchild());
           
       }
       
    }
    return result;
    }
*/

}
