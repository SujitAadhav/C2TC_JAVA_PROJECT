package com.cg.generics;

public class MinMaxImpl <T extends Comparable> implements MinMax<T>{

	T[] values;
	
	MinMaxImpl(T[] obj){
		values=obj;
	}
	@Override
	public T min() {
		T ol = values[0];
		for(int i=1; i<values.length; i++)
			if(values[i].compareTo(ol)<0)
				ol=values[i];
		return ol;
	}

	@Override
	public T max() {
		T ol = values[0];
		for(int i=1; i<values.length; i++)
			if(values[i].compareTo(ol)>0)
				ol=values[i];
		return ol;
	}

}
