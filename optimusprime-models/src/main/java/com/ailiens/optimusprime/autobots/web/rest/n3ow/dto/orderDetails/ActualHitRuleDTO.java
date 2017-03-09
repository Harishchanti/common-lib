
package com.ailiens.optimusprime.autobots.web.rest.n3ow.dto.orderDetails;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.ailiens.optimusprime.domain.Discount;

@Generated("org.jsonschema2pojo")
public class ActualHitRuleDTO {

	public String id;
	public String name;

	public ActualHitRuleDTO(Discount discount) {
		this.setId(discount.getDiscountId());
		this.setName(discount.getDiscountName());
	}

	public String getId() {
		return id;
	}
	public ActualHitRuleDTO(){

	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
