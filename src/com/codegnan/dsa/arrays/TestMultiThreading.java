package com.codegnan.dsa.arrays;

public class TestMultiThreading {

	public static void main(String[] args) {
	
//		Thread t2 = new Thread();
//		t2.start();
//		Thread t3 = new Thread();
//		t3.start();
//		Thread t4 = new Thread();
//		t4.start();
//	System.out.println(Thread.currentThread().getPriority());
//	System.out.println(Thread.currentThread().getId());
//	System.out.println(Thread.currentThread().getName());
//	System.out.println(Thread.activeCount());

		        Employee t1 = new Employee();

		        t1.start();
		        Manager t2 = new Manager();
		        t2.start();
		    }
}

		    class Employee extends Thread {

		        @Override
		        public void run() {
		            System.out.println("Hello");
		        }
		    }
		    class Manager extends Thread{
		    	@Override
		    	public void run() {
		    		System.out.println("HI");
		    		
		    	} }

