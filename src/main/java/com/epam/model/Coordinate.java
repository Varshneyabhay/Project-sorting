package com.epam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coordinate {

	@Id
	@GeneratedValue
	private long id;
	/**
	 * Latitudes are horizontal lines that measures distance north or south of the equator.
	 */
	private double latitude;
	/**
	 * Longitudes are vertical lines that measure east or west of the meridian in Greenwich, England.
	 */
	private double longitude;
	
	public Coordinate() {
	}

	public Coordinate(long id, double latitude, double longitude) {
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
