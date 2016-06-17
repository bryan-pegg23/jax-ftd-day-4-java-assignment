package com.cooksys.butterpillar.model;

public class Butterpillar {

	private double length;
	private double leavesEaten;

	// any instance fields should be private
	public Butterpillar() {

		// TODO Auto-generated constructor stub
	}

	public Butterpillar(double length, double leavesEaten) {
		this.length = length;
		this.leavesEaten = leavesEaten;
		// TODO Auto-generated constructor stub
	}

	public double getLength() {
		return length; // TODO: to be implemented
	}

	public void setLength(double length) {
		this.length = length;// TODO: to be implemented
	}

	public double getLeavesEaten() {
		return leavesEaten; // TODO: to be implemented
	}

	public void setLeavesEaten(double leavesEaten) {
		this.leavesEaten = leavesEaten;// TODO: to be implemented
	}

	public boolean equals(Butterpillar b) {
		if ((b.getLength() == this.length) && b.getLeavesEaten() == this.leavesEaten) {
			return true;
		}
		return false; // TODO: to be implemented
	}

	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Butterpillar) {
			return this.equals((Butterpillar) o);
		} else {
			return false;
		}
	}

}
