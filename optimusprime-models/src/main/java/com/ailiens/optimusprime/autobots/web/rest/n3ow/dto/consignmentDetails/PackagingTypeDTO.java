
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.consignmentDetails;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.OrderLine;
import com.ailiens.optimusprime.domain.SourceMetadata;

@Generated("org.jsonschema2pojo")
public class PackagingTypeDTO {

    public String name;
    public String length;
    public String breadth;
    public String height;
    public String description;
    public SourceMetadata sourceMetadata;


    public PackagingTypeDTO(OrderLine orderLine) {
    	if(orderLine.getPackagingType()!=null){
			this.setName(orderLine.getPackagingType().getPackagingTypeName());
			this.setLength(String.valueOf((orderLine.getPackagingType().getPackagingLength())));
			this.setBreadth(String.valueOf(orderLine.getPackagingType().getPackagingBreadth()));
			this.setHeight(String.valueOf(orderLine.getPackagingType().getPackagingHeight()));
			this.setDescription(orderLine.getPackagingType().getPackagingDescription());
			this.setSourceMetadata(orderLine.getConsignment().getOrders().getSourceMetadataId());
    	}
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

 public PackagingTypeDTO(){
        super();
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



	public SourceMetadata getSourceMetadata() {
		return sourceMetadata;
	}



	public void setSourceMetadata(SourceMetadata sourceMetadata) {
		this.sourceMetadata = sourceMetadata;
	}



	@Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
