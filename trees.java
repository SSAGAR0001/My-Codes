/* package codechef;
 // don't place package name!
 */


import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

class trees
{

    Node root;

    public void insert(int key){

        root = insert(root,key);

    }
    private Node insert(Node n, int key){

        if(n == null) return new Node(key);

        if(n.key == key){}

        if(key < n.key){

            n.left = insert(n.left,key);

        }

        else n.right = insert(n.right,key);

        return n;

    }

    public boolean search(int key){

        return search(root,key);

    }

    private boolean search(Node n,int key){

        if(n == null) return false;

        if(n.key == key) return true;

        if(n.key > key) return search(n.left,key);

        return search(n.right,key);

    }

    public int getmin(){

        if(root ==  null) return -1;

        return getmin(root);

    }

    private int getmin(Node n){

        if(n.left == null) return n.key;

        return getmin(n.left);

    }

    public int getmax(){

        if(root == null) return -1;

        return getmax(root);

    }

    private int getmax(Node n){

        if(n.right == null) return n.key;

        return getmax(n.right);

    }

    public void delmin(){

        root = delmin(root);

    }

    private Node delmin(Node n){

        if(n.left == null) return n.right;

        n.left = delmin(n.left);

        return n;

    }

	public static void main (String[] args) throws java.lang.Exception

	{

		// your code goes here

		trees b = new trees();

		b.insert(5);

		b.insert(3);

		b.insert(4);

		b.insert(2);

		b.insert(7);

		b.insert(6);

		b.insert(8);

		System.out.println(b.search(5));

		System.out.println(b.search(9));

		System.out.println(b.getmax());

		System.out.println(b.getmin());

	}

	class Node{

	    int key;

	    Node right;

	    Node left;

	    public Node(int key){

	        this.key = key;

	        this.left = null;

	        this.right = null;

	    }

	}

}
