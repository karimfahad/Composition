package com.challenge.Composition;

public class PC {
	
	private Motherboard motherboard;
	private Monitor monitor;
	private Case thecase;
	
	
	public PC(Motherboard motherboard, Monitor monitor, Case thecase) {
		this.motherboard = motherboard;
		this.monitor = monitor;
		this.thecase = thecase;
	}
	
	public void powerUp() {
		thecase.pressPowerButton();
		drawLogo();
	}

	private void drawLogo() {
		monitor.drawPixelAt(1200, 50, "yellow");
	}

	/*public Motherboard getMotherboard() {
		return motherboard;
	}


	public Monitor getMonitor() {
		return monitor;
	}


	public Case getThecase() {
		return thecase;
	}*/
	
	

}
