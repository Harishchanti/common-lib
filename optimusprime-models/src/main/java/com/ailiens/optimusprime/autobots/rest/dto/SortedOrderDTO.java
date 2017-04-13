package com.ailiens.optimusprime.autobots.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class SortedOrderDTO {

	public SortedOrderDTO() {
		this.all = new ArrayList<String>();
		this.open = new ArrayList<String>();
		this.close = new ArrayList<String>();
	}

	List<String> all;

	public List<String> getAll() {
		return all;
	}
	

	public void setAll(List<String> all) {
		this.all = all;
	}

	List<String> open;

	List<String> close;

	public List<String> getOpen() {
		return open;
	}

	public void setOpen(List<String> open) {
		this.open = open;
	}

	public List<String> getClose() {
		return close;
	}

	public void setClose(List<String> close) {
		this.close = close;
	}
}
