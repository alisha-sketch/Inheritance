package Exp;

public class Threadsssss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("current Thread is:"+t);
		System.out.println("Thread name is"+t.getName());
		
		t.setName("My threadd");
		System.out.println("new name is:"+t);
		System.out.println("new thread"+t.getName());
		

	}

}
