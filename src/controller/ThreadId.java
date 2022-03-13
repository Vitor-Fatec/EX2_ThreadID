package controller;


//Parametros por construtor
//método rim()

public class ThreadId extends Thread{
	
	public ThreadId() {

	}

	@Override
	public void run() {
		System.out.println("Thread id = #"+getId());
	}
}
	
	


