package com.ailiens.optimusprime.autobots.rest.dto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

public class CustomPageDTO {
	private List<CustomContentDTO> content;
	private boolean last;
	private Long totalElements;
	private int totalPages;
	private int size;
	private int number;
	private Sort sort;
	private boolean first;
	private int numberOfElements;

	public CustomPageDTO(Page page) {
		this.totalElements = page.getTotalElements();
		this.totalPages = page.getTotalPages();
		this.number = page.getNumber();
		this.numberOfElements = page.getNumberOfElements();
		this.number = page.getNumber();
		this.size = page.getSize();
		this.sort = page.getSort();
	}

	public CustomPageDTO(){

	}
	public List<CustomContentDTO> getContent() {
		return content;
	}

	public void setContent(List<CustomContentDTO> content) {
		this.content = content;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	@Override
	public String toString() {
		return "CustomPageDTO{" +
				"content=" + content +
				", last=" + last +
				", totalElements=" + totalElements +
				", totalPages=" + totalPages +
				", size=" + size +
				", number=" + number +
				", sort=" + sort +
				", first=" + first +
				", numberOfElements=" + numberOfElements +
				'}';
	}
}
