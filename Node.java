/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

/**
 *
 * @author Mandy
 */
public class  Node {
    private int data;
    private Node lchild;
    private Node rchild;
    private Node Middle;
    
    Node()
    {
 
    lchild=null;
    rchild=null;
    }

public int getData() {
        return data;
    }

public void setData(int data) {
        this.data = data;
    }

public Node getLchild() {
        return lchild;
    }

public void setLchild(Node lchild) {
        this.lchild = lchild;
    }

public Node getRchild() {
        return rchild;
    }

public void setRchild(Node rchild) {
        this.rchild = rchild;
    }
    
    
}
