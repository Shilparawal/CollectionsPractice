package JavaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args)
	{
		LinkedList lt=new LinkedList();
		
		lt.add("Hello");
		lt.add(200);
		lt.add( true);
		lt.add(23.43);
		lt.add(null);
	
		System.out.println(lt);//[Hello, 200, true, 23.43, null]
			
		System.out.println(lt.size());	//5
		
		System.out.println(lt.remove(3));//23.43
		System.out.println(lt);
		
		lt.add(3, "Java");
		System.out.println("After inserting element"+lt);
		
		System.out.println(lt.get(4));
		
		lt.set(2, "Python");
		System.out.println("After changing the value"+lt);
		
		System.out.println(lt.contains("Java"));
		System.out.println(lt.contains("C"));
		
		System.out.println(lt.isEmpty());
		
		/*
		//reading elements from list using for loop
		for(int i=0;i<lt.size();i++)
		{
			System.out.println(lt.get(i));
		}
		
		//Reading element from List using for each
		for(Object e:lt)
		{
			System.out.println(e);
		}
		*/
		//iterator method
		Iterator it=lt.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
