package controller;


//Parametros por construtor
//m�todo rim()

public class ThreadId extends Thread{
	
	public ThreadId() {

	}

	@Override
	public void run() {
		System.out.println("Thread id = #"+getId());
	}
}
	
	


