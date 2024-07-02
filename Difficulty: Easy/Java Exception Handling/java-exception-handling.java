//{ Driver Code Starts
//Initial Template for Java
/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        TestClass obj1=new TestClass(a,b);
	        obj1.findMin();
	    }
	}
}


// } Driver Code Ends
//User function Template for Java

class TestClass
{
    private int a;
    private int b;
    
    TestClass (int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void findMin() {
        int min = Integer.MAX_VALUE;
        try {
            min = Math.min(min, a+b);
            min = Math.min(min, a-b);
            min = Math.min(min, a*b);
            min = Math.min(min, a/b);
        } catch (Exception e) {

        }
        System.out.println(min);
    }

    // Add your code here. Define private variables, Constructors to initialize 
    // variables with the given values and a method findMin() which prints the 
    // Minimum value of a$b.
}

//{ Driver Code Starts.

// } Driver Code Ends