package com.svstraining.javads.sortings;

public class SelectionSort extends AbstractSorter {

	@Override
	public <T extends Comparable<T>> void ascendingOrder(T[] values) {
		//Find min element
		
		for(int index=0;index<values.length;index++){
			Comparable<T> min = values[index];
			int minIndexPosition = -1;
			for(int iterate = index+1;iterate< values.length;iterate++){
				if(min.compareTo(values[iterate]) > 0){
					min = values[iterate];
					minIndexPosition = iterate;
				}
			}
			if(minIndexPosition != -1){
				swap(values, index, minIndexPosition);
				minIndexPosition = -1;
			}
		}

	}

	@Override
	public <T extends Comparable<T>> void descendingOrder(T[] values) {
		// TODO Auto-generated method stub
		for(int index=0;index<values.length;index++){
			Comparable<T> max = values[index];
			int maxIndexPosition = -1;
			for(int iterate = index+1;iterate< values.length;iterate++){
				if(max.compareTo(values[iterate]) < 0){
					max = values[iterate];
					maxIndexPosition = iterate;
				}
			}
			if(maxIndexPosition != -1){
				swap(values, index, maxIndexPosition);
				maxIndexPosition = -1;
			}
		}
	}

}
