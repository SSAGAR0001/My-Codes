/* package codechef; // don't place package name! */


import java.util.*;

import java.lang.*;

import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */

class stackimplementation
{


	public static void main (String[] args) throws java.lang.Exception

	{
	    sstack t = new sstack(10);

	    int i;

		for(i=1;i<=10;i++){

		    t.push(i);

		}

		while(i > 0){

		    System.out.println(t.pop());

		    i=i-1;

		}

	}

}

class sstack
{

    int []arr;

    int top;

    public void push(int x){

        arr[++top] = x;

    }

    public int pop(){

        return arr[top--];

    }

    sstack(int z){

        arr = new int[z];

        top = -1;

    }

}
