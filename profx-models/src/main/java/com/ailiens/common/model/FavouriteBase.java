package com.ailiens.common.model;


import com.ailiens.common.model.Deserializer.FavouriteDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.io.Serializable;

/**
 * Created by vaibhav on 4/11/15.
 */
@JsonDeserialize(using = FavouriteDeserializer.class)
public class FavouriteBase implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -737679553255184192L;

}
