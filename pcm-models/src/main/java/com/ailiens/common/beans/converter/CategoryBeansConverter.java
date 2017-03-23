package com.ailiens.common.beans.converter;


import com.ailiens.common.beans.CategoryBean;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryBeansConverter {

	public Map<String,CategoryBean> getCategoryBeanMapFromCategoryBeanList(List<CategoryBean> categoryBeans)
	{
		Map<String,CategoryBean> categoryMap = new HashMap<String,CategoryBean>();
		for(CategoryBean categoryBean : categoryBeans)
		{
			String id = categoryBean.getId();
			categoryMap.put(id, categoryBean);
		}
		return categoryMap;
	}

}
