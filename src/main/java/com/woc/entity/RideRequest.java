package com.woc.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "RIDEREQUEST")
@NamedQuery(name = "RideRequest.findAll", query = "SELECT r from RideRequest r")
@NamedQuery(name = "RideRequest.findById", query = "SELECT r from RideRequest r where id = ?1")
@NamedQuery(name  = "RideRequest.findByRider", query = "SELECT r from RideRequest r where riderId = ?1")
public class RideRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "rider_id", referencedColumnName = "id")
	private Rider riderId;

	@ManyToOne
	@JoinColumn(name = "driver_id", referencedColumnName = "id")
	private Driver driverId;

	@Column(name = "start_location", length = 20)
	private String startLocation;

	@Column(name = "end_location", length = 20)
	private String endLocation;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Rider getRiderId() {
		return riderId;
	}

	public void setRiderId(Rider riderId) {
		this.riderId = riderId;
	}

	public Driver getDriverId() {
		return driverId;
	}

	public void setDriverId(Driver driverId) {
		this.driverId = driverId;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
