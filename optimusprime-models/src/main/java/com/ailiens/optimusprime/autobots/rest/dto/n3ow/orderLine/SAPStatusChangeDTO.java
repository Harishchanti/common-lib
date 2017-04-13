package com.ailiens.optimusprime.autobots.rest.dto.n3ow.orderLine;

/**
 * Created by shirish on 14/1/16.
 */
public class SAPStatusChangeDTO {

	private String fullfilment_cat;

	private String status;

	private String hu_code;

	private String sales_order_no;

	private String entity;

	public String getFullfilment_cat() {
		return fullfilment_cat;
	}
	public SAPStatusChangeDTO(){

	}

	public void setFullfilment_cat(String fullfilment_cat) {
		this.fullfilment_cat = fullfilment_cat;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHu_code() {
		return hu_code;
	}

	public void setHu_code(String hu_code) {
		this.hu_code = hu_code;
	}

	public String getSales_order_no() {
		return sales_order_no;
	}

	public void setSales_order_no(String sales_order_no) {
		this.sales_order_no = sales_order_no;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	@Override
	public String toString() {
		return "SAPStatusChangeDTO{" +
				"fullfilment_cat='" + fullfilment_cat + '\'' +
				", status='" + status + '\'' +
				", hu_code='" + hu_code + '\'' +
				", sales_order_no='" + sales_order_no + '\'' +
				", entity='" + entity + '\'' +
				'}';
	}
}
