package rsravani.collectionscustom;

import java.util.Arrays;

public class CustomList<E> {
	private Object mycustomlist[];
	private int INITIAL_CAP=10;
	private int size=0;
	CustomList()
	{
		mycustomlist= new Object[INITIAL_CAP];
	}
	
	public void add(E element)
	{
		if(size==mycustomlist.length)
		{
			increasesize();
		}
		mycustomlist[size]=element;
		size++;
	}
	
	public Object get(int index) throws Exception
	{
		if(index<=0 || index>=size)
		{
			throw new Exception("Give an index within the list capacity");
		}
		else
		{
			return (mycustomlist[index]);
		}
	}
	
	public Object remove(int index) throws Exception
	{
		if(index<0 || index>=size)
		{
			throw new Exception("Give an index within the list capacity");
		}
		else
		{
			int i;
			Object removedelement = mycustomlist[index];
			for(i=index;i<size - 1;i++)
			{
				mycustomlist[i]=mycustomlist[i+1];
			}
			size--;
			return removedelement;
		}
	}
	
	public void increasesize()
	{
		int newcap=2*mycustomlist.length;
		mycustomlist = Arrays.copyOf(mycustomlist, newcap);
	}
	
	public void printlist()
	{
		System.out.println("The custom list is:");
		for(int i=0;i<size;i++)
		{
			System.out.print(mycustomlist[i]+" ");
		}
	}

}
