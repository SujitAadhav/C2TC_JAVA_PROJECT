package com.cg.generics;

public interface MinMax <T extends Comparable> {

	T min();
	T max();
}
