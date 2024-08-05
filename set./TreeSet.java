package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet {
public static void main(String[] args)
{
	TreeSet ss= new TreeSet();
	ss.add("a");
	ss.add("b");
	ss.add("c");
	ss.add("d");
	ss.add("e");
	ss.add("f");
	ss.add("g");
	System.out.println(ss);
	
	System.out.println(ss.first());
	System.out.println(ss.last());
	System.out.println(ss.headSet("a"));
	System.out.println(ss.headSet("c"));
	System.out.println(ss.subSet("a","d"));
	System.out.println(ss.comparator());
	
	
}
}
