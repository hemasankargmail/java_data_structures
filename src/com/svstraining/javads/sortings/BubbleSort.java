package com.svstraining.javads.sortings;

public class BubbleSort extends AbstractSorter {
	@Override
	public <T extends Comparable<T>> void ascendingOrder(T[] values) {
		for(int passes = values.length-1;passes > 0;--passes){ // passes verification
			for(int loop =0; loop <= passes-1; ++loop){
				if(values[loop].compareTo(values[loop+1]) > 0)
					swap(values, loop, loop+1);
			}
		}
		
	}

	@Override
	public <T extends Comparable<T>> void descendingOrder(T[] values) {
		for(int passes = values.length-1;passes > 0;--passes){ // passes verification
			for(int loop =0; loop <= passes-1; ++loop){
				if(values[loop].compareTo(values[loop+1]) < 0)
					swap(values, loop, loop+1);
			}
		}
		
	}

}
