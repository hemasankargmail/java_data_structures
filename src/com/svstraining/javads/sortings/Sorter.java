package com.svstraining.javads.sortings;

public interface Sorter {

	<T extends Comparable<T>> void ascendingOrder(T[] values);

	<T extends Comparable<T>> void descendingOrder(T[] values);

	<T extends Comparable<T>> void swap(T[] values, int index, int index1);

	<T extends Comparable<T>> void print(T[] values);
	// public void sort(T[] input);
	// public void swap(T[] input,int i,int j);
}
