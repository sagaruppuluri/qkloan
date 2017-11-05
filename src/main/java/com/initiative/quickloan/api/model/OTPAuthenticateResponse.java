package com.initiative.quickloan.api.model;

public class OTPAuthenticateResponse {

	private int status;
	private String description;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "OTPAuthenticateResponse [status=" + status + ", description=" + description + "]";
	}
}
