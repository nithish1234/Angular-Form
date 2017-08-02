package com.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.jar.Attributes.Name;

public class CollectionTask {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<String>();
		Map<Integer , String>mapnames=new HashMap<>();
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number of names to be entered");
		 int NumberOfNames=sc.nextInt();
		 String name = null;
		 
		try {
			for(int i=0;i<NumberOfNames;i++) {
				System.out.println("enter the name");
				 name = sc.next();
				 names.add(name);
			}
			

			for (String a : names) {
				System.out.println(a);
			}
			System.out.println("enter the starting letter");
			
			String StartingLetter = sc.next();
              for(int i=0;i<names.size();i++)
			if (names.get(i).startsWith(StartingLetter)) {
				names.remove(i);
				System.out.println(names);
			}
              System.out.println(names.size());

			System.out.println("duplicate records");
			String Answer = sc.next();
			if(names.size()>=5) {
			if (Answer.equals("yes")) {
				
				String getFirstname = names.get(0);
				String getSecondname = names.get(1);

				names.add(getFirstname);
				names.add(getSecondname);
				for (String b : names) {
					System.out.println("name in the list are" +" "+ b);

				}
				System.out.println("the length is "+ " "+names.size());
				names.remove(0);
				names.remove(names.size()-1);
				System.out.println("the removed stack" +""+names);
			}
			}
			else if(names.size()<=5) {
				System.out.println("record is less than 5");
			}
			if(Answer.equals("no")) {
			System.out.println("...");
			}
			Set<String>setnames=new HashSet<>();
			setnames.addAll(names);
			for(String setname:setnames) {
				System.out.println(setname);
			}
//Map<Integer, String> mapvalue=new HashMap<Integer, String>(); 
//for(Integer n) {	
//mapvalue.put(i,name);
//for(Integer entry:mapvalue.keySet()){    
//    int key=entry.intValue();  
//    System.out.println(key);
//
//		}}}

//			}
		 catch (Exception e) {
			// TODO: handle exception
			System.err.println("first or second record not found");
		}
	}}
	

