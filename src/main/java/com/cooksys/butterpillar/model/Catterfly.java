package com.cooksys.butterpillar.model;

public class Catterfly {

	private double wingspan;
	private double weight;

	// any instance fields should be private

	public Catterfly() {

		// TODO Auto-generated constructor stub
	}

	public Catterfly(double wingspan, double weight) {
		this.wingspan = wingspan;
		this.weight = weight;
		// TODO Auto-generated constructor stub
	}

	public double getWingspan() {
		return wingspan; // to be implemented
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;// to be implemented
	}

	public double getWeight() {
		return weight; // TODO: to be implemented
	}

	public void setWeight(double weight) {
		this.weight = weight;// TODO: to be implemented
	}

	public boolean equals(Catterfly c) {
		if ((c.getWingspan() == this.wingspan) && (c.getWeight() == this.weight)) {
			return true; // TODO: to be implemented
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Catterfly) {
			return this.equals((Catterfly) o);
		} else {
			return false;
		}
	}

}
