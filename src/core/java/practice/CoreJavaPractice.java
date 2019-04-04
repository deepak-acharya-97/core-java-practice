package core.java.practice;

import java.util.*;

public class CoreJavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array To List 
		String[] arr = { "1", "2", "3"};
		List<String> list = new ArrayList<>();
		list = Arrays.asList(arr);
		printList(list);
		list = new ArrayList<>();
		Collections.addAll(list, arr);
		printList(list);
	}

	private static void printList(List<String> list) {
		// TODO Auto-generated method stub
		for(String s : list) {
			print(s);
		}
	}

	private static <T> void print(T genericVariable) {
		// TODO Auto-generated method stub
		System.out.print(genericVariable);
	}

}
