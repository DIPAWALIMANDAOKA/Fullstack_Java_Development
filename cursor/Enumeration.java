
package Cursor;


import java.util.Vector;
import java.util.Enumeration;
public class Cursor {
public static void main(String [] args)
{
	
	
	Vector v= new Vector();
	for(int i=0;i<10;i++)
	{
		v.addElement(i);
	}
	System.out.println(v);
	
	//it fetches element one by one
	Enumeration e = v.elements();
	while(e.hasMoreElements()) {
		Integer i = (Integer) e.nextElement(); 
		System.out.println(i);
	}
	
}
}
