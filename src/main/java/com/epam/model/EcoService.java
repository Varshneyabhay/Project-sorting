package com.epam.model;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EcoService {

	@Id
	@GeneratedValue
	private long id;
	private String serviceName;
	@ElementCollection(targetClass = WasteType.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<WasteType> typeOfWastes;
	@ElementCollection(targetClass = PaymentCondition.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<PaymentCondition> paymentConditions;
	@ElementCollection(targetClass = DeliveryOption.class, fetch = FetchType.EAGER)
	@Enumerated(EnumType.STRING)
	private Set<DeliveryOption> deliveryOptions;
	@OneToOne
	private Coordinate coordinate;
	
	public EcoService() {
	}

	public EcoService(long id, String serviceName, Set<WasteType> typeOfWastes,
			Set<PaymentCondition> paymentConditions, Set<DeliveryOption> deliveryOptions, Coordinate coordinate) {
		this.id = id;
		this.serviceName = serviceName;
		this.typeOfWastes = typeOfWastes;
		this.paymentConditions = paymentConditions;
		this.deliveryOptions = deliveryOptions;
		this.coordinate = coordinate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Set<WasteType> getTypeOfWastes() {
		return typeOfWastes;
	}

	public void setTypeOfWastes(Set<WasteType> typeOfWastes) {
		this.typeOfWastes = typeOfWastes;
	}

	public Set<PaymentCondition> getPaymentConditions() {
		return paymentConditions;
	}

	public void setPaymentConditions(Set<PaymentCondition> paymentConditions) {
		this.paymentConditions = paymentConditions;
	}

	public Set<DeliveryOption> getDeliveryOptions() {
		return deliveryOptions;
	}

	public void setDeliveryOptions(Set<DeliveryOption> deliveryOptions) {
		this.deliveryOptions = deliveryOptions;
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
}
