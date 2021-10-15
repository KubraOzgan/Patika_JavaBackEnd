package thread;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=1; i <10000; i++)
		{
			numbers.add(i);
		}
		
		List<Integer> n1 = numbers.subList(0, 2500);
		List<Integer> n2 = numbers.subList(2500, 5000);
		List<Integer> n3 = numbers.subList(5000, 7500);
		List<Integer> n4 = numbers.subList(7500, 9999);
		
		Threads f1 = new Threads(n1);
		Threads f2 = new Threads(n2);
		Threads f3 = new Threads(n3);
		Threads f4 = new Threads(n4);
		
		Thread t1 = new Thread(f1);
		Thread t2 = new Thread(f2);
		Thread t3 = new Thread(f3);
		Thread t4 = new Thread(f4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
