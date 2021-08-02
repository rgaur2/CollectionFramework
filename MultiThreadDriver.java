package Multithreading;

public class MultiThreadDriver {

	public static void main(String[] args) {

        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread object = new Thread(new MultiThreadingExample1()); 
            object.start(); 
        } 
    } 
	}


