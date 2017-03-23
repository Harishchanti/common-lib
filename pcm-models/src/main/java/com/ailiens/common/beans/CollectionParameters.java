package com.ailiens.common.beans;

import java.util.List;

public class CollectionParameters {

	private List<String> baseColors;

	private List<String> priceRange;

	private List<String> size;

	private List<String> brand;

	//cotton,silk etc.
	private List<String> fabric;

	private List<String> occasion;

	public List<String> getBaseColors() {
		return baseColors;
	}

	public void setBaseColors(List<String> baseColors) {
		this.baseColors = baseColors;
	}

	public List<String> getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(List<String> priceRange) {
		this.priceRange = priceRange;
	}

	public List<String> getSize() {
		return size;
	}

	public void setSize(List<String> size) {
		this.size = size;
	}

	public List<String> getBrand() {
		return brand;
	}

	public void setBrand(List<String> brand) {
		this.brand = brand;
	}

	public List<String> getFabric() {
		return fabric;
	}

	public void setFabric(List<String> fabric) {
		this.fabric = fabric;
	}

	public List<String> getOccasion() {
		return occasion;
	}

	public void setOccasion(List<String> occasion) {
		this.occasion = occasion;
	}


}
