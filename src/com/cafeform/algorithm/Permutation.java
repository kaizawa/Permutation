package com.cafeform.algorithm;

import java.util.*;

/**
 * Experimental implementation of Permutation
 */
public class Permutation<T>
{
	private List<T> list;
	private int numChosen;
	List<List<T>> result = new LinkedList<List<T>>();

	public Permutation(List<T> list, int numChosen)
	{
		this.list = list;
		this.numChosen = numChosen;
	}

	public List<List<T>> getResult()
	{
		permutation(new ArrayList<Integer>(), 0);
		return result;
	}

	private void permutation(ArrayList<Integer> runningUsage, int runningDepth)
	{
		if(runningDepth == numChosen){
			List<T> candidateList = new ArrayList<T>();
			for(Integer i : runningUsage){
				 candidateList.add(list.get(i));
			}
			result.add(candidateList);
			return;
		}
		for(int index = 0 ; index < list.size() ; index++){
			/*
			 * New index must not be appered before.
			 */
			if( !runningUsage.contains(index)){
				runningUsage.add(index);
				permutation(runningUsage, runningDepth + 1);
				runningUsage.remove(runningUsage.size() -1);
			}
		}
	}
}
