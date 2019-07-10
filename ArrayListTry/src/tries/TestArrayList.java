package tries;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		mylist.add(1);
		mylist.add(5);
		mylist.add(3);
		mylist.add(25);
		mylist.add(93);
		
		for (Integer x: mylist)
		System.out.println(x);
		
		mylist.set(0,0);
		for (Integer x: mylist)
			System.out.println(x);
	
		System.out.println("size = "+ + mylist.size());
		mylist.remove(4);
		
		for(Integer x: mylist)
			System.out.println(x);
		
}}
