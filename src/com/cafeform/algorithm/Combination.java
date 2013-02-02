package com.cafeform.algorithm;

import java.util.*;

/**
 * Experimental implementation of Combination
 */
public class Combination<T>
{
	private List<T> list;
	private int numChosen;
	List<List<T>> result = new LinkedList<List<T>>();

	public Combination(List<T> list, int numChosen)
	{
		this.list = list;
		this.numChosen = numChosen;
	}

	public List<List<T>> getResult()
	{
		combination(new ArrayList<Integer>(), 0);
		return result;
	}

	private void combination(ArrayList<Integer> runningUsage, int runningDepth)
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
			 * New index must be greater than previously added index.
			 * This makes sure list is combination but not permutation.
			 * And new index must not be appered before.
			 */
			if(((runningUsage.size() > 0 && index > runningUsage.get(runningUsage.size() -1))
			    || 0 == runningUsage.size())
			   && !runningUsage.contains(index)){
				runningUsage.add(index);
				combination(runningUsage, runningDepth + 1);
				runningUsage.remove(runningUsage.size() -1);
			}
		}
	}
}
