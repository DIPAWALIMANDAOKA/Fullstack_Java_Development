package Set;

import java.util.LinkedHashSet;

public class linked_hashset {
public static void main(String args[])
{
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("A");
	lhs.add("B");
	lhs.add("C");
	lhs.add("D");
	lhs.add("C");
	lhs.add(10);
	lhs.add(50);
	lhs.add('C');
	lhs.add("C");
	
	System.out.println(lhs);
	System.out.println(lhs.add("E"));
	System.out.println(lhs);
	System.out.println(lhs.add("B"));
	
}
}
