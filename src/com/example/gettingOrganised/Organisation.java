package com.example.gettingOrganised;

public class Organisation {
	private String name;
	private double annualRevenue;
	private boolean isProfitMaking;
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAnnualRevenue(double a) {
		annualRevenue = a;
	}
	
	public double getAnnualRevenue() {
		return annualRevenue;
	}
	
	public void setIsProfitMaking(boolean p) {
		isProfitMaking = p;
	}
	
	public boolean getIsProfitMaking() {
		return isProfitMaking;
	}
	
    public double getTax() {
    	double percentageRate = 10.00;
    	
    	if (!isProfitMaking)
			percentageRate = 2.00;
		
		return annualRevenue * percentageRate / 100.00;
	}
}