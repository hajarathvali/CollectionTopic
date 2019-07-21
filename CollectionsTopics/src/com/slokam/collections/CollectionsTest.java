package com.slokam.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		Collection<String> c=new ArrayList<>();
//add		
		c.add("A");
		c.add("B");
		c.add("C");
		c.add("D");
		c.add("E");
		
		Collection<String> c1=new ArrayList<>();
//addAll		
		c1.addAll(c);
		//System.out.println(c1.equals(c));true
		c1.add("CFG");
		c1.add("KGF");
		c1.add("GOOGLE");
		
		//System.out.println(c1.equals(c));false
		
		Collection<String> c2=new ArrayList<>();
		/*for (String string : c1) {
			System.out.println(string);
		}*/
//Iterartor		
		/*Iterator<String> itr=c1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}*/
//contains(contains maens it is a boolen type ,is there values is there are not)
		
		/*System.out.println(c.contains("KGF"));
		System.out.println(c1.addAll(c));*/
		
//isEmpty
		/*System.out.println(c2.isEmpty());//ya is there there is no values & objects
		System.out.println(c.isEmpty());*/
		
//size
		//System.out.println(c.size());
		
//toArray
		/*Object[] o=c1.toArray();
		for (Object string : o) {
			System.out.println(string);
		}*/
		
		/*String[] k=c1.toArray(new String[0]);
		for (String string : k) {
			System.out.println(string);
		}
		
		//System.out.println(o);
*/	
		
//equals
		//System.out.println(c1.equals(c2));
	
//remove
		c1.removeAll(c);
		System.out.println(c1);
		/*c.retainAll(c1);
		System.out.println(c1);*/
	
	}

}
