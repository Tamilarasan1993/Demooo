package com.INTERVIEW;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;


public class DUPLICATE_WORDS {

	public static void main(String[] args) {
		
		String s ="My Name Is Tamil My Is Tamil Name";
		String[] s1 = s.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		for(String value: s1) {
			set.add(value);
		}
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
	}
}
