package com.slokam.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
//add,add(index,		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(2, "E");
		list.set(1, "hajarath");
		list.add("A");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List list1=new ArrayList<>();
		list1.add(1);
		list1.add("S");
		/*for (Object object : list1) {
			System.out.println(object);
		}*/
		Iterator it=list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
			
		}
		
	
		
	}
	
	
	

}
