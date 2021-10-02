package list;

public class MyList <T> {
	
	private T[] array;

	public MyList()
	{
		this.array = (T[]) new Object [10];
	}
	
	public MyList(int capacity)
	{
		this.array = (T[]) new Object [capacity];
	}
	
	public int size()
	{
		int count = 0;
		for(T i : array)
		{
			if(i != null)
				count++;
		}
		return count;
	}
	
	public int getCapacity()
	{
		return array.length;
	}
	
	public void add(T data)
	{
		int index = -1;
		for(int i=0; i<array.length; i++) 
		{
			if(array[i] == null) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			index = array.length;
			T[] temp = (T[]) new Object[2*index];
			
			for(int i=0; i<array.length; i++) 
			{
				temp[i] = array[i];
			}
			
			array = temp;
		}
		
		array[index] = data;
	}
	
	public T get(int index)
	{
		if(index < 0 || index > size())
			return null;
		else
			return array[index];
	}
	
	public void remove(int index)
	{
		if(index < 0 || index > size())
		{
			System.out.println("null");
		}
		
		else
		{   
			for(int i=index; i<size(); i++)
			{
				array[i] = array[i+1];
			}
		}
	}
	
	public void set(int index, T data)
	{
		if(index < 0 || index > size())
		{
			System.out.println("null");
		}
		
		else
		{  
			array[index] = data;
		}
	}
	
	public int indexOf(T data)
	{
		for(int i=0; i<size(); i++)
		{
			if(array[i] == data)
				return i;
		}
		
		return -1;
	}
	
	public int lastIndexOf(T data) {
		
		for(int i=size()-1; i>=0; i--) 
		{
			if(array[i] == data)
				return i;
		}
		return -1;
	}
	
	boolean isEmpty()
	{
		if(array != null)
			return false;
		return true;
	}
	
	public T[] toArray() 
	{
		int size = size();
		T[] arr = (T[]) new Object[size];
		
		for(int i=0; i<size; i++) 
		{
			arr[i] = array[i];
		}
		return arr;
	}
	
	public void clear() 
	{
		this.array = (T[]) new Object[10];
	}
	
	public MyList<T> subList(int start, int finish) 
	{
		if(start < 0 || finish > size())
			return null;
		
		MyList<T> result = new MyList<>(finish-start);
		
		for(int i=start; i<finish; i++)
		{
			result.add(array[i]);
		}
		return result;
	}

	public boolean contains(T data) {
		
		int size = size();
		
		for(int i=0; i<size; i++) 
		{
			if(array[i] == data)
				return true;
		}
		return false;
	}
	
	public String toString() 
	{
		int size = size();
		
		if(size < 1)
			return "[]";
		
		String result="[";
		for(int i=0; i<size; i++) 
		{
				result += array[i];
				result += ", ";
		}
		result = result.substring(0, result.length()-2);
		result += "]";
		return result;
	}
	
}
