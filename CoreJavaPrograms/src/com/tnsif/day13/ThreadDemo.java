//Executor class for ChildThread
package com.tnsif.day13;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		ChildThread threadOne = new ChildThread(5, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");

		threadOne.start();
		threadOne.join();
		threadTwo.start();
		threadTwo.join();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
