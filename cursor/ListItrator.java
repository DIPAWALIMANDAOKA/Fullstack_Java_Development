package Cursor;
import java.util.ArrayList;
import java.util.ListIterator;
public class ListItrator {
	public static void main(String[] args)
	{

	ArrayList list = new ArrayList();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	list.add("F");
	System.out.println(list);
	
	ListIterator itr= list.listIterator();
	while(itr.hasNext()) // check if next element is there
	{   String s= (String) itr.next();
	   System.out.println(s);
	}
	while(itr.hasPrevious()) // check if previous element is there
	{
		 String s= (String) itr.previous();
		System.out.println(s);
	}
	
	
	
	}
	
}
