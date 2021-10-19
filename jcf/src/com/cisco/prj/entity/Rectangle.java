package com.cisco.prj.entity;

public class Rectangle {
	private int width;
	private int breadth;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + breadth;
		result = prime * result + width;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (breadth != other.breadth)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
}
