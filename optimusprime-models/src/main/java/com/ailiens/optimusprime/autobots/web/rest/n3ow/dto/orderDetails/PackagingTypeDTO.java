
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import com.ailiens.optimusprime.domain.OrderLine;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class PackagingTypeDTO {

    public String name;
    public String length;
    public String breadth;
    public String height;
    public String description;



    public PackagingTypeDTO(OrderLine orderLine) {
    	if(orderLine.getPackagingType()!=null){
			this.setName(orderLine.getPackagingType().getPackagingTypeName());
			this.setLength(String.valueOf((orderLine.getPackagingType().getPackagingLength())));
			this.setBreadth(String.valueOf(orderLine.getPackagingType().getPackagingBreadth()));
			this.setHeight(String.valueOf(orderLine.getPackagingType().getPackagingHeight()));
			this.setDescription(orderLine.getPackagingType().getPackagingDescription());
    	}
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLength() {
		return length;
	}



	public void setLength(String length) {
		this.length = length;
	}



	public String getBreadth() {
		return breadth;
	}



	public void setBreadth(String breadth) {
		this.breadth = breadth;
	}



	public String getHeight() {
		return height;
	}



	public void setHeight(String height) {
		this.height = height;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
