package com.ailiens.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.common.collect.Lists;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties(ignoreUnknown = true)
public class IMSDocument {

	String skuId;
	String ean;
	String sapSkuId;
	String styleId;
	String taxClass;
	Integer quantity;
	Double mrp;
	Double grossSP;
	String ageGroup;
	String size;
	String pdpSize;
	List<String> fcsWithInventory = Lists.newArrayList();
	List<String> fcsWithActualInventory = Lists.newArrayList();


	@Singular
	List<String> promotions = Lists.newArrayList();

	@Singular
	List<FCInventory> fCInventorys = Lists.newArrayList();


	@Override
	public int hashCode() {
		return (styleId+":"+ean).hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof IMSDocument)) {
			return false;
		} else {
			IMSDocument other = (IMSDocument) o;
			if (other.getEan().equals(ean) && other.getStyleId().equals(styleId))
				return true;
            else
            	return false;
		}

	}
}
