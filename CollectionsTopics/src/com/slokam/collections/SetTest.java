package com.slokam.collections;

import java.beans.FeatureDescriptor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SetTest { 
	
	public static void main(String[] args) {
		
		/*// in this there is insertion order and it doesn't allow the duplicates
		 * and it doesn't take time process
		Set<String> set=new LinkedHashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("H");
		set.add("E");
		set.add("hajarath");
		set.add("A");
		Set<String> set1=new LinkedHashSet<>();
		set1.add("F");
		set1.addAll(set);
		System.out.println(set.equals(set1));
		
		Iterator<String> itr=set1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		//o/p:false,F,A,B,C,H,E,hajarath.
		}
*/
	
	// in this there is no insertion order and it doesn't allow the duplicates
		//and it take time cosumption
			/*HashSet<String> set=new HashSet<>();
			set.add("A");
			set.add("B");
			set.add("C");
			set.add("H");
			set.add("E");
			set.add("hajarath");
			set.add("A");
			Set<String> set1=new HashSet<>();
			set1.add("F");
			set1.addAll(set);
			System.out.println(set.equals(set1));
			
			Iterator<String> itr=set1.iterator();
			
			while(itr.hasNext()) {
				System.out.println(itr.next());
			//o/p:false,A,B,C,E,F,hajarath,H.
			}*/

		// in arrayList To get the values by using Iterator
		
	/*	ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("Z");
		
		ArrayList<String> al1=new ArrayList<>();
		
		al1.add("H");
		al1.add("K");
		al1.addAll(al);
		
		System.out.println(al1);
		System.out.println(al==al1);
		System.out.println(al.equals(al1));
		
		Iterator<String> itr=al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		*/
		
	// arraylist in Decending order	
		
		/*ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(70);
		al.add(50);
		al.add(60);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		al1.add(40);
		al1.add(70);
		al1.add(60);
		al1.add(30);
		al1.add(10);
		al1.addAll(al);
		
		System.out.println(al1);
		  Collections.sort(al1, Collections.reverseOrder());

		     Sorted List in reverse order
		    System.out.println("ArrayList in descending order:");
		    for(Integer str: al1){
		   System.out.println(str);
	
	}*/
		
		/*// arraylist in Asending order	
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(70);
		al.add(50);
		al.add(60);
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		al1.add(40);
		al1.add(70);
		al1.add(60);
		al1.add(30);
		al1.add(10);
		al1.addAll(al);
		
		System.out.println(al1);
		  Collections.sort(al1);

		   
		    System.out.println("ArrayList in Asending order:");
		    for(Integer str: al1){
		   System.out.println(str);
	
	}*/
		//Array with assending order
		/*int arr[]= {10,30,70,50,60};
		int temp;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		
		//Array with desending order
		/*int arr[]= {10,30,70,50,60,20,90,80};
		
		int temp;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]<arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		
		//Array with assending order
		
		/*int arr[] = {20,6,60,12,9,13,8,70};
		for(int j=0;j<arr.length;j++)
		{
		int small = arr[j];
		int position =j;
		for(int i=j;i<arr.length;i++)
		{
			if(small>arr[i])
			{
				small=arr[i];
				position = i;
				
			}
			
		}
		
		int temp = arr[j];
		arr[j ] = arr[position];
		arr[position] =temp;
		
		}
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]);
		//System.out.println(position);
		
		}*/
		
		//HasMap
		//HashMap class maintains no order.
		// HashMap can contain one null key but can have multiple null values
		/*Map<Integer, Integer> map=new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 50);
		map.put(4, 40);
		
		System.out.println("List of Key and values"+map);
		for (Map.Entry<Integer, Integer> val : map.entrySet()) {
			
			System.out.println(val.getKey()+":"+val.getValue());
		}*/
		//LinkedHashMap
		//LinkedHashMap maintains insertion order.
		//LinkedHashMap, It contains unique elements.
		// in this there is no Duplicate Keys.
		//LinkedHashMap can contain one null key but can have multiple null values
		
		Map<Integer, Integer> map=new LinkedHashMap<>();
		map.put(6, 20);
		map.put(2, 10);
		map.put(3, 40);
		map.put(4, 30);
		map.put(3, 40);
		map.put(1, 30);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		for (Map.Entry<Integer, Integer> val1 : map.entrySet()) {
			
			System.out.println(val1);
			
		}
		
		
		//Tree Map
		//TreeMap cannot contain any null key.
		//TreeMap maintains ascending order.
		
		/*TreeMap<Integer, Integer> map=new TreeMap<>();
		map.put(6, 20);
		map.put(2, 10);
		map.put(5, 40);
		map.put(4, 30);
		map.put(3, 40);
		map.put(1, 30);
		
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
		
		System.out.println(map.entrySet());
		
		System.out.println("===================================");
		
		 //Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+map.headMap(3));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+map.tailMap(3));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+map.subMap(1, 4)); 
		*/
		//output
	     /* {1=30, 2=10, 3=40, 4=30, 5=40, 6=20}
	      [1, 2, 3, 4, 5, 6]
	      [30, 10, 40, 30, 40, 20]
	      [1=30, 2=10, 3=40, 4=30, 5=40, 6=20]
	      ===================================
	      headMap: {1=30, 2=10}
	      tailMap: {3=40, 4=30, 5=40, 6=20}
	      subMap: {1=30, 2=10, 3=40}*/
		
		/*
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
					System.out.print("b");
				}
				else {
					System.out.print("a");
				}
			}
			System.out.println();
		}
		
	o/p:a
		bb
		aaa
		bbbb
		*/
		
	//LamdaExpressions and Anonymous Inner Type comparisons
			
	//By Using Anonymous Inner Type
		
		/*Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=100; i++) {
					System.out.println(i);
				}
				
			}
		};
		
		Thread t=new Thread(runnable);
		t.start();
		*/
		/*Callable<Integer> cal=new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int count=0;
				for(int i=0;i<=100;i++) {
					count=count+i;
				}
				return count;
			}
		};
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<Integer> ft= es.submit(cal);
		try {
			System.out.println(ft.get());
		} catch (InterruptedException | ExecutionException e) {

			e.printStackTrace();
		}
		
		
		*/
		
		/*Comparator<Student> compare=new Comparator<Student>() {
			
			@Override
			public int compare(Student s1, Student s2) {
			
				return s1.getName().compareTo(s2.getName());
			}
		};
		*/
		
		
		
		
	//By Using Lamda Expressions
		
		/*Runnable runnable=()->{
			for (int i = 1; i <=100; i++) {
				
				System.out.println(i);
				
			}
		};
		
		Thread t1=new Thread(runnable);
		t1.start();
		*/
		
		/*Callable<Integer> calable=()->{
			
			int count=0;
			for(int i=1;i<=100;i++) {
				count=count+i;
			}
			return count;
			
		};
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		Future<Integer> fe=es.submit(calable);
		
		try {
			System.out.println(fe.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*Comparator<Student> compare=(s1,s2)->{
			
			return s1.getName().compareTo(s2.getName());
		};*/
		
		// Amstrong Number
		// for example 371=3*3*3+7*7*7+1*1*1=a^3+b^3+c^3
		/*
		for(int i=0;i<=1000;i++) {
			
			int number=i;
			int dup=number;
			int ams=0;
			
			while(number !=0) {
				int val=number%10;
				ams=ams+(val*val*val);
				number=number/10;
			}
			if(dup==ams) {
				System.out.println(dup+":: is amstrrong number");
			}
			else {
				System.out.println("this is not a amstrong number");
			}
	}*/
		
		// DeleteDuplicatesFromIntArray
		
		/*
		Integer arr[]= {10,20,30,40,10,20,30,40,10,20,30,40};
		List<Integer> list=new ArrayList<>(new HashSet<>(Arrays.asList(arr)));
		for (Integer integer : list) {
			System.out.println(integer);
		}
		
		
		int count=0;
		int sum=0;
		int size=list.size();
		while(count<size) {
			sum=sum+list.get(count);
			count++;
		}
		float avg=sum/size;
		System.out.println("sum is ::"+sum);
		System.out.println("average is ::"+avg);
	}
	*/
		
		
	
		}
}
