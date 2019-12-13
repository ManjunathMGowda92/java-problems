package org.manjunath.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesInArray {
	
	public boolean containsDuplicates(int[] arr){
		Set<Integer> set = new HashSet<>();
		
		for (int i : arr){
			if (!set.add(i))
				return true;
		}
		return false;
	}
}
