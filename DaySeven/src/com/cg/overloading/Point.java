package com.cg.overloading;

public class Point {
	
	private float x;
	private float y;
	
	// C1 - 0 parameter
	public Point() {
		x=0.0f;
		y=0.0f;
	}
	
	// C2 - 1 parameter
	public Point(int x) {
		this.x=x;
	}
	
	// C3 - 2 parameter
	public Point(int x, int y) {
		this.x=x;
	}
	
	// C4
	public Point(float x) {
		this.x=x;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
