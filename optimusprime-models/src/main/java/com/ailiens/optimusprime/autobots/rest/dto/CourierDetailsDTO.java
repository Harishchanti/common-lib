package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.ArrayList;
import java.util.Objects;

import javax.persistence.Entity;

public class CourierDetailsDTO {
	private long id;
	private String courierName;
	private int sourceId;
	private String courierReferenceId;
	private ArrayList<ConsignmentResponseDTO> consignments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourierName() {
		return courierName;
	}

	public void setCourierName(String courierName) {
		this.courierName = courierName;
	}

	public ArrayList<ConsignmentResponseDTO> getConsignments() {
		return consignments;
	}

	public void setConsignments(ArrayList<ConsignmentResponseDTO> consignments) {
		this.consignments = consignments;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getCourierReferenceId() {
		return courierReferenceId;
	}

	public void setCourierReferenceId(String courierReferenceId) {
		this.courierReferenceId = courierReferenceId;
	}

	public CourierDetailsDTO(int id, String courierName,String courierReferenceId,int sourceId) {
		super();
		this.id = id;
		this.courierName = courierName;
		this.courierReferenceId = courierReferenceId;
		this.sourceId = sourceId;
	}

	@Override
	public String toString() {
		return "CourierDTO [id=" + id + ", courierName=" + courierName + ", sourceId=" + sourceId
				+ ", courierReferenceId=" + courierReferenceId + "]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CourierDetailsDTO courier = (CourierDetailsDTO) o;
		return Objects.equals(id, courier.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
