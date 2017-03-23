package com.ailiens.common.beans;

import java.util.List;
import java.util.Map;


public class ESQueryBean {

	private Integer from;

	private Integer size;

	private Map<String,Object> filter;

	private List<String> _source;

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Map<String, Object> getFilter() {
		return filter;
	}

	public void setFilter(Map<String, Object> filter) {
		this.filter = filter;
	}

	public List<String> get_source() {
		return _source;
	}

	public void set_source(List<String> _source) {
		this._source = _source;
	}
}
