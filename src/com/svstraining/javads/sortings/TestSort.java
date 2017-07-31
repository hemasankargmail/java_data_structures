package com.svstraining.javads.sortings;

public class TestSort {

	public static void main(String[] args) {
		Sorter sort = new BubbleSort();
		Integer[] values = new Integer[] { 3, 1, 5, 4, 2 };
		sort.ascendingOrder(values);
		System.out.println("====================");
		sort.print(values);
		sort.descendingOrder(values);
		System.out.println("====================");
		sort.print(values);
		//selection sort
		sort = new SelectionSort();
		values = new Integer[] { 3, 1, 5, 4, 2 };
		sort.ascendingOrder(values);
		System.out.println("====================");
		sort.print(values);
		values = new Integer[] { 3, 1, 5, 4, 2 };
		sort.descendingOrder(values);
		System.out.println("====================");
		sort.print(values);
		String val[] = new String[] { "xyz", "pqr", "abc", "pqs", "abd" };
		sort.ascendingOrder(val);
		System.out.println("====================");
		sort.print(val);
	}

}
