package Set;

import java.util.HashSet;

public class hashset {
public static void main(String args[])
{
	HashSet hs = new HashSet();
	hs.add("A");
	hs.add("B");
	hs.add("C");
	hs.add("D");
	hs.add("C");
	hs.add(10);
	hs.add(50);
	hs.add('C');
	hs.add("C");
	
	System.out.println(hs);
	System.out.println(hs.add("E"));
	System.out.println(hs);
	System.out.println(hs.add("B")); //cannot add duplicates
}
}
