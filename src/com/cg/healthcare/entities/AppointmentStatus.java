package com.cg.healthcare.entities;

public enum AppointmentStatus {

	approved("approved"),cancelled("cancelled");
	AppointmentStatus(String status ) {
		
		this.setStatus(status);
	}
	private String status;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
