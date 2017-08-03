package com.Task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CollectionTask {

	/**
	 * @param args
	 */
	List<String> names = new ArrayList<String>();
	Map<Integer, String> mapvalues = new HashMap<Integer, String>();
	Set<String> setnames = new HashSet<>();
	String name = null;
	Scanner sc = new Scanner(System.in);
//	public void forSample() {
//		names.add("nithish");
//		names.add("bharath");
//		names.add("spencer");
//		names.add("dharshan");
//		for(String sample:names) {
//			System.out.println(sample);
//		}
	//}

	public void getName() {
		System.out.println("enter the number of names to be entered");
		int NumberOfNames = sc.nextInt();

		for (int i = 0; i < NumberOfNames; i++) {
			int number = i + 1;
			System.out.println("enter the name" + "" + number);
			name = sc.next();
			names.add(name);
		}
		System.out.println("the list that you have entered is ");
		for (String a : names) {
			System.out.println(a);
		}

		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	}

	public void deleteName() {

		System.out.println("Delete records Yes/no");
		String answerForDeletion = sc.next();
		if (answerForDeletion.equals("yes")) {
			System.out.println("enter the starting letter");

			String StartingLetter = sc.next();
			System.out.println("The list of names you have entered ");
			for (int i = 0; i < names.size(); i++)
				if (names.get(i).startsWith(StartingLetter)) {
					names.remove(i);
					System.out.println(names);
				}

			System.out.println("you have left with the balance names of " + " " + names.size());
		} else if (answerForDeletion.equals("no")) {
			getName();
		}
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}

	public void duplicateNames() {

		System.out.println("duplicate records yes/no");
		String Answer = sc.next();
		if (names.size() >= 5) {
			if (Answer.equals("yes")) {

				String getFirstname = names.get(0);
				String getSecondname = names.get(1);

				names.add(getFirstname);
				names.add(getSecondname);
				System.out.println("on adding first name and last name to the end ");

				System.out.println(names);

				System.out.println("the length is on adding the values in the last  " + " " + names.size());
				names.remove(0);
				names.remove(names.size() - 1);
				System.out.println("on removing the first and the last value:" + "" + names);
			}

			setnames.addAll(names);
			System.out.println("after removing the duplicate values" + " " + setnames.size());
			names.clear();
			names.addAll(setnames);
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------------------------------");

		} else if (names.size() <= 5) {
			System.out.println("Records is less then 5");
		} else if (Answer.equals("no")) {
			getName();
			
		}
	}

	public void getKeyValue() {
		for (int i = 0; i < names.size(); i++)
			mapvalues.put(i, names.get(i));

		for (Entry<Integer, String> m : mapvalues.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());

		}
		
	}

	public static void main(String[] args) {

		CollectionTask obj = new CollectionTask();
		obj.getName();
		obj.deleteName();
		obj.duplicateNames();
		obj.getKeyValue();
	}
	
}
