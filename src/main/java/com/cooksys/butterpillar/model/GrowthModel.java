package com.cooksys.butterpillar.model;

public class GrowthModel {

	private double lengthToWingspan;
	private double leavesEatenToWeight;

	// any instance fields should be private

	public double getLengthToWingspan() {
		return lengthToWingspan; // to be implemented
	}

	public void setLengthToWingspan(double lengthToWingspan) {
		this.lengthToWingspan = lengthToWingspan;// to be implemented
	}

	public double getLeavesEatenToWeight() {
		return leavesEatenToWeight; // to be implemented
	}

	public void setLeavesEatenToWeight(double leavesEatenToWeight) {
		this.leavesEatenToWeight = leavesEatenToWeight;// to be implemented
	}

	public Catterfly butterpillarToCatterfly(Butterpillar butterpillar) {
		
		return new Catterfly(butterpillar.getLength() * this.lengthToWingspan, butterpillar.getLeavesEaten() * this.leavesEatenToWeight); // to be implemented
	}

	public Butterpillar catterflyToButterpillar(Catterfly catterfly) {
		return new Butterpillar(catterfly.getWingspan() / lengthToWingspan, catterfly.getWeight() / leavesEatenToWeight);
	}
	
	public boolean equals(GrowthModel g) {
		if((this.lengthToWingspan == g.lengthToWingspan) && (this.leavesEatenToWeight == g.leavesEatenToWeight)){
			return true;
		} else {
			return false;
		}// TODO: to be implemented
	}
	
	@Override
	public String toString() {
		return null; // TODO: to be implemented
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof GrowthModel) {
			return this.equals((GrowthModel) o);
		} else {
			return false;
		}
	}

}
