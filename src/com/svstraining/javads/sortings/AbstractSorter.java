package com.svstraining.javads.sortings;

public abstract class AbstractSorter implements Sorter {
	@Override
	public <T extends Comparable<T>> void swap(T[] values, int index, int index1) {
		 T temp = values[index];
		 values[index] = values[index1];
		 values[index1] = temp;
	}

	@Override
	public <T extends Comparable<T>> void print(T[] values) {
		for(T t : values){
			System.out.println(t);
		}
		
	}

}
