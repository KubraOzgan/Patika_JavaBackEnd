package thread;

import java.util.ArrayList;
import java.util.List;

public class Threads implements Runnable{

	private Object LOCK = new Object();

	List<Integer> numbers = new ArrayList<>();	
	
	List<Integer> oddNumbers = new ArrayList<>();
	List<Integer> evenNumbers = new ArrayList<>();
	
	public Threads(List<Integer> numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void run() {
		
		synchronized(LOCK)
		{	
			for(Integer i : numbers)
			{
				if(i % 2 == 0)
					evenNumbers.add(i);
				else 
					oddNumbers.add(i);
			}
			
			/*for(Integer i : n2)
			{
				if(i % 2 == 0)
					evenNumbers.add(i);
				else
					oddNumbers.add(i);
			}
			
			for(Integer i : n3)
			{
				if(i % 2 == 0)
					evenNumbers.add(i);
				else
					oddNumbers.add(i);
			}
			
			for(Integer i : n4)
			{
				if(i % 2 == 0)
					evenNumbers.add(i);
				else
					oddNumbers.add(i);
			}*/
			
			for(Integer i : oddNumbers)
			{
				System.out.println(Thread.currentThread().getName() + " Number : " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			for(Integer i : evenNumbers)
			{
				System.out.println(Thread.currentThread().getName() + " Number : " + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
