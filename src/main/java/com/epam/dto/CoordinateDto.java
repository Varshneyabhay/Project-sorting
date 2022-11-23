package com.epam.dto;

public class CoordinateDto {

	long id;
	double latitude;
	double longitude;
	
	public CoordinateDto() {
	}

	public CoordinateDto(long id, double latitude, double longitude) {
		this.id = id;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
}
