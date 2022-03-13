package view;
import controller.ThreadId;
public class Principal {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 3; i ++) {
			Thread id = new ThreadId();
			id.start();
		}
		

	}

}
